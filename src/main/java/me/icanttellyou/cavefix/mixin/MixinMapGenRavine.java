package me.icanttellyou.cavefix.mixin;

import net.minecraft.world.gen.MapGenRavine;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(MapGenRavine.class)
public class MixinMapGenRavine {

    @ModifyConstant(
        method = "func_151540_a",
        constant = @Constant(intValue = 256),
        slice = @Slice(
            from = @At(value = "INVOKE", target = "java/util/Random.nextInt(I)I"),
            to = @At(value = "INVOKE", target = "net/minecraft/util/MathHelper.sin(F)F")))
    private int caveFix$func_151540_a(int value) {
        return 128;
    }
}
