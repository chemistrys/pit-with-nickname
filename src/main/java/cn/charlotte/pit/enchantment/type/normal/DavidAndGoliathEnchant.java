package cn.charlotte.pit.enchantment.type.normal;

import cn.charlotte.pit.data.PlayerProfile;
import cn.charlotte.pit.enchantment.AbstractEnchantment;
import cn.charlotte.pit.enchantment.param.event.PlayerOnly;
import cn.charlotte.pit.enchantment.param.item.ArmorOnly;
import cn.charlotte.pit.enchantment.rarity.EnchantmentRarity;
import cn.charlotte.pit.parm.listener.IPlayerDamaged;
import cn.charlotte.pit.util.cooldown.Cooldown;
import com.google.common.util.concurrent.AtomicDouble;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author: Misoryan, Starry_Killer
 * @Created_In: 2021/1/26 12:15
 */
@ArmorOnly
public class DavidAndGoliathEnchant extends AbstractEnchantment implements IPlayerDamaged {
    @Override
    public String getEnchantName() {
        return "以弱战强";
    }

    @Override
    public int getMaxEnchantLevel() {
        return 3;
    }

    @Override
    public String getNbtName() {
        return "david_and_goliath_enchant";
    }

    @Override
    public EnchantmentRarity getRarity() {
        return EnchantmentRarity.NORMAL;
    }

    @Override
    public Cooldown getCooldown() {
        return null;
    }

    @Override
    public String getUsefulnessLore(int enchantLevel) {
        switch (enchantLevel) {
            case 1:
                return "&7受到来自持有赏金的玩家攻击时受到的伤害 &9-15%";
            case 2:
                return "&7受到来自持有赏金的玩家攻击时受到的伤害 &9-25%";
            case 3:
                return "&7受到来自持有赏金的玩家攻击时受到的伤害 &9-40%";
            default:
                return null;
        }
    }

    @Override
    @PlayerOnly
    public void handlePlayerDamaged(int enchantLevel, Player myself, Entity attacker, double damage, AtomicDouble finalDamage, AtomicDouble boostDamage, AtomicBoolean cancel) {
        Player attackerPlayer = (Player) attacker;
        PlayerProfile profile = PlayerProfile.getPlayerProfileByUuid(attackerPlayer.getUniqueId());
        if (profile.getBounty() > 0) {
            switch (enchantLevel) {
                case 1:
                    boostDamage.getAndAdd(-0.15);
                    break;
                case 2:
                    boostDamage.getAndAdd(-0.25);
                case 3:
                    boostDamage.getAndAdd(-0.4);
            }
        }
    }
}
