package cc.ghast.packet.wrapper.packet.play.client;

import cc.ghast.packet.buffer.ProtocolByteBuf;
import cc.ghast.packet.nms.ProtocolVersion;
import cc.ghast.packet.wrapper.packet.ClientPacket;
import cc.ghast.packet.wrapper.packet.Packet;
import cc.ghast.packet.wrapper.packet.ReadableBuffer;
import lombok.Getter;

import java.util.UUID;

/**
 * @author Ghast
 * @since 31/10/2020
 * ArtemisPacket © 2020
 */

@Getter
public class PacketPlayClientVehicleMove extends Packet<ClientPacket> implements ReadableBuffer {
    public PacketPlayClientVehicleMove(UUID player, ProtocolVersion version) {
        super("PacketPlayInVehicleMove", player, version, e -> e.isOrAbove(ProtocolVersion.V1_9));
    }

    private double x;
    private double y;
    private double z;
    private float yaw;
    private float pitch;

    @Override
    public void read(ProtocolByteBuf byteBuf) {
        this.x = byteBuf.readDouble();
        this.y = byteBuf.readDouble();
        this.z = byteBuf.readDouble();
        this.yaw = byteBuf.readFloat();
        this.pitch = byteBuf.readFloat();
    }
}
