package main.java.me.levansj01.verus.type.premium.checks.aim;

import me.levansj01.verus.check.*;
import me.levansj01.verus.check.annotation.*;
import me.levansj01.verus.check.type.*;
import me.levansj01.verus.check.version.*;
import me.levansj01.verus.util.location.*;

@CheckInfo(
        type = CheckType.AIM_ASSIST,
        subType = "J",
        friendlyName = "Aim",
        version = CheckVersion.EXPERIMENTAL,
        minViolations = -2.0
)

public class AimJ extends AimCheck {
    @Override
    public void handle(PlayerLocation playerLocation, PlayerLocation playerLocation2, long l) {
        float f = Math.abs(playerLocation.getYaw() - playerLocation2.getYaw());
        float f2 = Math.abs(playerLocation.getPitch() - playerLocation2.getPitch());
        if (this.playerData.getLastAttackTicks() < 200) {
            if (f2 > 0.0f && f > 2.0f && (double) f2 < 0.0119) {
                this.handleViolation(
                        String.format("Y: %s P: %s", f, f2));
            }
            this.violations -= Math.min(this.violations + 2.0, 0.001);
        }
    }
}