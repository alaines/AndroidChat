package com.laines.android.androidchat.lib;

/**
 * Created by alaines on 8/09/2016.
 */
public class GreenRobotEventbus implements EventBus {
    org.greenrobot.eventbus.EventBus eventBus;

    private static class  SingletonHolder {
        private static final GreenRobotEventbus INSTANCE = new GreenRobotEventbus();
    }

    public  static GreenRobotEventbus getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public GreenRobotEventbus(){
        this.eventBus = org.greenrobot.eventbus.EventBus.getDefault();
    }

    @Override
    public void register(Object subscriber) {
        eventBus.register(subscriber);
    }

    @Override
    public void unregister(Object subscriber) {
        eventBus.unregister(subscriber);
    }

    @Override
    public void post(Object event) {
        eventBus.post(event);
    }
}
