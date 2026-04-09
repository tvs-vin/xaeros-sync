package tvs.xaeros.sync.items;

// Imports

import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import tvs.xaeros.sync.Xaerossync;

import java.util.function.Function;

// Main Class

public class ModItems {

    // Items

    public static Item Test_Map = register("test_map", Item::new, new Item.Settings());

    // Sets up item creation

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Xaerossync.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;


    }

    // Initializer

    public static void initialize(){
        Xaerossync.LOGGER.info("Init Items");

    }

}