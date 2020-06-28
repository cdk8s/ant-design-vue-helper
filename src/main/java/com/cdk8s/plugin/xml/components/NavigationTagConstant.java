package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class NavigationTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		HashMap<String, String[]> affix = new HashMap<>();
		affix.put("offsetBottom", new String[]{});
		affix.put("offsetTop", new String[]{});
		affix.put("target", new String[]{});
		TAG_CONSTANT.put("a-affix", affix);

		// -------------------------------------------------------------------

		HashMap<String, String[]> breadcrumb = new HashMap<>();
		breadcrumb.put("itemRender", new String[]{});
		breadcrumb.put("params", new String[]{});
		breadcrumb.put("routes", new String[]{});
		breadcrumb.put("separator", new String[]{});
		TAG_CONSTANT.put("a-breadcrumb", breadcrumb);

		// -------------------------------------------------------------------

		HashMap<String, String[]> dropdown = new HashMap<>();
		dropdown.put("disabled", new String[]{"true", "false"});
		dropdown.put("getPopupContainer", new String[]{});
		dropdown.put("overlay", new String[]{});
		dropdown.put("overlayStyle", new String[]{});
		dropdown.put("placement", new String[]{"bottomLeft", "bottomCenter", "bottomRight", "topLeft", "topCenter", "topRight"});
		dropdown.put("trigger", new String[]{"click", "hover", "contextmenu"});
		dropdown.put("visible", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-dropdown", dropdown);


		HashMap<String, String[]> dropdownButton = new HashMap<>();
		dropdownButton.put("disabled", new String[]{"true", "false"});
		dropdownButton.put("overlay", new String[]{});
		dropdownButton.put("placement", new String[]{"bottomLeft", "bottomCenter", "bottomRight", "topLeft", "topCenter", "topRight"});
		dropdownButton.put("size", new String[]{"default", "large", "small"});
		dropdownButton.put("trigger", new String[]{"click", "hover", "contextmenu"});
		dropdownButton.put("type", new String[]{"primary", "dashed", "danger", "link"});
		dropdownButton.put("visible", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-dropdown-button", dropdownButton);

		// -------------------------------------------------------------------


		HashMap<String, String[]> menu = new HashMap<>();
		menu.put("defaultOpenKeys", new String[]{});
		menu.put("defaultSelectedKeys", new String[]{});
		menu.put("forceSubMenuRender", new String[]{"true", "false"});
		menu.put("inlineCollapsed", new String[]{"true", "false"});
		menu.put("inlineIndent", new String[]{});
		menu.put("mode", new String[]{"vertical", "vertical-right", "horizontal", "inline"});
		menu.put("multiple", new String[]{"true", "false"});
		menu.put("openKeys", new String[]{});
		menu.put("selectable", new String[]{"true", "false"});
		menu.put("selectedKeys", new String[]{});
		menu.put("subMenuCloseDelay", new String[]{});
		menu.put("subMenuOpenDelay", new String[]{});
		menu.put("theme", new String[]{"dark", "light"});
		menu.put("overflowedIndicator", new String[]{});
		TAG_CONSTANT.put("a-menu", menu);

		HashMap<String, String[]> menuItem = new HashMap<>();
		menuItem.put("disabled", new String[]{"true", "false"});
		menuItem.put("key", new String[]{});
		menuItem.put("title", new String[]{});
		TAG_CONSTANT.put("a-menu-item", menuItem);

		HashMap<String, String[]> menuSubMenu = new HashMap<>();
		menuSubMenu.put("disabled", new String[]{"true", "false"});
		menuSubMenu.put("key", new String[]{});
		menuSubMenu.put("title", new String[]{});
		TAG_CONSTANT.put("a-sub-menu", menuSubMenu);

		HashMap<String, String[]> menuItemGroup = new HashMap<>();
		menuItemGroup.put("title", new String[]{});
		TAG_CONSTANT.put("a-menu-item-group", menuItemGroup);

		// -------------------------------------------------------------------

		HashMap<String, String[]> pagination = new HashMap<>();
		pagination.put("current", new String[]{});
		pagination.put("defaultCurrent", new String[]{});
		pagination.put("defaultPageSize", new String[]{});
		pagination.put("hideOnSinglePage", new String[]{"true", "false"});
		pagination.put("itemRender", new String[]{});
		pagination.put("pageSize", new String[]{});
		pagination.put("pageSizeOptions", new String[]{});
		menuSubMenu.put("showQuickJumper", new String[]{"true", "false"});
		menuSubMenu.put("showSizeChanger", new String[]{"true", "false"});
		pagination.put("showTotal", new String[]{});
		menuSubMenu.put("simple", new String[]{"true", "false"});
		pagination.put("size", new String[]{});
		pagination.put("total", new String[]{});
		TAG_CONSTANT.put("a-pagination", pagination);

		// -------------------------------------------------------------------

		HashMap<String, String[]> steps = new HashMap<>();
		steps.put("current", new String[]{});
		steps.put("direction", new String[]{"horizontal", "vertical"});
		steps.put("labelPlacement", new String[]{"horizontal", "vertical"});
		steps.put("progressDot", new String[]{"true", "false"});
		steps.put("size", new String[]{"default", "small"});
		steps.put("status", new String[]{"wait", "process", "finish", "error"});
		steps.put("initial", new String[]{});
		TAG_CONSTANT.put("a-steps", steps);

		HashMap<String, String[]> step = new HashMap<>();
		step.put("description", new String[]{});
		step.put("icon", new String[]{});
		step.put("status", new String[]{"wait", "process", "finish", "error"});
		step.put("title", new String[]{});
		TAG_CONSTANT.put("a-step", step);

		// -------------------------------------------------------------------

	}
}
