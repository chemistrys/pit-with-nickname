package cn.charlotte.pit.event;

import lombok.EqualsAndHashCode;
import org.bukkit.entity.Player;


@EqualsAndHashCode(callSuper = true)
public class PitPlayerSpawnEvent extends PitEvent {
    private final Player player;

    public PitPlayerSpawnEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }


}
