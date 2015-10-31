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
package com.bugvm.apple.coredata;

/*<imports>*/

import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSErrorException;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSEntityMigrationPolicy/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSEntityMigrationPolicyPtr extends Ptr<NSEntityMigrationPolicy, NSEntityMigrationPolicyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSEntityMigrationPolicy.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSEntityMigrationPolicy() {}
    protected NSEntityMigrationPolicy(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean beginEntityMapping(NSEntityMapping mapping, NSMigrationManager manager) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = beginEntityMapping(mapping, manager, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "beginEntityMapping:manager:error:")
    private native boolean beginEntityMapping(NSEntityMapping mapping, NSMigrationManager manager, NSError.NSErrorPtr error);
    public boolean createDestinationInstances(NSManagedObject sInstance, NSEntityMapping mapping, NSMigrationManager manager) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = createDestinationInstances(sInstance, mapping, manager, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "createDestinationInstancesForSourceInstance:entityMapping:manager:error:")
    private native boolean createDestinationInstances(NSManagedObject sInstance, NSEntityMapping mapping, NSMigrationManager manager, NSError.NSErrorPtr error);
    public boolean endInstanceCreation(NSEntityMapping mapping, NSMigrationManager manager) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = endInstanceCreation(mapping, manager, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "endInstanceCreationForEntityMapping:manager:error:")
    private native boolean endInstanceCreation(NSEntityMapping mapping, NSMigrationManager manager, NSError.NSErrorPtr error);
    public boolean createRelationships(NSManagedObject dInstance, NSEntityMapping mapping, NSMigrationManager manager) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = createRelationships(dInstance, mapping, manager, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "createRelationshipsForDestinationInstance:entityMapping:manager:error:")
    private native boolean createRelationships(NSManagedObject dInstance, NSEntityMapping mapping, NSMigrationManager manager, NSError.NSErrorPtr error);
    public boolean endRelationshipCreation(NSEntityMapping mapping, NSMigrationManager manager) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = endRelationshipCreation(mapping, manager, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "endRelationshipCreationForEntityMapping:manager:error:")
    private native boolean endRelationshipCreation(NSEntityMapping mapping, NSMigrationManager manager, NSError.NSErrorPtr error);
    public boolean performCustomValidation(NSEntityMapping mapping, NSMigrationManager manager) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performCustomValidation(mapping, manager, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performCustomValidationForEntityMapping:manager:error:")
    private native boolean performCustomValidation(NSEntityMapping mapping, NSMigrationManager manager, NSError.NSErrorPtr error);
    public boolean endEntityMapping(NSEntityMapping mapping, NSMigrationManager manager) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = endEntityMapping(mapping, manager, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "endEntityMapping:manager:error:")
    private native boolean endEntityMapping(NSEntityMapping mapping, NSMigrationManager manager, NSError.NSErrorPtr error);
    /*</methods>*/
}