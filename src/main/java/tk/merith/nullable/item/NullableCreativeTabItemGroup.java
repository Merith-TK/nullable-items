
package tk.merith.nullable.item;

import tk.merith.nullable.NullableMod;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class NullableCreativeTabItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}
	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("nullable", "nullable_creative_tab")).icon(() -> {
		return new ItemStack(NullableMod.RainbowCoin_ITEM);
	}).build();
}
