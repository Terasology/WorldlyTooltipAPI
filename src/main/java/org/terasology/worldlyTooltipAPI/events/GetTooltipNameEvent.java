// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.worldlyTooltipAPI.events;

import org.terasology.engine.entitySystem.event.Event;

/*
 *  This event is sent from the WorldlyTooltipAPI module while setting the name,
 *  whenever the hit-entity does not have a BlockComponent.
 */
public class GetTooltipNameEvent implements Event {
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
