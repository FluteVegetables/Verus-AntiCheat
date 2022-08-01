package me.levansj01.verus.check.checks.killaura;

import me.levansj01.verus.check.PacketCheck;
import me.levansj01.verus.check.annotation.CheckInfo;
import me.levansj01.verus.check.type.CheckType;
import me.levansj01.verus.check.version.CheckVersion;
import me.levansj01.verus.compat.BlockPosition;
import me.levansj01.verus.compat.ServerVersion;
import me.levansj01.verus.compat.VPacket;
import me.levansj01.verus.compat.packets.VPacketPlayInBlockPlace;
import me.levansj01.verus.compat.packets.VPacketPlayInFlying;
import me.levansj01.verus.compat.packets.VPacketPlayInUseEntity;
import me.levansj01.verus.type.Loader;

@CheckInfo(
  type = CheckType.KILL_AURA, 
  subType = "M", 
  friendlyName = "KillAura", 
  version = CheckVersion.RELEASE, 
  unsupportedServers = {
    ServerVersion.v1_11_R1, 
    ServerVersion.v1_12_R1, 
    ServerVersion.v1_14_R1, 
    ServerVersion.v1_15_R1, 
    ServerVersion.v1_16_R1, 
    ServerVersion.v1_16_R2, 
    ServerVersion.v1_16_R3
    }
)
public class KillAuraM extends PacketCheck {
  
}
