package me.icanttellyou.cavefix.mixin;

import net.minecraft.world.gen.MapGenCaves;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MapGenCaves.class)
public class MixinMapGenCaves {

    @ModifyConstant(method = "func_151538_a", constant = @Constant(intValue = 7))
    private int caveFix$func_151538_a(int value) {
        return 15;
    }

    @ModifyConstant(method = "func_151538_a", constant = @Constant(intValue = 15))
    private int caveFix$func_151538_a$2(int value) {
        return 40;
    }
}
