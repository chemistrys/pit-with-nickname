package cn.charlotte.pit.event;

import cn.charlotte.pit.data.PlayerProfile;


public class PitProfileLoadedEvent extends PitEvent {
    private final PlayerProfile playerProfile;

    public PitProfileLoadedEvent(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }

    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }
}
