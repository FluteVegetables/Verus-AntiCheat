package me.levansj01.verus.check.checks.killaura;

import me.levansj01.verus.check.PacketCheck;
import me.levansj01.verus.check.annotation.CheckInfo;
import me.levansj01.verus.check.type.CheckType;
import me.levansj01.verus.check.version.CheckVersion;
import me.levansj01.verus.compat.VPacket;
import me.levansj01.verus.compat.packets.VPacketPlayInLook;

@CheckInfo(
  type = CheckType.KILL_AURA, 
  subType = "C", 
  friendlyName = "Aimbot", 
  version = CheckVersion.RELEASE, 
  minViolations = -1.0, 
  maxViolations = 5, 
  logData = true
)
public class KillAuraC extends PacketCheck {
  
}
