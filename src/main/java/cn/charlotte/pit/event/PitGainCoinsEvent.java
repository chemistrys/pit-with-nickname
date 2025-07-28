package cn.charlotte.pit.event;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;


@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Data
public class PitGainCoinsEvent extends PitEvent {
    private final Player player;
    private final double coins;


}
