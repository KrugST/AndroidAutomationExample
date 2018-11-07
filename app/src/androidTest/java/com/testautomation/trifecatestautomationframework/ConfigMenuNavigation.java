package com.testautomation.trifecatestautomationframework;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

public class ConfigMenuNavigation {
    UiDevice mDevice;
    public ConfigMenuNavigation(UiDevice mDevice) {
        this.mDevice = mDevice;
    }

public void clickAccountButton() throws UiObjectNotFoundException {

    UiObject accountButtonLocator = mDevice.findObject(new UiSelector()
            .resourceId("com.n_ix.pocket_wod:id/moreAccount"));
    accountButtonLocator.click();
}
}
