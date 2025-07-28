package cn.charlotte.pit.events;


public interface IEvent {

    String getEventInternalName();

    String getEventName();

    int requireOnline();

    void onActive();

    void onInactive();

}
