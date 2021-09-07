/*
 * Copyright 2017 MovingBlocks
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
package org.terasology.worldlyTooltipAPI.events;

import org.terasology.engine.rendering.assets.texture.TextureRegion;
import org.terasology.gestalt.entitysystem.event.Event;

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
