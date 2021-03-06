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
  private boolean place;

  public KillAuraE() {
    if (Loader.getUsername().equals("UniversoCraft")) {
      this.setMaxViolation(/*value*/)
    }
  }
  
  @Override
  public void handle(VPacket vPacket, long l) {
    if (vPacket instanceof VPacketPlayInFlying) {
      this.place = false;
    } else if (vPacket instanceof VPacketPlayInBlockPlace) {
      this.place = true;
    } else if (vPacket instanceof VPacketPlayInUseEntity && this.place && ((((VPacketPlayInUseEntity)vPacket).getAction() == VPacketPlayInUseEntity.EntityUseAction.ATTACK) {
      this.handleViolation("", 1.0, (/*value*/, /*value*/) != 0);
    }
  }
}
