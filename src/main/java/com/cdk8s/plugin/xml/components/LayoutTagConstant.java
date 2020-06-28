package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class LayoutTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		HashMap<String, String[]> row = new HashMap<>();
		row.put("align", new String[]{"top", "middle", "bottom"});
		row.put("gutter", new String[]{});
		row.put("justify", new String[]{"start", "end", "center", "space-around", "space-between"});
		row.put("type", new String[]{"flex"});
		TAG_CONSTANT.put("a-row", row);

		// -------------------------------------------------------------------

		HashMap<String, String[]> col = new HashMap<>();
		col.put("offset", new String[]{});
		col.put("order", new String[]{});
		col.put("pull", new String[]{});
		col.put("push", new String[]{});
		col.put("span", new String[]{});
		col.put("xs", new String[]{});
		col.put("sm", new String[]{});
		col.put("md", new String[]{});
		col.put("lg", new String[]{});
		col.put("xl", new String[]{});
		col.put("xxl", new String[]{});
		TAG_CONSTANT.put("a-col", col);

		// -------------------------------------------------------------------

		HashMap<String, String[]> layout = new HashMap<>();
		layout.put("class", new String[]{});
		layout.put("style", new String[]{});
		layout.put("hasSider", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-layout", layout);

		// -------------------------------------------------------------------

		HashMap<String, String[]> layoutSider = new HashMap<>();
		layoutSider.put("breakpoint", new String[]{});
		layoutSider.put("collapsed", new String[]{});
		layoutSider.put("collapsedWidth", new String[]{});
		layoutSider.put("collapsible", new String[]{});
		layoutSider.put("defaultCollapsed", new String[]{});
		layoutSider.put("reverseArrow", new String[]{"true", "false"});
		layoutSider.put("theme", new String[]{"light", "dark"});
		layoutSider.put("trigger", new String[]{});
		layoutSider.put("width", new String[]{});
		TAG_CONSTANT.put("a-layout-sider", layoutSider);

		// -------------------------------------------------------------------
	}
}
