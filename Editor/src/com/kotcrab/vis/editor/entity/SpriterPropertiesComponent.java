/*
 * Copyright 2014-2015 See AUTHORS file.
 *
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

package com.kotcrab.vis.editor.entity;

import com.artemis.Component;
import com.kotcrab.vis.runtime.util.annotation.VisTag;
import com.kotcrab.vis.runtime.util.autotable.ATProperty;

/** @author Kotcrab */
public class SpriterPropertiesComponent extends Component {
	@VisTag(0) @ATProperty(fieldName = "Scale", min = 0.000001f)
	public float scale;

	@VisTag(3)
	public int animation = 0;

	@VisTag(1) @ATProperty(fieldName = "Play animation on start")
	public boolean playOnStart = false;
	@VisTag(2) @ATProperty(fieldName = "Preview in editor")
	public boolean previewInEditor = false;

	public SpriterPropertiesComponent (float scale) {
		this.scale = scale;
	}
}
