package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class LayoutTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		HashMap<String, String[]> avatar = new HashMap<>();
		avatar.put("icon", new String[]{});
		avatar.put("shape", new String[]{"circle","square"});
		avatar.put("size", new String[]{"large","small","default"});
		avatar.put("src", new String[]{});
		avatar.put("srcSet", new String[]{});
		avatar.put("alt", new String[]{});
		avatar.put("loadError", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-avatar", avatar);

		// -------------------------------------------------------------------
		HashMap<String, String[]> badge = new HashMap<>();
		badge.put("color", new String[]{});
		badge.put("count", new String[]{});
		badge.put("offset", new String[]{});
		badge.put("overflowCount", new String[]{});
		badge.put("status", new String[]{"success","processing","default","error","warning"});
		badge.put("text", new String[]{});
		badge.put("numberStyle", new String[]{});
		badge.put("title", new String[]{});
		badge.put("dot", new String[]{"true", "false"});
		badge.put("showZero", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-badge", badge);

		// -------------------------------------------------------------------
		HashMap<String, String[]> calendar = new HashMap<>();
		calendar.put("dateCellRender", new String[]{});
		calendar.put("dateFullCellRender", new String[]{});
		calendar.put("defaultValue", new String[]{});
		calendar.put("disabledDate", new String[]{});
		calendar.put("locale", new String[]{});
		calendar.put("mode", new String[]{});
		calendar.put("monthCellRender", new String[]{});
		calendar.put("monthFullCellRender", new String[]{});
		calendar.put("validRange", new String[]{});
		calendar.put("value", new String[]{});
		calendar.put("headerRender", new String[]{});
		calendar.put("valueFormat", new String[]{});
		calendar.put("fullscreen", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-calendar", calendar);
		// -------------------------------------------------------------------
		HashMap<String, String[]> card = new HashMap<>();
		card.put("actions", new String[]{});
		card.put("activeTabKey", new String[]{});
		card.put("headStyle", new String[]{});
		card.put("bodyStyle", new String[]{});
		card.put("bodyStyle", new String[]{});
		card.put("cover", new String[]{});
		card.put("defaultActiveTabKey", new String[]{});
		card.put("extra", new String[]{});
		card.put("tabList", new String[]{});
		card.put("title", new String[]{});
		card.put("type", new String[]{});
		card.put("size", new String[]{"default","small"});
		card.put("bordered", new String[]{"true", "false"});
		card.put("hoverable", new String[]{"true", "false"});
		card.put("loading", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-card", card);
		// -------------------------------------------------------------------
		HashMap<String, String[]> carousel = new HashMap<>();
		carousel.put("afterChange", new String[]{});
		carousel.put("beforeChange", new String[]{});
		carousel.put("dotPosition", new String[]{});
		carousel.put("dotsClass", new String[]{});
		carousel.put("easing", new String[]{});
		carousel.put("effect", new String[]{});
		carousel.put("autoplay", new String[]{"true", "false"});
		carousel.put("dots", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-carousel", carousel);
		// -------------------------------------------------------------------
		HashMap<String, String[]> collapse = new HashMap<>();
		collapse.put("activeKey", new String[]{});
		collapse.put("defaultActiveKey", new String[]{});
		collapse.put("expandIcon", new String[]{});
		collapse.put("expandIconPosition", new String[]{"left","right"});
		collapse.put("bordered", new String[]{"true", "false"});
		collapse.put("accordion", new String[]{"true", "false"});
		collapse.put("destroyInactivePanel", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-collapse", collapse);

		HashMap<String, String[]> collapsePanel = new HashMap<>();
		collapsePanel.put("header", new String[]{});
		collapsePanel.put("key", new String[]{});
		collapsePanel.put("extra", new String[]{});
		collapsePanel.put("disabled", new String[]{"true", "false"});
		collapsePanel.put("forceRender", new String[]{"true", "false"});
		collapsePanel.put("showArrow", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-collapse-panel", collapsePanel);

		// -------------------------------------------------------------------
		HashMap<String, String[]> comment = new HashMap<>();
		comment.put("actions", new String[]{});
		comment.put("author", new String[]{});
		comment.put("avatar", new String[]{});
		comment.put("content", new String[]{});
		comment.put("datetime", new String[]{});
		TAG_CONSTANT.put("a-comment", comment);
		// -------------------------------------------------------------------
		HashMap<String, String[]> descriptions = new HashMap<>();
		descriptions.put("title", new String[]{});
		descriptions.put("column", new String[]{});
		descriptions.put("size", new String[]{"small","default","middle"});
		descriptions.put("layout", new String[]{"horizontal","vertical"});
		descriptions.put("bordered", new String[]{"true", "false"});
		descriptions.put("colon", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-descriptions", descriptions);

		HashMap<String, String[]> descriptionsItem = new HashMap<>();
		descriptionsItem.put("label", new String[]{});
		descriptionsItem.put("span", new String[]{});
		TAG_CONSTANT.put("a-descriptions-item", descriptionsItem);
		// -------------------------------------------------------------------
		HashMap<String, String[]> empty = new HashMap<>();
		empty.put("description", new String[]{});
		empty.put("imageStyle", new String[]{});
		empty.put("image", new String[]{});
		TAG_CONSTANT.put("a-empty", empty);
		// -------------------------------------------------------------------
		HashMap<String, String[]> list = new HashMap<>();
		list.put("footer", new String[]{});
		list.put("grid", new String[]{});
		list.put("header", new String[]{});
		list.put("itemLayout", new String[]{});
		list.put("loadMore", new String[]{});
		list.put("locale", new String[]{});
		list.put("size", new String[]{"default","small","middle"});
		list.put("dataSource", new String[]{});
		list.put("renderItem", new String[]{});
		list.put("rowKey", new String[]{});
		list.put("bordered", new String[]{"true", "false"});
		list.put("loading", new String[]{"true", "false"});
		list.put("pagination", new String[]{"true", "false"});
		list.put("split", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-list", list);

		HashMap<String, String[]> listItem = new HashMap<>();
		listItem.put("actions", new String[]{});
		listItem.put("extra", new String[]{});
		TAG_CONSTANT.put("a-list-item", listItem);

		HashMap<String, String[]> listItemMeta = new HashMap<>();
		listItemMeta.put("avatar", new String[]{});
		listItemMeta.put("description", new String[]{});
		listItemMeta.put("title", new String[]{});
		TAG_CONSTANT.put("a-list-item-meta", listItemMeta);
		// -------------------------------------------------------------------
		HashMap<String, String[]> popover = new HashMap<>();
		popover.put("content", new String[]{});
		popover.put("title", new String[]{});
		TAG_CONSTANT.put("a-popover", popover);
		// -------------------------------------------------------------------
		HashMap<String, String[]> statistic = new HashMap<>();
		statistic.put("decimalSeparator", new String[]{});
		statistic.put("formatter", new String[]{});
		statistic.put("groupSeparator", new String[]{});
		statistic.put("precision", new String[]{});
		statistic.put("prefix", new String[]{});
		statistic.put("suffix", new String[]{});
		statistic.put("title", new String[]{});
		statistic.put("value", new String[]{});
		statistic.put("valueStyle", new String[]{});
		statistic.put("selectable", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-statistic", statistic);

		HashMap<String, String[]> statisticCountdown = new HashMap<>();
		statisticCountdown.put("format", new String[]{});
		statisticCountdown.put("prefix", new String[]{});
		statisticCountdown.put("suffix", new String[]{});
		statisticCountdown.put("title", new String[]{});
		statisticCountdown.put("value", new String[]{});
		statisticCountdown.put("valueStyle", new String[]{});
		TAG_CONSTANT.put("a-statistic-countdown", statisticCountdown);
		// -------------------------------------------------------------------
		HashMap<String, String[]> table = new HashMap<>();
		table.put("tableLayout", new String[]{});
		table.put("childrenColumnName", new String[]{});
		table.put("columns", new String[]{});
		table.put("components", new String[]{});
		table.put("dataSource", new String[]{});
		table.put("defaultExpandedRowKeys", new String[]{});
		table.put("expandedRowKeys", new String[]{});
		table.put("expandedRowRender", new String[]{});
		table.put("expandIcon", new String[]{});
		table.put("expandIconColumnIndex", new String[]{});
		table.put("footer", new String[]{});
		table.put("indentSize", new String[]{});
		table.put("locale", new String[]{});
		table.put("pagination", new String[]{});
		table.put("rowClassName", new String[]{});
		table.put("rowKey", new String[]{});
		table.put("rowSelection", new String[]{});
		table.put("scroll", new String[]{});
		table.put("size", new String[]{"default","middle","small"});
		table.put("title", new String[]{});
		table.put("customHeaderRow", new String[]{});
		table.put("customRow", new String[]{});
		table.put("getPopupContainer", new String[]{});
		table.put("transformCellText", new String[]{});
		table.put("bordered", new String[]{"true", "false"});
		table.put("defaultExpandAllRows", new String[]{"true", "false"});
		table.put("expandRowByClick", new String[]{"true", "false"});
		table.put("loading", new String[]{"true", "false"});
		table.put("showHeader", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-table", table);
		// -------------------------------------------------------------------
		HashMap<String, String[]> tabs = new HashMap<>();
		tabs.put("activeKey", new String[]{});
		tabs.put("defaultActiveKey", new String[]{});
		tabs.put("size", new String[]{});
		tabs.put("tabBarExtraContent", new String[]{});
		tabs.put("tabBarStyle", new String[]{});
		tabs.put("tabPosition", new String[]{});
		tabs.put("type", new String[]{});
		tabs.put("tabBarGutter", new String[]{});
		tabs.put("animated", new String[]{"true", "false"});
		tabs.put("hideAdd", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-tabs", tabs);

		HashMap<String, String[]> tabPane = new HashMap<>();
		tabPane.put("forceRender", new String[]{"true", "false"});
		tabPane.put("key", new String[]{});
		tabPane.put("tab", new String[]{});
		TAG_CONSTANT.put("a-tab-pane", tabPane);
		// -------------------------------------------------------------------
		HashMap<String, String[]> tag = new HashMap<>();
		tag.put("afterClose", new String[]{});
		tag.put("color", new String[]{});
		tag.put("closable", new String[]{"true", "false"});
		tag.put("visible", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-tag", tag);
		// -------------------------------------------------------------------
		HashMap<String, String[]> checkableTag = new HashMap<>();
		checkableTag.put("checked", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-checkable-tag", checkableTag);
		// -------------------------------------------------------------------
		HashMap<String, String[]> timeline = new HashMap<>();
		timeline.put("pending", new String[]{"true", "false"});
		timeline.put("reverse", new String[]{"true", "false"});
		timeline.put("pendingDot", new String[]{});
		timeline.put("mode", new String[]{"left","alternate","right"});
		TAG_CONSTANT.put("a-timeline", timeline);

		HashMap<String, String[]> timelineItem = new HashMap<>();
		timelineItem.put("color", new String[]{});
		timelineItem.put("dot", new String[]{});
		timelineItem.put("position", new String[]{"left", "right"});
		TAG_CONSTANT.put("a-timeline-item", timelineItem);
		// -------------------------------------------------------------------
		HashMap<String, String[]> tooltip = new HashMap<>();
		tooltip.put("title", new String[]{});
		tooltip.put("getPopupContainer", new String[]{});
		tooltip.put("mouseEnterDelay", new String[]{});
		tooltip.put("mouseLeaveDelay", new String[]{});
		tooltip.put("overlayClassName", new String[]{});
		tooltip.put("overlayStyle", new String[]{});
		tooltip.put("placement", new String[]{"top","left","right","bottom","topLeft","topRight","bottomLeft","bottomRight","leftTop","leftBottom","rightTop","rightBottom"});
		tooltip.put("trigger", new String[]{"hover","focus","click","contextmenu"});
		tooltip.put("align", new String[]{});
		tooltip.put("arrowPointAtCenter", new String[]{"true", "false"});
		tooltip.put("autoAdjustOverflow", new String[]{"true", "false"});
		tooltip.put("defaultVisible", new String[]{"true", "false"});
		tooltip.put("visible", new String[]{"true", "false"});
		tooltip.put("destroyTooltipOnHide", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-tooltip", tooltip);
		// -------------------------------------------------------------------
		HashMap<String, String[]> tree = new HashMap<>();
		tree.put("blockNode", new String[]{"true", "false"});
		tree.put("autoExpandParent", new String[]{"true", "false"});
		tree.put("checkable", new String[]{"true", "false"});
		tree.put("checkStrictly", new String[]{"true", "false"});
		tree.put("defaultExpandAll", new String[]{"true", "false"});
		tree.put("defaultExpandParent", new String[]{"true", "false"});
		tree.put("disabled", new String[]{"true", "false"});
		tree.put("draggable", new String[]{"true", "false"});
		tree.put("multiple", new String[]{"true", "false"});
		tree.put("selectable", new String[]{"true", "false"});
		tree.put("showIcon", new String[]{"true", "false"});
		tree.put("showLine", new String[]{"true", "false"});
		tree.put("treeData", new String[]{});
		tree.put("replaceFields", new String[]{});
		tree.put("checkedKeys", new String[]{});
		tree.put("defaultCheckedKeys", new String[]{});
		tree.put("defaultExpandedKeys", new String[]{});
		tree.put("defaultSelectedKeys", new String[]{});
		tree.put("expandedKeys", new String[]{});
		tree.put("filterTreeNode", new String[]{});
		tree.put("loadData", new String[]{});
		tree.put("loadedKeys", new String[]{});
		tree.put("selectedKeys", new String[]{});
		tree.put("switcherIcon", new String[]{});
		TAG_CONSTANT.put("a-tree", tree);

		HashMap<String, String[]> treeNode = new HashMap<>();
		treeNode.put("class", new String[]{});
		treeNode.put("style", new String[]{});
		treeNode.put("icon", new String[]{});
		treeNode.put("key", new String[]{});
		treeNode.put("title", new String[]{});
		treeNode.put("scopedSlots", new String[]{});
		treeNode.put("on", new String[]{});
		treeNode.put("checkable", new String[]{"true", "false"});
		treeNode.put("disableCheckbox", new String[]{"true", "false"});
		treeNode.put("disabled", new String[]{"true", "false"});
		treeNode.put("isLeaf", new String[]{"true", "false"});
		treeNode.put("selectable", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-tree-node", treeNode);
		// -------------------------------------------------------------------
	}
}
