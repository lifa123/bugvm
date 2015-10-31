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
package com.bugvm.apple.scenekit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.annotation.NotImplemented;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNBoundingVolumeAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements SCNBoundingVolume/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("getBoundingBoxMin:max:")
    public boolean getBoundingBox(SCNVector3.SCNVector3Ptr min, SCNVector3.SCNVector3Ptr max) { return false; }
    @NotImplemented("getBoundingSphereCenter:radius:")
    public boolean getBoundingSphere(SCNVector3.SCNVector3Ptr center, MachineSizedFloatPtr radius) { return false; }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("setBoundingBoxMin:max:")
    public void setBoundingBox(SCNVector3.SCNVector3Ptr min, SCNVector3.SCNVector3Ptr max) {}
    /*</methods>*/
}