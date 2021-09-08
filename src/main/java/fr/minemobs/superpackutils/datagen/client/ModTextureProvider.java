package fr.minemobs.superpackutils.datagen.client;

import fr.minemobs.superpackutils.init.BlockInit;
import fr.minemobs.superpackutils.init.ItemInit;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.blocks.WallTinyTorch;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import java.io.IOException;
import java.util.stream.Collectors;

public class ModTextureProvider extends TextureProvider {

        public ModTextureProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
            super(gen, existingFileHelper);
        }

        @Override
        public void registerTextures() throws IOException {
            addBlocks();
            addItems();
        }

        private void addItems() throws IOException {
            for (RegistryObject<Item> entry : ItemInit.ITEMS.getEntries().stream()
                    .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof TinyTorchItem)).collect(Collectors.toList())) {
                String sRegistryName = entry.get().getRegistryName().toString().replace("superpackutils:", "");

                try{
                    getTexture(modLoc("item/" + sRegistryName));
                }catch (IOException ex){
                    this.textures.put(genLoc("item/" + sRegistryName), getTexture(modLoc("block/placeholder")));
                }
            }
        }

        private void addBlocks() throws IOException {
            for (RegistryObject<Block> entry : BlockInit.BLOCKS.getEntries().stream()
                    .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof TinyTorch)).filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof WallTinyTorch))
                    .collect(Collectors.toList())) {
                String sRegistryName = entry.get().getRegistryName().toString().replace("superpackutils:", "");

                try {
                    getTexture(modLoc("block/" + sRegistryName));
                }catch (IOException ex){
                    this.textures.put(genLoc("block/" + sRegistryName), getTexture(modLoc("block/placeholder")));
                }
            }
        }
}
