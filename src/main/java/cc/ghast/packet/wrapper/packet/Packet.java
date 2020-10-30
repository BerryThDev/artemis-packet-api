package cc.ghast.packet.wrapper.packet;

import cc.ghast.packet.nms.ProtocolVersion;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.function.Predicate;

@Getter
@Setter
public abstract class Packet<D> {
    protected final UUID uuid;
    protected final ProtocolVersion version;
    protected final static ProtocolVersion gameVersion = ProtocolVersion.getGameVersion();
    protected final Predicate<ProtocolVersion>[] versionPredicate;
    protected final long timestamp;
    protected boolean cancelled;
    protected final String realName;

    public Packet(String realName, UUID player, ProtocolVersion version, Predicate<ProtocolVersion>... versionPredicate) {
        this.realName = realName;
        this.versionPredicate = versionPredicate;
        this.uuid = player;
        this.version = version;
        this.timestamp = System.currentTimeMillis();
    }

    public Packet(String realName, UUID player, ProtocolVersion version) {
        this.realName = realName;
        this.versionPredicate = new Predicate[0];
        this.uuid = player;
        this.version = version;
        this.timestamp = System.currentTimeMillis();
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(uuid);
    }

}

