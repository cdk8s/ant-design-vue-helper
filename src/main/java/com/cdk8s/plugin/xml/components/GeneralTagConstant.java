package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class GeneralTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		// http://localhost:5000/components/button-cn/#api
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
	}
}
