package com.lwansbrough.reactnativecamera;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by reion on 1/8/2016.
 */
public class ReactCameraPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return new ArrayList<NativeModule>();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.<ViewManager>asList(
                new ReactCameraManager()
        );
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Arrays.asList();
    }
}
