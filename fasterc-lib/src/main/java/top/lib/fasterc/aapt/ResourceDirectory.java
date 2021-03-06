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
import java.util.HashSet;
import java.util.Set;

public class ResourceDirectory {

    public String             directoryName        = null;
    public String             resourceFullFilename = null;
    public Set<ResourceEntry> resourceEntrySet     = new HashSet<ResourceEntry>();

    public ResourceDirectory(String directoryName, String resourceFullFilename) {
        this.directoryName = directoryName;
        this.resourceFullFilename = resourceFullFilename;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.directoryName, this.resourceFullFilename});
    }


    public boolean equals(Object object) {
        if (!(object instanceof ResourceDirectory)) {
            return false;
        }
        ResourceDirectory that = (ResourceDirectory) object;
        return ObjectUtil.equal(this.directoryName, that.directoryName) && ObjectUtil.equal(this.resourceFullFilename, that.resourceFullFilename);
    }
}
