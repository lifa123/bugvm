/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.uikit;

/*<imports>*/

import com.bugvm.apple.corelocation.CLRegion;
import com.bugvm.apple.foundation.*;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UILocalNotification/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UILocalNotificationPtr extends Ptr<UILocalNotification, UILocalNotificationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UILocalNotification.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UILocalNotification() {}
    protected UILocalNotification(SkipInit skipInit) { super(skipInit); }
    public UILocalNotification(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fireDate")
    public native NSDate getFireDate();
    @Property(selector = "setFireDate:")
    public native void setFireDate(NSDate v);
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Property(selector = "repeatInterval")
    public native NSCalendarUnit getRepeatInterval();
    @Property(selector = "setRepeatInterval:")
    public native void setRepeatInterval(NSCalendarUnit v);
    @Property(selector = "repeatCalendar")
    public native NSCalendar getRepeatCalendar();
    @Property(selector = "setRepeatCalendar:")
    public native void setRepeatCalendar(NSCalendar v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @WeaklyLinked
    @Property(selector = "region")
    public native CLRegion getRegion();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @WeaklyLinked
    @Property(selector = "setRegion:")
    public native void setRegion(CLRegion v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "regionTriggersOnce")
    public native boolean regionTriggersOnce();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setRegionTriggersOnce:")
    public native void setRegionTriggersOnce(boolean v);
    @Property(selector = "alertBody")
    public native String getAlertBody();
    @Property(selector = "setAlertBody:")
    public native void setAlertBody(String v);
    @Property(selector = "hasAction")
    public native boolean hasAction();
    @Property(selector = "setHasAction:")
    public native void setHasAction(boolean v);
    @Property(selector = "alertAction")
    public native String getAlertAction();
    @Property(selector = "setAlertAction:")
    public native void setAlertAction(String v);
    @Property(selector = "alertLaunchImage")
    public native String getAlertLaunchImage();
    @Property(selector = "setAlertLaunchImage:")
    public native void setAlertLaunchImage(String v);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Property(selector = "alertTitle")
    public native String getAlertTitle();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Property(selector = "setAlertTitle:")
    public native void setAlertTitle(String v);
    @Property(selector = "soundName")
    public native String getSoundName();
    @Property(selector = "setSoundName:")
    public native void setSoundName(String v);
    @Property(selector = "applicationIconBadgeNumber")
    public native @MachineSizedSInt long getApplicationIconBadgeNumber();
    @Property(selector = "setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@MachineSizedSInt long v);
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "category")
    public native String getCategory();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setCategory:")
    public native void setCategory(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="UILocalNotificationDefaultSoundName", optional=true)
    public static native String getDefaultSoundName();
    
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}