package cn.charlotte.pit.event;

import cn.charlotte.pit.item.IMythicItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;


@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Data
public class PitPlayerEnchantEvent extends PitEvent {

    private final Player player;
    private final IMythicItem beforeItem;
    private final IMythicItem afterItem;
}
