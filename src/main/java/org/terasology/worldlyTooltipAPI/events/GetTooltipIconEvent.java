// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.worldlyTooltipAPI.events;

import org.terasology.engine.entitySystem.event.Event;
import org.terasology.engine.rendering.assets.texture.TextureRegion;

/*
 *  This event is sent from the WorldlyTooltipAPI module while setting the icon,
 *  whenever the hit-entity does not have a BlockComponent.
 */
public class GetTooltipIconEvent implements Event {
    private TextureRegion icon = null;

    public TextureRegion getIcon() {
        return icon;
    }

    public void setIcon(TextureRegion icon) {
        this.icon = icon;
    }
}
