/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package top.lib.fasterc.aapt;

import java.util.Arrays;

public class ResourceEntry {

    public String name  = null;
    public String value = null;

    public ResourceEntry(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name});
    }


    public boolean equals(Object object) {
        if (!(object instanceof ResourceEntry)) {
            return false;
        }
        ResourceEntry that = (ResourceEntry) object;
        return ObjectUtil.equal(this.name, that.name);
    }
}
