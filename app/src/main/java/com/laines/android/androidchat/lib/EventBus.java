package com.laines.android.androidchat.lib;

import java.util.Objects;

/**
 * Created by alaines on 8/09/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
