package cn.charlotte.pit.perk.type.prestige

import cn.charlotte.pit.perk.AbstractPerk
import cn.charlotte.pit.perk.PerkType
import cn.charlotte.pit.perk.ShopPerkType
import org.bukkit.Material
import org.bukkit.entity.Player

/**
 * @author Araykal
 * @since 2025/2/4
 */
class BowBundleShopPerk : AbstractPerk() {
    override fun getInternalPerkName(): String {
        return "bow_bundle_shop_unlock"
    }

    override fun getDisplayName(): String {
        return "商店升级: 神话之弓收纳箱"
    }

    override fun getIcon(): Material {
        return Material.STORAGE_MINECART
    }

    override fun requireCoins(): Double {
        return 0.0
    }

    override fun requireRenown(level: Int): Double {
        return 30.0
    }

    override fun requirePrestige(): Int {
        return 20
    }

    override fun requireLevel(): Int {
        return 0
    }

    override fun getPerkType(): PerkType {
        return PerkType.PERK
    }

    override fun getDescription(player: Player): List<String> {
        val lines: MutableList<String> = ArrayList()
        lines.add("&7允许你在商店中购买神话之弓收纳箱.")
        lines.add("&7神话之弓收纳箱使用后会打包背包内")
        lines.add("&710条&c未附魔&7的神话之弓.")
        lines.add("&7并允许你随时将其取出.")
        return lines
    }

    override fun getMaxLevel(): Int {
        return 1
    }

    override fun onPerkActive(player: Player) {
    }

    override fun onPerkInactive(player: Player) {
    }

    override fun getShopPerkType(): ShopPerkType {
        return ShopPerkType.SHOP
    }
}