package me.levansj01.verus.check.checks.killaura;

import java.util.Comparator;
import me.levansj01.verus.check.ReachCheck;
import me.levansj01.verus.check.annotation.CheckInfo;
import me.levansj01.verus.check.type.CheckType;
import me.levansj01.verus.check.version.CheckVersion;
import me.levansj01.verus.data.reach.DistanceData;
import me.levansj01.verus.data.reach.ReachBase;

@CheckInfo(
  type = CheckType.KILL_AURA, 
  subType = "G", 
  friendlyName = "KillAura", 
  version = CheckVersion.RELEASE, 
  minViolations = -3.0, 
  maxViolations = 20,
  logData = true
)
public class KillAuraG extends ReachCheck {
  
}
