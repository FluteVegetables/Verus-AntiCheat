package me.levansj01.verus.check.checks.killaura;

import me.levansj01.verus.check.MovementCheck;
import me.levansj01.verus.check.annotation.CheckInfo;
import me.levansj01.verus.check.type.CheckType;
import me.levansj01.verus.check.version.CheckVersion;
import me.levansj01.verus.data.version.ClientVersion;
import me.levansj01.verus.util.BukkitUtil;
import me.levansj01.verus.util.PlayerLocation;
import me.levansj01.verus.util.java.MathUtil;
import org.bukkit.GameMode;
import org.bukkit.potion.PotionEffectType;

@CheckInfo(
  type = CheckType.KILL_AURA, 
  subType = "N", 
  friendlyName = "KillAura", 
  version = CheckVersion.RELEASE, 
  minViolations = -2.5, 
  maxViolations = 5, 
  logData = true, 
  unsupportedAtleast = ClientVersion.VERSION1_9
)
public class KillAuraN extends MovementCheck {

}
