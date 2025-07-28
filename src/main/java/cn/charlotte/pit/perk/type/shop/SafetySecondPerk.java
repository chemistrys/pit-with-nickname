package cn.charlotte.pit.perk.type.shop;

import cn.charlotte.pit.perk.AbstractPerk;
import cn.charlotte.pit.perk.PerkType;
import cn.charlotte.pit.util.inventory.InventoryUtil;
import cn.charlotte.pit.util.item.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurinan
 * @since 2022/2/25 19:03
 */

public class SafetySecondPerk extends AbstractPerk {

    @Override
    public String getInternalPerkName() {
        return "SafetySecond";
    }

    @Override
    public String getDisplayName() {
        return "安全第二";
    }

    @Override
    public Material getIcon() {
        return Material.CHAINMAIL_HELMET;
    }

    @Override
    public double requireCoins() {
        return 3000;
    }

    @Override
    public double requireRenown(int level) {
        return 0;
    }

    @Override
    public int requirePrestige() {
        return 0;
    }

    @Override
    public int requireLevel() {
        return 0;
    }

    @Override
    public PerkType getPerkType() {
        return PerkType.PERK;
    }

    @Override
    public List<String> getDescription(Player player) {
        List<String> lines = new ArrayList<>();
        lines.add("&7天坑乱斗 &f1.0 &7版本玩家奖励.");
        lines.add("&7天赋携带期间额外获得以下物品:");
        lines.add("  &f▶ &7锁链头盔");
        return lines;
    }

    @Override
    public int getMaxLevel() {
        return 0;
    }

    @Override
    public void onPerkActive(Player player) {
        player.getInventory().addItem(new ItemBuilder(Material.CHAINMAIL_HELMET).deathDrop(false).canDrop(false).canSaveToEnderChest(false).internalName("perk_safety_first").lore("&7天赋物品").buildWithUnbreakable());
    }

    @Override
    public void onPerkInactive(Player player) {
        InventoryUtil.removeItemWithInternalName(player, "perk_safety_first");
    }

}
