package com.lwansbrough.reactnativecamera;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIProp;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.uimanager.ViewProps;

public class ReactCameraManager extends SimpleViewManager<ReactCamera> {

    public static final String REACT_CLASS = "ReactNativeCamera";
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ReactCamera createViewInstance(ThemedReactContext context) {
        return new ReactCamera(context);
    }
}