package cn.charlotte.pit.event;

import org.bukkit.entity.Player;

public class PitDamageEvent extends PitEvent {
    private final Player attacker;
    private final double finalDamage;
    private final double damage;

    public PitDamageEvent(Player attacker, double finalDamage, double damage) {
        this.attacker = attacker;
        this.finalDamage = finalDamage;
        this.damage = damage;
    }


    public Player getAttacker() {
        return attacker;
    }

    public double getFinalDamage() {
        return finalDamage;
    }

    public double getDamage() {
        return damage;
    }

}
