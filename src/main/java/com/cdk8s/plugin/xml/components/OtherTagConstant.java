package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class LayoutTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		HashMap<String, String[]> anchor = new HashMap<>();
		anchor.put("affix", new String[]{"true", "false"});
		anchor.put("showInkInFixed", new String[]{"true", "false"});
		anchor.put("bounds", new String[]{});
		anchor.put("getContainer", new String[]{});
		anchor.put("offsetBottom", new String[]{});
		anchor.put("offsetTop", new String[]{});
		anchor.put("wrapperClass", new String[]{});
		anchor.put("wrapperStyle", new String[]{});
		anchor.put("getCurrentAnchor", new String[]{});
		anchor.put("targetOffset", new String[]{});
		TAG_CONSTANT.put("a-anchor", anchor);

		HashMap<String, String[]> anchorLink = new HashMap<>();
		anchorLink.put("href", new String[]{});
		anchorLink.put("title", new String[]{});
		anchorLink.put("target", new String[]{});
		TAG_CONSTANT.put("a-anchor-link", anchorLink);
		// -------------------------------------------------------------------
		HashMap<String, String[]> backTop = new HashMap<>();
		backTop.put("backTop", new String[]{});
		backTop.put("visibilityHeight", new String[]{});
		TAG_CONSTANT.put("a-back-top", backTop);
		// -------------------------------------------------------------------
		HashMap<String, String[]> configProvider = new HashMap<>();
		configProvider.put("autoInsertSpaceInButton", new String[]{"true", "false"});
		configProvider.put("csp", new String[]{});
		configProvider.put("renderEmpty", new String[]{});
		configProvider.put("getPopupContainer", new String[]{});
		configProvider.put("locale", new String[]{});
		configProvider.put("pageHeader", new String[]{});
		configProvider.put("transformCellText", new String[]{});
		TAG_CONSTANT.put("a-config-provider", configProvider);
		// -------------------------------------------------------------------
		HashMap<String, String[]> divider = new HashMap<>();
		divider.put("dashed", new String[]{"true", "false"});
		divider.put("orientation", new String[]{"left","right"});
		divider.put("type", new String[]{"horizontal","vertical"});
		TAG_CONSTANT.put("a-divider", divider);
		// -------------------------------------------------------------------
		HashMap<String, String[]> localeProvider = new HashMap<>();
		localeProvider.put("locale", new String[]{});
		TAG_CONSTANT.put("a-locale-provider", localeProvider);
		// -------------------------------------------------------------------
		// -------------------------------------------------------------------
		// -------------------------------------------------------------------
	}
}
