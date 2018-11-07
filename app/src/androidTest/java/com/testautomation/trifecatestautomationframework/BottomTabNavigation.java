package com.testautomation.trifecatestautomationframework;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.view.inputmethod.BaseInputConnection;

public class BottomTabNavigation {
    UiDevice mDevice;

    public BottomTabNavigation(UiDevice mDevice) {
        this.mDevice = mDevice;
    }

    public void clickHomeButton() {

    }

    public void clickMealSchedulerButton() {

    }

    public void clickTrifectaButton() {

    }

    public void clickLibraryButton() {

    }

    public void clickConfigMenuButton() throws UiObjectNotFoundException {

        UiObject configButtonLocator = mDevice.findObject(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/tabs_container"))
                .getChild(new UiSelector()
                        .className("android.support.v7.app.ActionBar$Tab").index(4));
        configButtonLocator.click();
    }
}
