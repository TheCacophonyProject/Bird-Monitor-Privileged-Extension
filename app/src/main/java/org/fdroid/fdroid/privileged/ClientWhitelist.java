/*
 * Copyright (C) 2016 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http//www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fdroid.fdroid.privileged;

import android.util.Pair;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Only apps signed using a certificate with a SHA-256 hash listed here
 * can access the Privileged Extension!
 * <ol>
 * <li>Get SHA-256 of certificate as lowercase without colons with
 * <code>keytool -printcert -jarfile com.example.apk | sed -n 's,SHA256:\s*\([A-F0-9:]*\),\1,p' | sed 's,:,,g' | tr A-f a-f</code></li>
 * <li>Add here with Application ID</li>
 * </ol>
 */
public class ClientWhitelist {

    public static HashSet<Pair<String, String>> whitelist = new HashSet<>(Arrays.asList(
            // certificate SHA-256 of https//f-droid.org/F-Droid.apk
            new Pair<>("org.fdroid.fdroid", "43238d512c1e5eb2d6569f4a3afbf5523418b82e0a3ed1552770abb9a9c9ccab"),
            //Github Bird Monitor
            new Pair<>("nz.org.cacophony.birdmonitor", "13c580e2d6f19d636be2785d82d3a12c0dc43d15185b8a54197e618d8188b2e5"),
            //F-Droid Bird Monitor
            new Pair<>("nz.org.cacophony.birdmonitor", "91f0ada061b91fc4ae2e45640a7452b38a93d8c864307872f2432f86ea6617e3"),
            //Debug key
            new Pair<>("nz.org.cacophony.birdmonitor", "700b2c3585a3ae0344294413e943b9650a14cefdf5fec40f17185f08f40ea97f")

    ));

}
