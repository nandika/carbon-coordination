/*
 * Copyright (c) 2017, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.cluster.coordinator.rdbms.test;

import org.wso2.carbon.cluster.coordinator.commons.MemberEventListener;
import org.wso2.carbon.cluster.coordinator.commons.node.NodeDetail;

import java.util.ArrayList;
import java.util.List;

public class EventListener extends MemberEventListener {

    public List<NodeDetail> memberAdded = new ArrayList<>();
    public List<NodeDetail> memberRemoved = new ArrayList<>();
    public List<NodeDetail> coordinatorChanged = new ArrayList<>();

    @Override public void memberAdded(NodeDetail nodeDetail) {
        this.memberAdded.add(nodeDetail);
    }

    @Override public void memberRemoved(NodeDetail nodeDetail) {
        this.memberRemoved.add(nodeDetail);
    }

    @Override public void coordinatorChanged(NodeDetail nodeDetail) {
        this.coordinatorChanged.add(nodeDetail);
    }

    @Override
    public void becameUnresponsive(String nodeId) {

    }

}
