package me.levansj01.verus.check.checks.killaura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import me.levansj01.verus.check.PacketCheck;
import me.levansj01.verus.check.annotation.CheckInfo;
import me.levansj01.verus.check.type.CheckType;
import me.levansj01.verus.check.version.CheckVersion;
import me.levansj01.verus.compat.VPacket;
import me.levansj01.verus.compat.packets.VPacketPlayInFlying;
import me.levansj01.verus.util.PacketLocation;
import me.levansj01.verus.util.PlayerLocation;
import me.levansj01.verus.util.java.AtomicCappedQueue;
import me.levansj01.verus.util.java.MathUtil;

@CheckInfo(
  type = CheckType.KILL_AURA, 
  subType = "A", 
  friendlyName = "Aimbot", 
  version = CheckVersion.RELEASE, 
  minViolations = -2.0, 
  maxViolations = 6
)
public class KillAura A extends PacketCheck {

}
