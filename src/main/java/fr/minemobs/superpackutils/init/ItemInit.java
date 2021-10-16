package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.blocks.AbstractItem;
import fr.minemobs.superpackutils.objects.blocks.DestroyerOfTheNature;
import fr.minemobs.superpackutils.objects.items.TinyCoalItem;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import fr.minemobs.superpackutils.objects.items.foods.Bread;
import fr.minemobs.superpackutils.utils.helper.KeyboardHelper;
import mekanism.api.chemical.infuse.InfuseType;
import mekanism.api.chemical.slurry.Slurry;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.Tag;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.awt.Color;
import java.util.List;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);


    //NC Gem
    public static final RegistryObject<Item> CAROBBIITE = ITEMS.register("carobbiite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CAROBBIITE_DUST = ITEMS.register("carobbiite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_NITRIDE = ITEMS.register("boron_nitride", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_NITRIDE_DUST = ITEMS.register("boron_nitride_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RHODOCHROSITE = ITEMS.register("rhodochrosite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RHODOCHROSITE_DUST = ITEMS.register("rhodochrosite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VILLIAUMITE = ITEMS.register("villiaumite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VILLIAUMITE_DUST = ITEMS.register("villiaumite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_ARSENIDE = ITEMS.register("boron_arsenide", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_ARSENIDE_DUST = ITEMS.register("boron_arsenide_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_SHARD = ITEMS.register("amethyst_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Gem
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OPAL_DUST = ITEMS.register("opal_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TOPAZ_DUST = ITEMS.register("topaz_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OLIVINE = ITEMS.register("olivine", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OLIVINE_DUST = ITEMS.register("olivine_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TANZANITE_DUST = ITEMS.register("tanzanite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SUNSTONE_DUST = ITEMS.register("sunstone_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HYDROXYAPATITE = ITEMS.register("hydroxyapatite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HYDROXYAPATITE_DUST = ITEMS.register("hydroxyapatite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FLUOROAPATITE = ITEMS.register("fluoroapatite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FLUOROAPATITE_DUST = ITEMS.register("fluoroapatite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHLORAPATITE = ITEMS.register("chlorapatite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHLORAPATITE_DUST = ITEMS.register("chlorapatite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HYDROGEN_SULFIDE_ITEM = ITEMS.register("hydrogen_sulfide_item", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HYDROGEN_SULFIDE_DUST = ITEMS.register("hydrogen_sulfide_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Polished
    public static final RegistryObject<Item> POLISHED_QUARTZ = ITEMS.register("polished_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLISHED_CERTUS_QUARTZ = ITEMS.register("polished_certus_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLISHED_MANA_QUARTZ = ITEMS.register("polished_mana_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CASING = ITEMS.register("advanced_casing", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Enriched
    public static final RegistryObject<Item> ENRICHED_PETCOKE = ITEMS.register("enriched_petcoke", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_SLIME = ITEMS.register("enriched_slime", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_SKYSLIME = ITEMS.register("enriched_skyslime", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_BLOOD = ITEMS.register("enriched_blood", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_ICHOR = ITEMS.register("enriched_ichor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_ENDERSLIME = ITEMS.register("enriched_enderslime", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Nugget
    public static final RegistryObject<Item> ENDER_PEARL_NUGGET = ITEMS.register("ender_pearl_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Dust
    public static final RegistryObject<Item> BEDROCK_DUST = ITEMS.register("bedrock_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ANDESITE_DUST = ITEMS.register("andesite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DARK_SCORIA_DUST = ITEMS.register("dark_scoria_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DIORITE_DUST = ITEMS.register("diorite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DOLOMITE_DUST = ITEMS.register("dolomite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GABBRO_DUST = ITEMS.register("gabbro_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GRANITE_DUST = ITEMS.register("granite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LIMESTONE_DUST = ITEMS.register("limestone_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SCORIA_DUST = ITEMS.register("scoria_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> WEATHERED_LIMESTONE_DUST = ITEMS.register("weathered_limestone_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MARBLE_DUST = ITEMS.register("marble_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Blend
    public static final RegistryObject<Item> QUARTZ_ENRICHED_BLEND = ITEMS.register("quartz_enriched_blend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CUPRONICKEL_BLEND = ITEMS.register("cupronickel_blend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Slag
    public static final RegistryObject<Item> RICH_SLAG_ALLOY = ITEMS.register("rich_slag_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SLAG_ALLOY = ITEMS.register("slag_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> DARK_SLAG = ITEMS.register("dark_slag", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DARK_SLAG_ALLOY = ITEMS.register("dark_slag_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Control Circuits Componement
    public static final RegistryObject<Item> PRIMITIVE_DIODE = ITEMS.register("primitive_diode", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRIMITIVE_TRANSISTOR = ITEMS.register("primitive_transistor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRIMITIVE_RESISTOR = ITEMS.register("primitive_resistor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> DIODE = ITEMS.register("diode", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TRANSISTOR = ITEMS.register("transistor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RESISTOR = ITEMS.register("resistor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> ADVANCED_DIODE = ITEMS.register("advanced_diode", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_TRANSISTOR = ITEMS.register("advanced_transistor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_RESISTOR = ITEMS.register("advanced_resistor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Plastic
    public static final RegistryObject<Item> ABS_SHEET = ITEMS.register("abs_sheet", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ABS_PELLET = ITEMS.register("abs_pellet", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYSTYRENE_BAR = ITEMS.register("polystyrene_bar", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PVC_SHEET = ITEMS.register("pvc_sheet", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PVC_PELLET = ITEMS.register("pvc_pellet", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Bimetal Gear
    public static final RegistryObject<Item> ENERGETIC_BIMETAL_GEAR = ITEMS.register("energetic_bimetal_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_BIMETAL_GEAR = ITEMS.register("vibrant_bimetal_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Sawdust
    public static final RegistryObject<Item> BLOODY_SAWDUST = ITEMS.register("bloody_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GRASSY_SAWDUST = ITEMS.register("grassy_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AZURE_SAWDUST = ITEMS.register("azure_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Pigment
    public static final RegistryObject<Item> BLOODY_PIGMENT = ITEMS.register("bloody_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GRASSY_PIGMENT = ITEMS.register("grassy_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AZURE_PIGMENT = ITEMS.register("azure_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Processor
    public static final RegistryObject<Item> ENERGETIC_PROCESSOR = ITEMS.register("energetic_processor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_PROCESSOR = ITEMS.register("vibrant_processor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Wire
    public static final RegistryObject<Item> REDSTONE_WIRE = ITEMS.register("redstone_wire", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Combusting Circuit & Alloy
    public static final RegistryObject<Item> INDUCTIVE_CONTROL_CIRCUIT = ITEMS.register("inductive_control_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COMBUSTING_ALLOY = ITEMS.register("combusting_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BASIC_ALLOY = ITEMS.register("basic_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CORE_ALLOY = ITEMS.register("core_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRIMITIVE_CONTROL_CIRCUIT = ITEMS.register("primitive_control_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Circuit
    public static final RegistryObject<Item> PRIMITIVE_CIRCUIT_ASSEMBLY = ITEMS.register("primitive_circuit_assembly", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BASIC_CIRCUIT_ASSEMBLY = ITEMS.register("basic_circuit_assembly", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CIRCUIT_ASSEMBLY = ITEMS.register("advanced_circuit_assembly", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELITE_CIRCUIT_ASSEMBLY = ITEMS.register("elite_circuit_assembly", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INDUCTIVE_CIRCUIT_ASSEMBLY = ITEMS.register("inductive_circuit_assembly", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ULTIMATE_CIRCUIT_ASSEMBLY = ITEMS.register("ultimate_circuit_assembly", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Cast
    public static final RegistryObject<Item> CHILLER_NUGGET_CAST = ITEMS.register("chiller_nugget_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_GEAR_CAST = ITEMS.register("chiller_gear_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_PLATE_CAST = ITEMS.register("chiller_plate_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_COIN_CAST = ITEMS.register("chiller_coin_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Capacitor
    public static final RegistryObject<Item> REINFORCED_CAPACITOR = ITEMS.register("reinforced_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STURDY_CAPACITOR = ITEMS.register("sturdy_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DOUBLELAYERED_CAPACITOR = ITEMS.register("doublelayered_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRESSURIZED_CAPACITOR = ITEMS.register("pressurized_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_SOLENOID = ITEMS.register("copper_solenoid", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Circuit
    public static final RegistryObject<Item> BASIC_CIRCUIT = ITEMS.register("basic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> IMPROVED_CIRCUIT = ITEMS.register("improved_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CIRCUIT = ITEMS.register("advanced_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> WITHERING_CIRCUIT = ITEMS.register("withering_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Logic Circuit
    public static final RegistryObject<Item> BASIC_LOGIC_CIRCUIT = ITEMS.register("basic_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INCOMPLETE_BASIC_LOGIC_CIRCUIT = ITEMS.register("incomplete_basic_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> IMPROVED_LOGIC_CIRCUIT = ITEMS.register("improved_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INCOMPLETE_IMPROVED_LOGIC_CIRCUIT = ITEMS.register("incomplete_improved_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_LOGIC_CIRCUIT = ITEMS.register("advanced_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INCOMPLETE_ADVANCED_LOGIC_CIRCUIT = ITEMS.register("incomplete_advanced_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> WITHERING_LOGIC_CIRCUIT = ITEMS.register("withering_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INCOMPLETE_WITHERING_LOGIC_CIRCUIT = ITEMS.register("incomplete_withering_logic_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Soulstone
    public static final RegistryObject<Item> SMALL_SOULSTONE = ITEMS.register("small_soulstone", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MEDIUM_SOULSTONE = ITEMS.register("medium_soulstone", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LARGE_SOULSTONE = ITEMS.register("large_soulstone", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHARGED_SOULSTONE = ITEMS.register("charged_soulstone", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Coal
    public static final RegistryObject<Item> CARBON_FIBERS = ITEMS.register("carbon_fibers", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COMBINED_CARBON_FIBERS = ITEMS.register("combined_carbon_fibers", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CARBON_PLATE = ITEMS.register("carbon_plate", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Plastic
    public static final RegistryObject<Item> PLASTIC_BOARD = ITEMS.register("plastic_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BIO_CONTROLLER = ITEMS.register("bio_controller", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BIO_PLASTIC = ITEMS.register("bio_plastic", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BIO_PLASTIC_BOARD = ITEMS.register("bio_plastic_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> POLYCAPROLACTAM_CONTROLLER = ITEMS.register("polycaprolactam_controller", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYCAPROLACTAM_PLASTIC = ITEMS.register("polycaprolactam_plastic", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYCAPROLACTAM_PLASTIC_BOARD = ITEMS.register("polycaprolactam_plastic_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> POLYCARBONATE_CONTROLLER = ITEMS.register("polycarbonate_controller", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYCARBONATE_PLASTIC = ITEMS.register("polycarbonate_plastic", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYCARBONATE_PLASTIC_BOARD = ITEMS.register("polycarbonate_plastic_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> FLUORO_CONTROLLER = ITEMS.register("fluoro_controller", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FLUORO_PLASTIC = ITEMS.register("fluoro_plastic", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FLUORO_PLASTIC_BOARD = ITEMS.register("fluoro_plastic_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Silicon
    public static final RegistryObject<Item> SILICON_BOARD = ITEMS.register("silicon_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRINTED_SILICON_BOARD = ITEMS.register("printed_silicon_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> GLOWING_SILICON_BOARD = ITEMS.register("glowing_silicon_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRINTED_GLOWING_SILICON_BOARD = ITEMS.register("printed_glowing_silicon_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GLOWING_SILICON = ITEMS.register("glowing_silicon", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GLOWING_SILICON_BOULE = ITEMS.register("glowing_silicon_boule", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> FERVID_SILICON_BOARD = ITEMS.register("fervid_silicon_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRINTED_FERVID_SILICON_BOARD = ITEMS.register("printed_fervid_silicon_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FERVID_SILICON = ITEMS.register("fervid_silicon", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FERVID_SILICON_BOULE = ITEMS.register("fervid_silicon_boule", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //ae2 ripoff
    public static final RegistryObject<Item> QUARTZ_SEED_1 = ITEMS.register("quartz_seed_1", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_SEED_2 = ITEMS.register("quartz_seed_2", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> QUARTZ_SEED_3 = ITEMS.register("quartz_seed_3", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_QUARTZ = ITEMS.register("purified_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CERTUS_QUARTZ = ITEMS.register("certus_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CERTUS_QUARTZ_SEED_1 = ITEMS.register("certus_quartz_seed_1", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CERTUS_QUARTZ_SEED_2 = ITEMS.register("certus_quartz_seed_2", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CERTUS_QUARTZ_SEED_3 = ITEMS.register("certus_quartz_seed_3", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CERTUS_QUARTZ = ITEMS.register("purified_certus_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHARGED_CERTUS_QUARTZ = ITEMS.register("charged_certus_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Bioblend
    public static final RegistryObject<Item> BIOMASS = ITEMS.register("biomass", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PULPED_BIOBLEND = ITEMS.register("pulped_bioblend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RICH_BIOBLEND = ITEMS.register("rich_bioblend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Geode
    public static final RegistryObject<Item> GEODE = ITEMS.register("geode", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DIMENSIONAL_GEODE = ITEMS.register("dimensional_geode", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RESONANT_CLATHRATE = ITEMS.register("resonant_clathrate", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENERGIZED_CLATHRATE = ITEMS.register("energized_clathrate", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DESTABILIZED_CLATHRATE = ITEMS.register("destabilized_clathrate", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Crystals for Rune
    public static final RegistryObject<Item> ENVY_CRYSTAL_SHARD = ITEMS.register("envy_crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENVY_CRYSTAL = ITEMS.register("envy_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PRIDE_CRYSTAL_SHARD = ITEMS.register("pride_crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRIDE_CRYSTAL = ITEMS.register("pride_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> GLUTTONY_CRYSTAL_SHARD = ITEMS.register("gluttony_crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GLUTTONY_CRYSTAL = ITEMS.register("gluttony_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SLOTH_CRYSTAL_SHARD = ITEMS.register("sloth_crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SLOTH_CRYSTAL = ITEMS.register("sloth_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> GREED_CRYSTAL_SHARD = ITEMS.register("greed_crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GREED_CRYSTAL = ITEMS.register("greed_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> WRATH_CRYSTAL_SHARD = ITEMS.register("wrath_crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> WRATH_CRYSTAL = ITEMS.register("wrath_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> LUST_CRYSTAL_SHARD = ITEMS.register("lust_crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LUST_CRYSTAL = ITEMS.register("lust_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Mechanisms Base
    public static final RegistryObject<Item> IRON_MECHANISMS_BASE = ITEMS.register("iron_mechanisms_base", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_MECHANISMS_BASE = ITEMS.register("steel_mechanisms_base", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BRASS_MECHANISMS_BASE = ITEMS.register("brass_mechanisms_base", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Circuit Backplane
    public static final RegistryObject<Item> COATED_CIRCUIT_BOARD = ITEMS.register("coated_circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COATED_CIRCUIT_BOARD_BACKLANE = ITEMS.register("coated_circuit_board_backplane", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BASIC_CIRCUIT_BOARD = ITEMS.register("basic_circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BASIC_CIRCUIT_BOARD_BACKPLANE = ITEMS.register("basic_circuit_board_backplane", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CIRCUIT_BOARD = ITEMS.register("advanced_circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CIRCUIT_BOARD_BACKPLANE = ITEMS.register("advanced_circuit_board_backplane", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELITE_CIRCUIT_BOARD = ITEMS.register("elite_circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELITE_CIRCUIT_BOARD_BACKPLANE = ITEMS.register("elite_circuit_board_backplane", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INDUCTIVE_CIRCUIT_BOARD = ITEMS.register("inductive_circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INDUCTIVE_CIRCUIT_BOARD_BACKPLANE = ITEMS.register("inductive_circuit_board_backplane", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ULTIMATE_CIRCUIT_BOARD = ITEMS.register("ultimate_circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ULTIMATE_CIRCUIT_BOARD_BACKPLANE = ITEMS.register("ultimate_circuit_board_backplane", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Food
    public static final RegistryObject<Item> TATER_TOT = ITEMS.register("tater_tot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)
            .food(new Food.Builder()
                    .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 200, 2), 1.0f).fast().nutrition(2).saturationMod(0.2f)
                    .alwaysEat().build())));

    //Other
    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TINY_MOON = ITEMS.register("tiny_moon", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_CARBON_BRICK = ITEMS.register("enriched_carbon_brick", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RADIOACTIVE_FABRIC = ITEMS.register("radioactive_fabric", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CALCIUM_CARBURE = ITEMS.register("calcium_carbure", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> EPOXY_SLAG = ITEMS.register("epoxy_slag", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELEMENTAL_GEM = ITEMS.register("elemental_gem", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> EPOXY_ROSIN = ITEMS.register("epoxy_rosin", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PYROTHEUM_DUST = ITEMS.register("pyrotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CRYOTHEUM_DUST = ITEMS.register("cryotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PETROTHEUM_DUST = ITEMS.register("petrotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AEROTHEUM_DUST = ITEMS.register("aerotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MANGANESE_OXIDE = ITEMS.register("manganese_oxide", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ROCK = ITEMS.register("rock", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORAX_PULP = ITEMS.register("borax_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ARSENIC_PULP = ITEMS.register("arsenic_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SODIUM_PULP = ITEMS.register("sodium_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SODIUM_HYDROXIDE_PULP = ITEMS.register("sodium_hydroxide_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SODIUM_FLUORIDE_PULP = ITEMS.register("sodium_fluoride_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POTASSIUM_PULP = ITEMS.register("potassium_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POTASSIUM_FLUORIDE_PULP = ITEMS.register("potassium_fluoride_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POTASSIUM_HYDROXIDE_PULP = ITEMS.register("potassium_hydroxide_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BLOOD_CRYSTAL = ITEMS.register("blood_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BLANK_TIER_INSTALLER = ITEMS.register("blank_tier_installer", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NAND_CHIP = ITEMS.register("nand_chip", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NOR_CHIP = ITEMS.register("nor_chip", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYDIMETHYLSILOXANE_PULP = ITEMS.register("polydimethylsiloxane_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYTETRAFLUROETHYLENE_PULP = ITEMS.register("polytetrafluoroethylene_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CALCIUM_SULFATE_PULP = ITEMS.register("calcium_sulfate_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TALC_PULP = ITEMS.register("talc_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_POWDER = ITEMS.register("alchemical_powder", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HEATING_ELEMENT = ITEMS.register("heating_element", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ULTIMATE_RUNE = ITEMS.register("ultimate_rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> WEIRD_FUNGU = ITEMS.register("weird_fungu", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STARLIGHT_STICK = ITEMS.register("starlight_stick", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RUNE = ITEMS.register("rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SLIME_BOTTLE = ITEMS.register("slime_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SKYSLIME_BOTTLE = ITEMS.register("skyslime_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BLOOD_BOTTLE = ITEMS.register("blood_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new TinyCoalItem(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STARLIGHT_SHARD = ITEMS.register("starlight_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_PEARL = ITEMS.register("starlight_infused_mana_pearl", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_DIAMOND = ITEMS.register("starlight_infused_mana_diamond", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> INTEGRATED_CIRCUIT = ITEMS.register("integrated_circuit", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLOUGH = ITEMS.register("plough", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HARVESTING_WHEEL = ITEMS.register("harvesting_wheel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DESTROYER_OF_THE_NATURE = ITEMS.register("destroyer_of_the_nature", DestroyerOfTheNature::new);
    public static final RegistryObject<Item> RESONATING_COIL = ITEMS.register("resonating_coil", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BLAZE_ASHES = ITEMS.register("blaze_ashes", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DATA_CORE = ITEMS.register("data_core", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RARE_EARTH = ITEMS.register("rare_earth", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CRYOGENIZED_SALT = ITEMS.register("cryogenized_salt", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRIC_MOTOR = ITEMS.register("electric_motor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NEODYMIUM_MOTOR = ITEMS.register("neodymium_motor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CRYSTAL_CHIP = ITEMS.register("crystal_chip", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENGRAVED_CRYSTAL_CHIP = ITEMS.register("engraved_crystal_chip", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CALCIUM_PULP = ITEMS.register("calcium_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENERGIUM_PULP = ITEMS.register("energium_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRIUM_PULP = ITEMS.register("vibrium_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_PULP = ITEMS.register("electrical_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENERGIZED_PULP = ITEMS.register("energized_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PHYTO_FILTER = ITEMS.register("phyto_filter", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TREETAP = ITEMS.register("treetap", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NEUTRON_COLLECTOR = ITEMS.register("neutron_collector", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TRIPLE_IRON_ROD = ITEMS.register("triple_iron_rod", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COMPRESSED_SAWDUST = ITEMS.register("compressed_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NETHERCOTTA_BRICK = ITEMS.register("nethercotta_brick", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> THERMIONIC_VALVE = ITEMS.register("thermionic_valve", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SLIME_CUBE = ITEMS.register("slime_cube", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GUNPOWDER_CUBE = ITEMS.register("gunpowder_cube", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> REDSTONE_CUBE = ITEMS.register("redstone_cube", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GLOWSTONE_CUBE = ITEMS.register("glowstone_cube", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CURSED_AQUACHOW = ITEMS.register("cursed_aquachow", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFYING_BATH_SALT = ITEMS.register("purifying_bath_salt", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FUSED_QUARTZ = ITEMS.register("fused_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RESIN_RUBBER = ITEMS.register("resin_rubber", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LEAVE = ITEMS.register("leave", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SELENOUS_CRYSTAL = ITEMS.register("selenous_crystal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SALIS_MUNDUS = ITEMS.register("salis_mundus", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SALIS_SANGUIS = ITEMS.register("salis_sanguis", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RAW_BORON_DUST = ITEMS.register("raw_boron_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CRYSTAL_BINDER = ITEMS.register("crystal_binder", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DIMENSIONAL_BLEND = ITEMS.register("dimensional_blend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CONDENSER = ITEMS.register("condenser", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LATEX = ITEMS.register("latex", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LATEX_DROP = ITEMS.register("latex_drop", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LITHIUM_SOAP = ITEMS.register("lithium_soap", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CARNALLITE = ITEMS.register("carnallite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> KAOLITIC_CLAY = ITEMS.register("kaolitic_clay", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GLOWSTONE_PARTICLES = ITEMS.register("glowstone_particles", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> KAOLITIC_GLOWSTONE = ITEMS.register("kaolitic_glowstone", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ATOMIC_CARBON = ITEMS.register("atomic_carbon", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ACTIVATED_CARBON = ITEMS.register("activated_carbon", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> FINE_SAWDUST = ITEMS.register("fine_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> QUICKLIME = ITEMS.register("quicklime", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SLAKED_LIME = ITEMS.register("slaked_lime", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SODA_ASH = ITEMS.register("soda_ash", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SODA_LYE = ITEMS.register("soda_lye", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GLUE_ITEM = ITEMS.register("glue_item", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HIDE_GLUE_ITEM = ITEMS.register("hide_glue_item", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SILICA = ITEMS.register("silica", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ACTIVATED_MANGANESE_OXIDE = ITEMS.register("activated_manganese_oxide", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HIDE_STOCK = ITEMS.register("hide_stock", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LIMED_HIDE_STOCK = ITEMS.register("limed_hide_stock", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TREATED_HIDE_STOCK = ITEMS.register("treated_hide_stock", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HEMACITE = ITEMS.register("hemacite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ROCK_SALT = ITEMS.register("rock_salt", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HYDRATED_COAL_DUST = ITEMS.register("hydrated_coal_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TEA_CUP = ITEMS.register("tea_cup", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_CAKE_ENRICHED_URANIUM = ITEMS.register("yellow_cake_enriched_uranium", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BLOOD_HIDE_STOCK = ITEMS.register("blood_hide_stock", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STAR_HIDE_STOCK = ITEMS.register("star_hide_stock", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLYWOOD = ITEMS.register("plywood", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> WOOD_ASH = ITEMS.register("wood_ash", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BIO_CHARCOAL = ITEMS.register("bio_charcoal", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_TORCH = ITEMS.register("item_tiny_torch", () -> new TinyTorchItem(BlockInit.TINY_TORCH.get(),
            BlockInit.WALL_TINY_TORCH.get(), new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Examples

    //Vanilla Materials
    public static final Ore IRON = registerItem(new OreBuilder("iron", new Color(216,175,147)).ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore GOLD = registerItem(new OreBuilder("gold", new Color(247,196,49)).ore().specialOre().specialDust().specialCrushed().build());

    //Modded Material
    public static final Ore COPPER = registerItem(new OreBuilder("copper", new Color(231,141,65)).ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore ALUMINUM = registerItem(new OreBuilder("aluminum", new Color(163,175,176)).mekanismOreProcessing().ore().block().specialOre().specialDust().specialCrushed().build());
    public static final Ore NICKEL = registerItem(new OreBuilder("nickel", new Color(230,220,157)).mekanismOreProcessing().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore LEAD = registerItem(new OreBuilder("lead", new Color(69,73,103)).ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore TIN = registerItem(new OreBuilder("tin", new Color(108,137,152)).ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore SILVER = registerItem(new OreBuilder("silver", new Color(210,230,241)).ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore ZINC = registerItem(new OreBuilder("zinc", new Color(168,170,147)).ore().specialOre().dust().specialDust().specialCrushed().build());
    public static final Ore COBALT = registerItem(new OreBuilder("cobalt", new Color(48,127,226)).mekanismOreProcessing().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore URANIUM = registerItem(new OreBuilder("uranium", new Color(146,222,89)).gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore OSMIUM = registerItem(new OreBuilder("osmium", new Color(174,182,201)).gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore TUNGSTEN = registerItem(new OreBuilder("tungsten", new Color(81, 81, 81)).nugget().gear().ore().specialOre().specialDust().specialCrushed().build());

    //Custom Materials
    public static final Ore VIBRANT_ALLOY = registerItem(new OreBuilder("vibrant_alloy", new Color(150, 232, 26)).ingot().nugget().block().dust().specialDust().build());
    public static final Ore ENERGETIC_ALLOY = registerItem(new OreBuilder("energetic_alloy", new Color(255, 103, 11)).ingot().nugget().block().dust().specialDust().build());

    public static final Ore PLATINUM = registerItem(new OreBuilder("platinum", new Color(149,219,255)).ingot().nugget().block().dust().specialDust().plate().gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore CHROME = registerItem(new OreBuilder("chrome", new Color(187,117,169)).moltenFluid().ingot().nugget().block().dust().plate().specialDust().gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore PALLADIUM = registerItem(new OreBuilder("palladium", new Color(177, 74, 87)).moltenFluid().ingot().nugget().plate().block().dust().specialDust().gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore BERYLLIUM = registerItem(new OreBuilder("beryllium", new Color(39, 173, 157)).moltenFluid().ingot().plate().nugget().block().dust().specialDust().gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore MOLYBDENUM = registerItem(new OreBuilder("molybdenum", new Color(111,93,161)).moltenFluid().ingot().nugget().block().dust().specialDust().gear().ore().specialOre().plate().specialDust().specialCrushed().build());
    public static final Ore GALLIUM = registerItem(new OreBuilder("gallium", new Color(140, 178, 212)).moltenFluid().ingot().nugget().block().dust().specialDust().gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore VANADIUM = registerItem(new OreBuilder("vanadium", new Color(102, 135, 192)).mekanismOreProcessing().moltenFluid().ingot().nugget().block().dust().specialDust().gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore ANTIMONY = registerItem(new OreBuilder("antimony", new Color(236, 236, 236)).moltenFluid().ingot().nugget().block().dust().specialDust().gear().ore().specialOre().specialDust().specialCrushed().build());
    public static final Ore INDIUM = registerItem(new OreBuilder("indium", new Color(47, 151, 210)).moltenFluid().ingot().nugget().block().dust().specialDust().build());
    public static final Ore ZIRCONIUM = registerItem(new OreBuilder("zirconium", new Color(223, 237, 144)).moltenFluid().ingot().nugget().block().dust().specialDust().build());
    public static final Ore MAGNESIUM = registerItem(new OreBuilder("magnesium", new Color(192, 138, 138)).moltenFluid().ore().specialOre().crushed().specialCrushed().plate().ingot().nugget().block().dust().specialDust().build());
    public static final Ore BIOSLAG = registerItem(new OreBuilder("bioslag", new Color(138, 117, 110)).ingot().build());
    public static final Ore COMPRESSED_STEEL = registerItem(new OreBuilder("compressed_steel", new Color(150, 149, 148)).ingot().build());
    public static final Ore DEPLETED_MYTHRIL = registerItem(new OreBuilder("depleted_mythril", new Color(142, 143, 169)).dust().specialDust().build());
    public static final Ore MYTHRIL = registerItem(new OreBuilder("mythril", new Color(118, 114, 255)).moltenFluid().dust().specialDust().ingot().nugget().block().plate().gear().build());
    public static final Ore ELECTRICAL_PLATINUM = registerItem(new OreBuilder("electrical_platinum", new Color(145, 205, 172)).ingot().build());
    public static final Ore ELECTRICAL_STEEL = registerItem(new OreBuilder("electrical_steel", new Color(176, 173, 173)).ingot().build());
    public static final Ore ELECTRICAL_HSLA_STEEL = registerItem(new OreBuilder("electrical_hsla_steel", new Color(183, 197, 222)).ingot().build());
    public static final Ore TETRAETHYL_LEAD = registerItem(new OreBuilder("tetraethyl_lead", new Color(103, 105, 181)).moltenFluid().ingot().nugget().dust().specialDust().build());
    public static final Ore MANGANESE = registerItem(new OreBuilder("manganese", new Color(182, 196, 222)).moltenFluid().ingot().nugget().specialDust().dust().block().build());
    public static final Ore REFINED_REDSTONE = registerItem(new OreBuilder("refined_redstone", new Color(184, 40, 40)).moltenFluid().ingot().nugget().block().dust().build());
    public static final Ore REFINED_OBSIDIAN = registerItem(new OreBuilder("refined_obsidian", new Color(128, 102, 173)).moltenFluid().build());
    public static final Ore REFINED_GLOWSTONE = registerItem(new OreBuilder("refined_glowstone", new Color(255, 240, 152)).moltenFluid().dust().build());
    public static final Ore STAINLESS_STEEL = registerItem(new OreBuilder("stainless_steel", new Color(126, 134, 139)).moltenFluid().ingot().nugget().block().dust().specialDust().build());
    public static final Ore REFINED_IRON = registerItem(new OreBuilder("refined_iron", new Color(99, 103, 108)).moltenFluid().ingot().nugget().block().dust().specialDust().build());
    public static final Ore GRAPHENE = registerItem(new OreBuilder("graphene", new Color(59, 59, 59)).moltenFluid().ingot().nugget().block().dust().specialDust().build());
    public static final Ore CUPRONICKEL = registerItem(new OreBuilder("cupronickel", new Color(115, 115, 74)).moltenFluid().ingot().nugget().block().build());
    public static final Ore DARK_STEEL = registerItem(new OreBuilder("dark_steel", new Color(48, 48, 48)).moltenFluid().ingot().nugget().block().dust().specialDust().build());
    public static final Ore SOULARIUM = registerItem(new OreBuilder("soularium", new Color(115, 79, 65)).moltenFluid().ingot().nugget().block().dust().specialDust().build());
    public static final Ore OSMIRIDIUM = registerItem(new OreBuilder("osmiridium", new Color(147, 168, 206)).moltenFluid().ingot().nugget().block().dust().specialDust().build());

    //Ore Vein
    public static final Ore LUCABINDIITE = registerItem(new OreBuilder("lucabindiite", new Color(242, 219, 18)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore CHALCOPYRITE = registerItem(new OreBuilder("chalcopyrite", new Color(186, 137, 18)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore PYRITE = registerItem(new OreBuilder("pyrite", new Color(116, 91, 35)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore CADMIONDITE = registerItem(new OreBuilder("cadmiondite", new Color(110, 93, 217)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore WULFENITE = registerItem(new OreBuilder("wulfenite", new Color(204, 61, 36)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore MAGNESITE = registerItem(new OreBuilder("magnesite", new Color(172, 87, 127)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore SIDERITE = registerItem(new OreBuilder("siderite", new Color(191, 107, 92)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore PITCHBLENDE = registerItem(new OreBuilder("pitchblende", new Color(79, 165, 186)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore POWELLITE = registerItem(new OreBuilder("powellite", new Color(183, 195, 106)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore SHELDONITE = registerItem(new OreBuilder("sheldonite", new Color(61, 46, 163)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore URANINITE = registerItem(new OreBuilder("uraninite", new Color(102, 165, 38)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore STIBNITE = registerItem(new OreBuilder("stibnite", new Color(75, 113, 112)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore PENTLADITE = registerItem(new OreBuilder("pentladite", new Color(191, 176, 95)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore SCHEELITE = registerItem(new OreBuilder("scheelite", new Color(114, 177, 190)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore TUNGSTATE = registerItem(new OreBuilder("tungstate", new Color(36, 32, 106)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore CHROMITE = registerItem(new OreBuilder("chromite", new Color(153, 79, 59)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore BERYL = registerItem(new OreBuilder("beryl", new Color(155, 243, 215)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore LAZURITE = registerItem(new OreBuilder("lazurite", new Color(71, 69, 151)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore SODALITE = registerItem(new OreBuilder("sodalite", new Color(93, 204, 217)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore VANADITE = registerItem(new OreBuilder("vanadite", new Color(250, 190, 196)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore BAUXITE = registerItem(new OreBuilder("bauxite", new Color(165, 87, 67)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore GALENA = registerItem(new OreBuilder("galena", new Color(120, 106, 163)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore TETRAHEDRITE = registerItem(new OreBuilder("tetrahedrite", new Color(255, 110, 124)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore SPODUMENE = registerItem(new OreBuilder("spodumene", new Color(166, 126, 124)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());
    public static final Ore GARNIERITE = registerItem(new OreBuilder("garnierite", new Color(126, 179, 75)).dust().specialDust().ore().specialOre().crushed().specialCrushed().build());


    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);

    //Register functions for tooltips
    private static RegistryObject<Item> registerItem(String registryName, boolean tooltip) {
        String name = registryName.toLowerCase().replaceAll("\\s+", "_");
        return ITEMS.register(name, () -> new AbstractItem() {
            @Override
            public void appendHoverText(ItemStack stack, @Nullable World p_77624_2_, List<ITextComponent> tooltipList, ITooltipFlag flagIn) {
                if(!tooltip) return;
                if(KeyboardHelper.isHoldingShift()){
                    tooltipList.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shiftw"));
                    tooltipList.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + '.' + name));
                }else{
                    tooltipList.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shiftg"));
                }
            }
        });
    }

    //Registry for simple items
    private static RegistryObject<Item> registerSimpleItem(String registryName) {
        return ITEMS.register(registryName.toLowerCase().replaceAll("\\s+", "_"), () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    }

    private static Ore registerItem(Ore ore) {

        //Configure all parameters with what they register
        Main.LOGGER.info("Has ore ? " + ore.ore);
        if(ore.ore) {
            ore.oreItem = registerSimpleItem("raw_" + ore.registryName);
            ore.orePieceItem = registerSimpleItem(ore.registryName + "_ore_piece");
            ore.rawOreBlock = BlockInit.registerBlock("raw_" + ore.registryName + "_block");
        }
        if(ore.specialOre) {
            ore.infusedOreItem = registerSimpleItem("infused_raw_" + ore.registryName);
            ore.purifiedOreItem = registerSimpleItem("purified_raw_" + ore.registryName);
        }
        if(ore.ingot) ore.ingotItem = registerSimpleItem(ore.registryName + "_ingot");
        if(ore.nugget) ore.nuggetItem = registerSimpleItem(ore.registryName + "_nugget");
        if(ore.block) ore.storageBlock = BlockInit.registerBlock(ore.registryName + "_block");
        if(ore.dust) ore.dustItem = registerSimpleItem(ore.registryName + "_dust");
        if(ore.specialDust) ore.tinyDustItem = registerSimpleItem("tiny_" + ore.registryName + "_dust");
        if(ore.coin) ore.coinItem = registerSimpleItem(ore.registryName + "_coin");
        if(ore.gear) ore.gearItem = registerSimpleItem(ore.registryName + "_gear");
        if(ore.plate) ore.plateItem = registerSimpleItem(ore.registryName + "_plate");
        if(ore.crushed) ore.crushedItem = registerSimpleItem("crushed_" + ore.registryName + "_ore");
        if(ore.specialCrushed) {
            ore.infusedCrushedItem = registerSimpleItem("infused_crushed_" + ore.registryName+ "_ore");
            ore.purifiedCrushedItem = registerSimpleItem("purified_crushed_" + ore.registryName+ "_ore");
            ore.centrifugedCrushedItem = registerSimpleItem("centrifuged_crushed_" + ore.registryName+ "_ore");
        }
        if(ore.rod) ore.rodItem = registerSimpleItem(ore.registryName + "_rod");
        if(ore.wire) ore.wireItem = registerSimpleItem(ore.registryName + "_wire");
        if(ore.moltenFluid) ore.moltenFluidObject = FluidInit.register("molten_" + ore.registryName, new Color(ore.color), FluidInit.MOLTEN_RL);
        if(ore.mekanismOreProcessing) {
            ore.slurry = SlurriesInit.createSlurry(ore.registryName + "_slurry", new Color(ore.color), Tag.empty());
            ore.clumpItem = registerSimpleItem("clump_" + ore.registryName);
            ore.shardItem = registerSimpleItem("shard_" + ore.registryName);
            ore.crystalItem = registerSimpleItem("crystal_" + ore.registryName);
            ore.dirtyDustItem = registerSimpleItem("dirty_dust_" + ore.registryName);
        }
        if(ore.alchemical) {
            ore.alchemicalDust = registerSimpleItem("alchemical_" + ore.registryName + "_dust");
            ore.waxItem = registerSimpleItem(ore.registryName + "_wax");
            ore.alchemicalInfuse = InfuseTypeInit.register("alchemical_" + ore.registryName, ore.color);
        }
        return ore;
    }

    //Pain
    public static class OreBuilder {
        public final String registryName;
        private final int color;

        //Build all the parameters
        private Boolean oreItem, specialOreItem, ingot, nugget, block, dust, specialDust, coin, gear, plate, crushed, specialCrushed, rod, wire, moltenFluid, mekanismOreProcessing, alchemical;

        public OreBuilder(String registryName, int rgbColor) {
            this.registryName = registryName.replaceAll("\\s+", "_").toLowerCase();
            this.color = rgbColor;
        }

        public OreBuilder(String registryName, Color color) {
            this(registryName, color.getRGB());
        }

        public OreBuilder ore() {
           this.oreItem = inverseBool(oreItem);
           return this;
        }

        public OreBuilder specialOre() {
            this.specialOreItem = inverseBool(specialOreItem);
            return this;
        }

        public OreBuilder ingot() {
            this.ingot = inverseBool(ingot);
            return this;
        }

        public OreBuilder nugget() {
            this.nugget = inverseBool(nugget);
            return this;
        }

        public OreBuilder block() {
            this.block = inverseBool(block);
            return this;
        }

        public OreBuilder dust() {
            this.dust = inverseBool(dust);
            return this;
        }

        public OreBuilder specialDust() {
            this.specialDust = inverseBool(specialDust);
            return this;
        }

        public OreBuilder coin() {
            this.coin = inverseBool(coin);
            return this;
        }

        public OreBuilder gear() {
            this.gear = inverseBool(gear);
            return this;
        }

        public OreBuilder plate() {
            this.plate = inverseBool(plate);
            return this;
        }

        public OreBuilder crushed() {
            this.crushed = inverseBool(crushed);
            return this;
        }

        public OreBuilder specialCrushed() {
            this.specialCrushed = inverseBool(specialCrushed);
            return this;
        }

        public OreBuilder rod() {
            this.rod = inverseBool(rod);
            return this;
        }

        public OreBuilder wire() {
            this.wire = inverseBool(wire);
            return this;
        }

        public OreBuilder moltenFluid() {
            this.moltenFluid = inverseBool(moltenFluid);
            return this;
        }

        public OreBuilder mekanismOreProcessing() {
            this.mekanismOreProcessing = inverseBool(mekanismOreProcessing);
            return this;
        }

        public OreBuilder alchemical() {
            this.alchemical = inverseBool(alchemical);
            return this;
        }

        private boolean inverseBool(Boolean bool) {
            return bool == null || !bool;
        }

        private boolean getBool(Boolean bool) {
            return bool != null && bool;
        }

        public Ore build() {
            return new Ore(registryName, color, getBool(oreItem), getBool(specialOreItem), getBool(ingot), getBool(nugget), getBool(block), getBool(dust), getBool(specialDust), getBool(coin), getBool(gear), getBool(plate), getBool(crushed), getBool(specialCrushed), getBool(rod), getBool(wire), getBool(moltenFluid), getBool(mekanismOreProcessing), getBool(alchemical));
        }
    }

    public static class Ore {
        public final String registryName;
        private final int color;

        //Add new registry parameters here
        private final boolean ore, specialOre, ingot, nugget, block, dust, specialDust, coin, gear, plate, crushed, specialCrushed, rod, wire, moltenFluid, mekanismOreProcessing, alchemical;

        //Note the list of all the items/slurry/fluid that can be registered with the functions above
        private RegistryObject<Item> oreItem, infusedOreItem, purifiedOreItem, ingotItem, nuggetItem, dustItem, tinyDustItem, coinItem, gearItem, plateItem, crushedItem, infusedCrushedItem, purifiedCrushedItem, centrifugedCrushedItem, rodItem, wireItem, clumpItem, shardItem, crystalItem, dirtyDustItem, alchemicalDust, waxItem, orePieceItem;
        private RegistryObject<Slurry>[] slurry;
        private RegistryObject<InfuseType> alchemicalInfuse;
        private RegistryObject<Block> storageBlock, rawOreBlock;
        private FluidInit.FluidObject moltenFluidObject;

        //Reference all the parameters here
        public Ore(String registryName, int color, boolean oreItem, boolean specialOreItem, boolean ingot, boolean nugget, boolean block, boolean dust, boolean specialDust, boolean coin, boolean gear, boolean plate, boolean crushed, boolean specialCrushed, boolean rod,
                   boolean wire, boolean moltenFluid, boolean mekanismOreProcessing, boolean alchemical) {
            this.registryName = registryName;
            this.color = color;
            this.ore = oreItem;
            this.specialOre = specialOreItem;
            this.ingot = ingot;
            this.nugget = nugget;
            this.block = block;
            this.dust = dust;
            this.specialDust = specialDust;
            this.coin = coin;
            this.gear = gear;
            this.plate = plate;
            this.crushed = crushed;
            this.specialCrushed = specialCrushed;
            this.rod = rod;
            this.wire = wire;
            this.moltenFluid = moltenFluid;
            this.mekanismOreProcessing = mekanismOreProcessing;
            this.alchemical = alchemical;
        }

        public int getColor() {
            return color;
        }

        public boolean getOre() {
            return ore;
        }

        public boolean getSpecialOre() {
            return specialOre;
        }

        public boolean getIngot() {
            return ingot;
        }

        public boolean getNugget() {
            return nugget;
        }

        public boolean getBlock() {
            return block;
        }

        public boolean getDust() {
            return dust;
        }

        public boolean getSpecialDust() {
            return specialDust;
        }

        public boolean getCoin() {
            return coin;
        }

        public boolean getGear() {
            return gear;
        }

        public boolean getPlate() {
            return plate;
        }

        public boolean getCrushed() {
            return crushed;
        }

        public boolean getSpecialCrushed() {
            return specialCrushed;
        }

        public boolean getRod() {
            return rod;
        }

        public boolean getWire() {
            return wire;
        }

        public boolean getMoltenFluid() {
            return moltenFluid;
        }

        public boolean getMekanismOreProcessing() {
            return mekanismOreProcessing;
        }

        public boolean getAlchemical() {
            return alchemical;
        }

        //To add individual Item Registry

        public RegistryObject<Item> getOreItem() {
            return oreItem;
        }

        public RegistryObject<Item> getInfusedOreItem() { return infusedOreItem; }

        public RegistryObject<Item> getPurifiedOreItem() { return purifiedOreItem; }

        public RegistryObject<Item> getIngotItem() {
            return ingotItem;
        }

        public RegistryObject<Item> getNuggetItem() {
            return nuggetItem;
        }

        public RegistryObject<Item> getDustItem() {
            return dustItem;
        }

        public RegistryObject<Item> getTinyDustItem() {
            return tinyDustItem;
        }

        public RegistryObject<Item> getCoinItem() {
            return coinItem;
        }

        public RegistryObject<Item> getGearItem() {
            return gearItem;
        }

        public RegistryObject<Item> getPlateItem() {
            return plateItem;
        }

        public RegistryObject<Item> getCrushedItem() {
            return crushedItem;
        }

        public RegistryObject<Item> getInfusedCrushedItem() {
            return infusedCrushedItem;
        }

        public RegistryObject<Item> getPurifiedCrushedItem() {
            return purifiedCrushedItem;
        }

        public RegistryObject<Item> getCentrifugedCrushedItem() {
            return centrifugedCrushedItem;
        }

        public RegistryObject<Item> getClumpItem() {
            return clumpItem;
        }

        public RegistryObject<Item> getShardItem() {
            return shardItem;
        }

        public RegistryObject<Item> getCrystalItem() {
            return crystalItem;
        }

        public RegistryObject<Item> getDirtyDustItem() {
            return dirtyDustItem;
        }

        public RegistryObject<Item> getWaxItem() {
            return waxItem;
        }

        public RegistryObject<Item> getRodItem() {
            return rodItem;
        }

        public RegistryObject<Item> getWireItem() {
            return wireItem;
        }

        public RegistryObject<Slurry>[] getSlurry() {
            return slurry;
        }

        public RegistryObject<InfuseType> getAlchemicalInfuse() {
            return alchemicalInfuse;
        }

        public RegistryObject<Item> getAlchemicalDust() {
            return alchemicalDust;
        }

        public RegistryObject<Item> getOrePieceItem() {
            return orePieceItem;
        }

        public RegistryObject<Block> getStorageBlock() {
            return storageBlock;
        }

        public RegistryObject<Block> getRawOreBlock() {
            return rawOreBlock;
        }

        public FluidInit.FluidObject getMoltenFluidObject() {
            return moltenFluidObject;
        }
    }
}
