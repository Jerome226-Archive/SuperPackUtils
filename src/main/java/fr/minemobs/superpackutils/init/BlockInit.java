package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.blocks.BrokenSpawner;
import fr.minemobs.superpackutils.objects.blocks.RedstoneClock;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.blocks.WallTinyTorch;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Locale;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    //Specials Blocks
    public static final RegistryObject<Block> TINY_TORCH = BLOCKS.register("tiny_torch",
            () -> new TinyTorch(Block.Properties.of(Material.DECORATION).noCollission().instabreak()
                    .lightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> REDSTONE_CLOCK = registerBlock("redstone_clock", new RedstoneClock());

    public static final RegistryObject<Block> WALL_TINY_TORCH = BLOCKS.register("wall_tiny_torch",
            () -> new WallTinyTorch(Block.Properties.of(Material.DECORATION).noCollission().instabreak()
                    .lightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE = registerBlock("deepslate",
            AbstractBlock.Properties.copy(Blocks.STONE).strength(0.75F, 3.0F).harvestTool(ToolType.PICKAXE).harvestLevel(4));

    //Blocks
    public static final RegistryObject<Block> DIMENSIONAL_STONE = registerBlock("dimensional_stone", AbstractBlock.Properties.copy(Blocks.IRON_ORE));
    public static final RegistryObject<Block> DYINGROCK = registerBlock("dyingrock");
    public static final RegistryObject<Block> INDUSTRIAL_SAND = registerBlock("industrial_sand", AbstractBlock.Properties.copy(Blocks.SAND));
    public static final RegistryObject<Block> ELECTRICAL_GLASS_BLOCK = registerBlock("electrical_glass_block", new GlassBlock(AbstractBlock.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> NETHERCOTTA_BRICKS = registerBlock("nethercotta_bricks", AbstractBlock.Properties.copy(Blocks.BRICKS));

    //Casing
    public static final RegistryObject<Block> REINFORCED_MACHINE_FRAME = registerBlock("reinforced_machine_frame", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> BIG_STEEL_CASING = registerBlock("big_steel_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> INSCRIBER_CASING = registerBlock("inscriber_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> INFUSER_CASING = registerBlock("infuser_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> METALLURGIC_CASING = registerBlock("metallurgic_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> IMPROVED_METALLURGIC_CASING = registerBlock("improved_metallurgic_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> ASSEMBLER_FRAME = registerBlock("assembler_frame", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> MIXER_CASING = registerBlock("mixer_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> CHEMICAL_REACTOR_CASING = registerBlock("chemical_reactor_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> WASHER_CASING = registerBlock("washer_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> ADVANCED_MIXER_CASING = registerBlock("advanced_mixer_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> COMPACTER_CASING = registerBlock("compacter_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> ALLOYER_CASING = registerBlock("alloyer_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> ELECTRIC_BLAST_FURNACE_CASING = registerBlock("electric_blast_furnace_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> PRIMITIVE_ASSEMBLER_FRAME = registerBlock("primitive_assembler_frame", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> INDUCTION_FABRICATOR_CASING = registerBlock("induction_fabricator_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> SUPERCOOLER_CASING = registerBlock("supercooler_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));

    //Platinum Ore
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore");

    //Ore Blocks
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> CUPRONICKEL_BLOCK = registerBlock("cupronickel_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> MYTHRIL_BLOCK = registerBlock("mythril_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> EPOXY_ROSIN_BLOCK = registerBlock("epoxy_rosin_block", AbstractBlock.Properties.copy(Blocks.HONEY_BLOCK));
    public static final RegistryObject<Block> DARK_STEEL_BLOCK = registerBlock("dark_steel_block", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> MANGANESE_BLOCK = registerBlock("manganese_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> TETRAETHYL_LEAD_BLOCK = registerBlock("tetraethyl_lead_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> ENERGETIC_ALLOY_BLOCK = registerBlock("energetic_alloy_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> VIBRANT_ALLOY_BLOCK = registerBlock("vibrant_alloy_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> ANTIMONY_BLOCK = registerBlock("antimony_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> OSMIRIDIUM_BLOCK = registerBlock("osmiridium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> NEODYMIUM_BLOCK = registerBlock("neodymium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = registerBlock("beryllium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> CERTUS_QUARTZ_BLOCK = registerBlock("certus_quartz_block", AbstractBlock.Properties.copy(Blocks.QUARTZ_BLOCK));
    public static final RegistryObject<Block> ZIRCONIUM_BLOCK = registerBlock("zirconium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> REFINED_REDSTONE_BLOCK = registerBlock("refined_redstone_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> INDIUM_BLOCK = registerBlock("indium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> ENRICHED_URANIUM_BLOCK = registerBlock("enriched_uranium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> GALLIUM_BLOCK = registerBlock("gallium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> SOULARIUM_BLOCK = registerBlock("soularium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> PALLADIUM_BLOCK = registerBlock("palladium_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> CHROME_BLOCK = registerBlock("chrome_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));

    //Ore Sand
    public static final RegistryObject<Block> SEDIMENTARY_EXHALATIVE_SAND = registerBlock("sedimentary_exhalative_sand", AbstractBlock.Properties.copy(Blocks.SAND));
    public static final RegistryObject<Block> GREISEN_SAND = registerBlock("greisen_sand", AbstractBlock.Properties.copy(Blocks.SAND));
    public static final RegistryObject<Block> ULTRAMAFIC_SAND = registerBlock("ultramafic_sand", AbstractBlock.Properties.copy(Blocks.SAND));
    public static final RegistryObject<Block> PORPHYRY_SAND = registerBlock("porphyry_sand", AbstractBlock.Properties.copy(Blocks.SAND));
    public static final RegistryObject<Block> MANA_SAND = registerBlock("mana_sand", AbstractBlock.Properties.copy(Blocks.SAND));
    public static final RegistryObject<Block> MAGICAL_DUST = registerBlock("magical_dust", AbstractBlock.Properties.copy(Blocks.SAND));

    //Raw Ore Block
    public static final RegistryObject<Block> RAW_IRON_BLOCK = registerBlock("raw_iron_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK = registerBlock("raw_gold_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = registerBlock("raw_copper_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_CHROME_BLOCK = registerBlock("raw_chrome_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_VANADIUM_BLOCK = registerBlock("raw_vanadium_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_MAGNESIUM_BLOCK = registerBlock("raw_magnesium_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_FERROCHROME_BLOCK = registerBlock("raw_ferrochrome_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_GALLIUM_BLOCK = registerBlock("raw_gallium_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_PALLADIUM_BLOCK = registerBlock("raw_palladium_block", AbstractBlock.Properties.copy(Blocks.STONE));
    public static final RegistryObject<Block> RAW_BERYLLIUM_BLOCK = registerBlock("raw_beryllium_block", AbstractBlock.Properties.copy(Blocks.STONE));

    //Decoration Block
    public static final RegistryObject<Block> CERTUS_QUARTZ_BRICKS = registerBlock("certus_quartz_bricks", AbstractBlock.Properties.copy(Blocks.QUARTZ_BRICKS));
    public static final RegistryObject<Block> CERTUS_QUARTZ_PILLAR = registerBlock("certus_quartz_pillar", AbstractBlock.Properties.copy(Blocks.QUARTZ_PILLAR));
    public static final RegistryObject<Block> CHISELED_CERTUS_QUARTZ_BLOCK = registerBlock("chiseled_certus_quartz_block", AbstractBlock.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final RegistryObject<Block> SMOOTH_CERTUS_QUARTZ = registerBlock("smooth_certus_quartz", AbstractBlock.Properties.copy(Blocks.SMOOTH_QUARTZ));

    //Other
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian", AbstractBlock.Properties.copy(Blocks.OBSIDIAN));
    public static final RegistryObject<Block> SMELTERY_ASSEMBLY = registerBlock("smeltery_assembly", AbstractBlock.Properties.copy(Blocks.STONE_BRICKS));
    public static final RegistryObject<Block> MAGMATIC_ROCK = registerBlock("magmatic_rock", AbstractBlock.Properties.copy(Blocks.MAGMA_BLOCK));

    //Spawner
    public static final RegistryObject<Block> BLIZZ_SPAWNER = registerBlock("blizz_spawner", new BrokenSpawner(new ResourceLocation("thermal", "blizz")));
    public static final RegistryObject<Block> BLITZ_SPAWNER = registerBlock("blitz_spawner", new BrokenSpawner(new ResourceLocation("thermal", "blitz")));
    public static final RegistryObject<Block> BASALZ_SPAWNER = registerBlock("basalz_spawner", new BrokenSpawner(new ResourceLocation("thermal", "basalz")));
    //public static final RegistryObject<Block> BLAZE_SPAWNER = registerBlock("blaze_spawner", new BrokenSpawner(new ResourceLocation("blaze")));

    //Register functions

    private static RegistryObject<Block> registerBlock(String name) {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT).replaceAll(" ","_"), () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    }

    private static RegistryObject<Block> registerBlock(String name, Block.Properties properties) {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT).replaceAll(" ","_"), () -> new Block(properties));
    }

    private static RegistryObject<Block> registerBlock(String name, Block block) {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT).replaceAll(" ","_"), () -> block);
    }
}
