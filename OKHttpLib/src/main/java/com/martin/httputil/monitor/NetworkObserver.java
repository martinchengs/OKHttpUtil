package com.martin.httputil.monitor;

import java.util.Observable;
import java.util.Observer;

/**
 * Desc:
 * Author:Martin
 * Date:2016/7/25
 */
public abstract class NetworkObserver implements Observer {

    public static class Action {
        public boolean isAvailable;
        public boolean isWifi;
        public Network.Type type;

        public Action(boolean isAvailable, boolean isWifi, Network.Type type) {
            this.isAvailable = isAvailable;
            this.isWifi = isWifi;
            this.type = type;
        }
    }

    public abstract void notify(Action action);


    @Override
    public void update(Observable observable, Object data) {
        this.notify((Action) data);
    }
}
