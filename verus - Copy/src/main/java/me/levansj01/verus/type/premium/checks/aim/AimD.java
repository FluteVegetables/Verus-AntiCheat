package main.java.me.levansj01.verus.type.premium.checks.aim;

import me.levansj01.verus.check.*;
import me.levansj01.verus.check.annotation.*;
import me.levansj01.verus.check.type.*;
import me.levansj01.verus.check.version.*;
import me.levansj01.verus.util.location.*;

@CheckInfo(
    type = CheckType.AIM_ASSIST, 
    subType = "D",
    friendlyName = "Aim", 
    version = CheckVersion.EXPERIMENTAL, 
    minViolations = -1.0
)

public class AimD extends AimCheck {
    @Override
    public void handle(PlayerLocation playerLocation, PlayerLocation playerLocation2, long l) {
        if (this.playerData.getLastAttackTicks() > 100) {
            return;
        }
        float f = Math.abs(playerLocation2.getYaw() - playerLocation.getYaw());
        float f2 = Math.abs(playerLocation2.getPitch() - playerLocation.getPitch());
        if (f2 > 0.0f && f2 < 1.0E-5 && f > 5.0f) {
            this.handleViolation(String.format("Y: %s P: %s", f, f2));
        }
        this.violations -= Math.min(this.violations + 1.0, 0.005);
    }
}