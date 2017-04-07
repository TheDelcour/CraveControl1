package com.eth.cravecontrol.cravecontrol;

import android.app.Application;

/**
 * Created by Delcour on 04-04-2017.
 */

public class MyApplication extends Application {
    private String which_button;

    public String getWhich_button() {
        return which_button;
    }

    public void setWhich_button(String str) {
        which_button = str;
    }
}
