package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class GeneralTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		HashMap<String, String[]> button = new HashMap<>();
		button.put("disabled", new String[]{"true", "false"});
		button.put("ghost", new String[]{"true", "false"});
		button.put("htmlType", new String[]{"button", "submit", "reset"});
		button.put("icon", new String[]{});
		button.put("loading", new String[]{"true", "false"});
		button.put("shape", new String[]{"circle", "round"});
		button.put("size", new String[]{"default", "small", "large"});
		button.put("type", new String[]{"default", "primary", "dashed", "danger", "link"});
		button.put("block", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-button", button);

		// -------------------------------------------------------------------

		HashMap<String, String[]> icon = new HashMap<>();
		icon.put("type", new String[]{});
		icon.put("style", new String[]{});
		icon.put("theme", new String[]{"filled","outlined","twoTone"});
		icon.put("spin", new String[]{"true", "false"});
		icon.put("rotate", new String[]{});
		icon.put("component", new String[]{});
		icon.put("twoToneColor", new String[]{});
		TAG_CONSTANT.put("a-icon", icon);

		// -------------------------------------------------------------------
	}
}
