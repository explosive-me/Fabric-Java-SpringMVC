/*
 *  Copyright 2016, 2017 DTCC, Fujitsu Australia Software Technology, IBM - All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.hyperledger.fabric_ca.sdk;

import org.hyperledger.fabric.sdk.Enrollment;

import java.io.Serializable;
import java.security.KeyPair;
import java.security.PrivateKey;

// Enrollment metadata
public class HFCAEnrollment implements Enrollment, Serializable {
    private static final long serialVersionUID = 550416591376968096L;
    private KeyPair key;
    private String cert;

    HFCAEnrollment(KeyPair signingKeyPair, String signedPem) {
        key = signingKeyPair;
        this.cert = signedPem;
    }

    public PrivateKey getKey() {
        return key.getPrivate();
    }

    public String getCert() {
        return cert;
    }

}
