package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.api.chemical.slurry.Slurry;
import mekanism.api.chemical.slurry.SlurryBuilder;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.awt.Color;

public class SlurriesInit {

    public static final DeferredRegister<Slurry> SLURRIES = DeferredRegister.create(Slurry.class, Main.MOD_ID);

    public static final RegistryObject<Slurry>[] URANIUM_TETRAFLUORIDE = createSlurry("uranium_tetrafluoride", new Color(0, 255, 45), Tag.empty());

    @SuppressWarnings("unchecked")
    public static RegistryObject<Slurry>[] createSlurry(String name, Color color, Tag<Item> tag){

        RegistryObject<Slurry> cleanSlurry = SLURRIES.register("clean_" + name.toLowerCase(), () -> new Slurry(SlurryBuilder.clean().color(color.getRGB()).ore(tag)));
        RegistryObject<Slurry> dirtySlurry = SLURRIES.register("dirty_" + name.toLowerCase(), () -> new Slurry(SlurryBuilder.dirty().color(color.getRGB()).ore(tag)));
        return new RegistryObject[]{cleanSlurry, dirtySlurry};
    }
}
