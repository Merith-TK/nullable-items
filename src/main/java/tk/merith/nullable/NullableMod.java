/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package tk.merith.nullable;

import tk.merith.nullable.item.SmallIronCoinItem;
import tk.merith.nullable.item.SmallGoldCoinItem;
import tk.merith.nullable.item.RainbowCoinItem;
import tk.merith.nullable.item.NullableCoinsItemGroup;
import tk.merith.nullable.item.IronCoinItem;
import tk.merith.nullable.item.GoldCoinItem;
import tk.merith.nullable.item.EmeraldCoinItem;
import tk.merith.nullable.item.DiamondCoinItem;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class NullableMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item SmallIronCoin_ITEM = Registry.register(Registry.ITEM, id("small_iron_coin"), new SmallIronCoinItem());
	public static final Item SmallGoldCoin_ITEM = Registry.register(Registry.ITEM, id("small_gold_coin"), new SmallGoldCoinItem());
	public static final Item IronCoin_ITEM = Registry.register(Registry.ITEM, id("iron_coin"), new IronCoinItem());
	public static final Item GoldCoin_ITEM = Registry.register(Registry.ITEM, id("gold_coin"), new GoldCoinItem());
	public static final Item DiamondCoin_ITEM = Registry.register(Registry.ITEM, id("diamond_coin"), new DiamondCoinItem());
	public static final Item EmeraldCoin_ITEM = Registry.register(Registry.ITEM, id("emerald_coin"), new EmeraldCoinItem());
	public static final Item RainbowCoin_ITEM = Registry.register(Registry.ITEM, id("rainbow_coin"), new RainbowCoinItem());
	public static final ItemGroup NullableCoins = NullableCoinsItemGroup.get();
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing NullableMod");
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("nullable", s);
	}
}
