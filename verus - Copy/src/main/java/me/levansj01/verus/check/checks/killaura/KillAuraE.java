package me.levansj01.verus.check.checks.killaura;

import me.levansj01.verus.check.PacketCheck;
import me.levansj01.verus.check.annotation.CheckInfo;
import me.levansj01.verus.check.type.CheckType;
import me.levansj01.verus.check.version.CheckVersion;
import me.levansj01.verus.compat.VPacket;
import me.levansj01.verus.compat.packets.VPacketPlayInBlockPlace;
import me.levansj01.verus.compat.packets.VPacketPlayInFlying;
import me.levansj01.verus.compat.packets.VPacketPlayInUseEntity;
import me.levansj01.verus.data.version.ClientVersion;
import me.levansj01.verus.type.Loader;

@CheckInfo(
  type = CheckType.KILL_AURA, 
  subType = "E", 
  friendlyName = "KillAura, 
  version = CheckVersion.RELEASE, 
  unsupportedAtleast=ClientVersion.VERSION1_9
)
public class KillAuraE extends PacketCheck {

}
