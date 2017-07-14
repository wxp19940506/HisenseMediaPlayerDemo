package com.example.xiaopengwang.mediaplayerdemo;

import android.app.Application;

import com.example.xiaopengwang.mediaplayerdemo.helper.ConvivaSessionManager;

/**
 * Created by XiaopengWang on 2017/7/13.
 * Email:xiaopeng.wang@qaii.ac.cn
 * QQ:839853185
 * WinXin;wxp19940505
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 1:初始化，app启动一次调用即可
        String mGatewayURL = "https://testonly.conviva.com";
        ConvivaSessionManager.initClient(this, mGatewayURL);
    }
}
