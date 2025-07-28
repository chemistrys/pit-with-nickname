package cn.charlotte.pit.medal.impl.challenge;

import cn.charlotte.pit.data.PlayerProfile;
import cn.charlotte.pit.medal.AbstractMedal;

/**
 * @Creator Misoryan
 * @Date 2021/6/10 18:55
 */
public class CakeEventMedal extends AbstractMedal {
    @Override
    public String getInternalName() {
        return "CAKE_COINS";
    }

    @Override
    public String getDisplayName(int level) {
        return "蛋糕暴食王";
    }

    @Override
    public String getRequirementDescription(int level) {
        return "在单次事件[蛋糕争夺战]中，获得5,000及以上硬币";
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getProgressRequirement(int level) {
        return 1;
    }

    @Override
    public int getRarity(int level) {
        return 3;
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public void handleProfileLoaded(PlayerProfile profile) {

    }
}
