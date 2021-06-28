package me.fallenbreath.craftingdupe17.mixins;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.screen.slot.CraftingResultSlot;
import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(HandledScreen.class)
public abstract class HandledScreenMixin
{
	@Redirect(
			method = "keyPressed",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/screen/slot/Slot;hasStack()Z"
			)
	)
	private boolean kaboom(Slot slot)
	{
		if (slot instanceof CraftingResultSlot || slot.inventory instanceof CraftingInventory)
		{
			return true;
		}
		// vanilla
		return slot.hasStack();
	}
}
