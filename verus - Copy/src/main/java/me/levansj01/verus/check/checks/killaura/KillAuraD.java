package me.levansj01.verus.check.checks.killaura;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import me.levansj01.verus.check.PacketCheck;
import me.levansj01.verus.check.annotation.CheckInfo;
import me.levansj01.verus.check.type.CheckType;
import me.levansj01.verus.check.version.CheckVersion;
import me.levansj01.verus.compat.VPacket;
import me.levansj01.verus.compat.packets.VPacketPlayInFlying;
import me.levansj01.verus.util.java.MathUtil;

@CheckInfo(
  type = CheckType.KILL_AURA, 
  subType = "D", 
  friendlyName = "KillAura", 
  version = CheckVersion.RELEASE, 
  minViolations = -1.0, 
  logData = true
)
public class KillAuraD extends PacketCheck {
  
}
