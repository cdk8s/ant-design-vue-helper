package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class LayoutTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		HashMap<String, String[]> alert = new HashMap<>();
		alert.put("afterClose", new String[]{});
		alert.put("closeText", new String[]{});
		alert.put("description", new String[]{});
		alert.put("icon", new String[]{});
		alert.put("message", new String[]{});
		alert.put("type", new String[]{"success","info","warning","error"});
		alert.put("banner", new String[]{"true","false"});
		alert.put("closable", new String[]{"true","false"});
		alert.put("showIcon", new String[]{"true","false"});
		TAG_CONSTANT.put("a-alert", alert);

		// -------------------------------------------------------------------
		HashMap<String, String[]> drawer = new HashMap<>();
		drawer.put("closable", new String[]{"true", "false"});
		drawer.put("destroyOnClose", new String[]{"true", "false"});
		drawer.put("maskClosable", new String[]{"true", "false"});
		drawer.put("mask", new String[]{"true", "false"});
		drawer.put("visible", new String[]{"true", "false"});
		drawer.put("keyboard", new String[]{"true", "false"});
		drawer.put("getContainer", new String[]{});
		drawer.put("maskStyle", new String[]{});
		drawer.put("title", new String[]{});
		drawer.put("wrapClassName", new String[]{});
		drawer.put("wrapStyle", new String[]{});
		drawer.put("drawerStyle", new String[]{});
		drawer.put("headerStyle", new String[]{});
		drawer.put("bodyStyle", new String[]{});
		drawer.put("width", new String[]{});
		drawer.put("height", new String[]{});
		drawer.put("zIndex", new String[]{});
		drawer.put("placement", new String[]{"top","right","bottom","left"});
		drawer.put("handle", new String[]{});
		drawer.put("afterVisibleChange", new String[]{});
		TAG_CONSTANT.put("a-drawer", drawer);
		// -------------------------------------------------------------------
		HashMap<String, String[]> modal = new HashMap<>();
		modal.put("afterClose", new String[]{});
		modal.put("bodyStyle", new String[]{});
		modal.put("cancelText", new String[]{});
		modal.put("closeIcon", new String[]{});
		modal.put("footer", new String[]{});
		modal.put("getContainer", new String[]{});
		modal.put("maskStyle", new String[]{});
		modal.put("okText", new String[]{});
		modal.put("okType", new String[]{});
		modal.put("okButtonProps", new String[]{});
		modal.put("cancelButtonProps", new String[]{});
		modal.put("title", new String[]{});
		modal.put("width", new String[]{});
		modal.put("wrapClassName", new String[]{});
		modal.put("zIndex", new String[]{});
		modal.put("dialogStyle", new String[]{});
		modal.put("dialogClass", new String[]{});
		modal.put("centered", new String[]{"true", "false"});
		modal.put("closable", new String[]{"true", "false"});
		modal.put("confirmLoading", new String[]{"true", "false"});
		modal.put("destroyOnClose", new String[]{"true", "false"});
		modal.put("forceRender", new String[]{"true", "false"});
		modal.put("keyboard", new String[]{"true", "false"});
		modal.put("mask", new String[]{"true", "false"});
		modal.put("maskClosable", new String[]{"true", "false"});
		modal.put("visible", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-modal", modal);
		// -------------------------------------------------------------------
		HashMap<String, String[]> popconfirm = new HashMap<>();
		popconfirm.put("cancelText", new String[]{});
		popconfirm.put("okText", new String[]{});
		popconfirm.put("okType", new String[]{});
		popconfirm.put("title", new String[]{});
		popconfirm.put("icon", new String[]{});
		popconfirm.put("disabled", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-popconfirm", popconfirm);
		// -------------------------------------------------------------------
		HashMap<String, String[]> progress = new HashMap<>();
		progress.put("type", new String[]{"line","circle","dashboard"});
		progress.put("format", new String[]{});
		progress.put("percent", new String[]{});
		progress.put("status", new String[]{"success","exception","normal","active"});
		progress.put("strokeLinecap", new String[]{"round","square"});
		progress.put("strokeColor", new String[]{});
		progress.put("successPercent", new String[]{});
		progress.put("showInfo", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-progress", progress);
		// -------------------------------------------------------------------
		HashMap<String, String[]> result = new HashMap<>();
		result.put("title", new String[]{});
		result.put("subTitle", new String[]{});
		result.put("status", new String[]{"success","error","info","warning","404","403",'500'});
		result.put("icon", new String[]{});
		result.put("extra", new String[]{});
		TAG_CONSTANT.put("a-result", result);
		// -------------------------------------------------------------------
		HashMap<String, String[]> skeleton = new HashMap<>();
		skeleton.put("active", new String[]{"true", "false"});
		skeleton.put("avatar", new String[]{"true", "false"});
		skeleton.put("loading", new String[]{"true", "false"});
		skeleton.put("paragraph", new String[]{"true", "false"});
		skeleton.put("title", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-skeleton", skeleton);
		// -------------------------------------------------------------------
		HashMap<String, String[]> spin = new HashMap<>();
		spin.put("delay", new String[]{});
		spin.put("indicator", new String[]{});
		spin.put("size", new String[]{});
		spin.put("tip", new String[]{});
		spin.put("wrapperClassName", new String[]{});
		spin.put("spinning", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-spin", spin);
		// -------------------------------------------------------------------
		// -------------------------------------------------------------------
		// -------------------------------------------------------------------
	}
}
