
package tk.merith.nullableitems.item;

import net.minecraft.world.World;
import net.minecraft.util.Rarity;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class DiamondCoinItem extends Item {
	public DiamondCoinItem() {
		super(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(new LiteralText("Coin worth 250 bits"));
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
