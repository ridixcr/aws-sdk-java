/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.eks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateNodegroupVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateNodegroupVersionRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> NODEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("nodegroupName").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> RELEASEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseVersion").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchTemplate").build();
    private static final MarshallingInfo<Boolean> FORCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("force").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final UpdateNodegroupVersionRequestMarshaller instance = new UpdateNodegroupVersionRequestMarshaller();

    public static UpdateNodegroupVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateNodegroupVersionRequest updateNodegroupVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateNodegroupVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateNodegroupVersionRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(updateNodegroupVersionRequest.getNodegroupName(), NODEGROUPNAME_BINDING);
            protocolMarshaller.marshall(updateNodegroupVersionRequest.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(updateNodegroupVersionRequest.getReleaseVersion(), RELEASEVERSION_BINDING);
            protocolMarshaller.marshall(updateNodegroupVersionRequest.getLaunchTemplate(), LAUNCHTEMPLATE_BINDING);
            protocolMarshaller.marshall(updateNodegroupVersionRequest.getForce(), FORCE_BINDING);
            protocolMarshaller.marshall(updateNodegroupVersionRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
