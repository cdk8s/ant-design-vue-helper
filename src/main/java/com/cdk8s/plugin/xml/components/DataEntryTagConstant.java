package com.cdk8s.plugin.xml.components;

import java.util.HashMap;


public class DataEntryTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {

		HashMap<String, String[]> autoComplete = new HashMap<>();
		autoComplete.put("allowClear", new String[]{"true", "false"});
		autoComplete.put("autoFocus", new String[]{"true", "false"});
		autoComplete.put("backfill", new String[]{"true", "false"});
		autoComplete.put("dataSource", new String[]{});
		autoComplete.put("defaultActiveFirstOption", new String[]{"true", "false"});
		autoComplete.put("defaultValue", new String[]{});
		autoComplete.put("disabled", new String[]{"true", "false"});
		autoComplete.put("filterOption", new String[]{"true", "false"});
		autoComplete.put("optionLabelProp", new String[]{});
		autoComplete.put("placeholder", new String[]{});
		autoComplete.put("value", new String[]{});
		autoComplete.put("defaultOpen", new String[]{"true", "false"});
		autoComplete.put("open", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-auto-complete", autoComplete);

		// -------------------------------------------------------------------

		HashMap<String, String[]> cascader = new HashMap<>();
		cascader.put("allowClear", new String[]{"true", "false"});
		cascader.put("autoFocus", new String[]{"true", "false"});
		cascader.put("changeOnSelect", new String[]{"true", "false"});
		cascader.put("defaultValue", new String[]{});
		cascader.put("disabled", new String[]{"true", "false"});
		cascader.put("displayRender", new String[]{});
		cascader.put("expandTrigger", new String[]{"click", "hover"});
		cascader.put("fieldNames", new String[]{});
		cascader.put("getPopupContainer", new String[]{});
		cascader.put("loadData", new String[]{});
		cascader.put("notFoundContent", new String[]{});
		cascader.put("options", new String[]{});
		cascader.put("placeholder", new String[]{});
		cascader.put("popupClassName", new String[]{});
		cascader.put("popupStyle", new String[]{});
		cascader.put("popupPlacement", new String[]{"bottomLeft", "bottomRight", "topLeft", "topRight"});
		cascader.put("popupVisible", new String[]{"true", "false"});
		cascader.put("showSearch", new String[]{"true", "false"});
		cascader.put("size", new String[]{"default", "small", "large"});
		cascader.put("suffixIcon", new String[]{});
		cascader.put("value", new String[]{});
		TAG_CONSTANT.put("a-cascader", cascader);

		// -------------------------------------------------------------------

		HashMap<String, String[]> checkbox = new HashMap<>();
		checkbox.put("autoFocus", new String[]{"true", "false"});
		checkbox.put("checked", new String[]{"true", "false"});
		checkbox.put("defaultChecked", new String[]{"true", "false"});
		checkbox.put("disabled", new String[]{"true", "false"});
		checkbox.put("indeterminate", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-checkbox", checkbox);

		// -------------------------------------------------------------------

		HashMap<String, String[]> datePicker = new HashMap<>();
		datePicker.put("allowClear", new String[]{"true", "false"});
		datePicker.put("autoFocus", new String[]{"true", "false"});
		datePicker.put("dateRender", new String[]{});
		datePicker.put("disabled", new String[]{"true", "false"});
		datePicker.put("disabledDate", new String[]{});
		datePicker.put("getCalendarContainer", new String[]{});
		datePicker.put("locale", new String[]{});
		datePicker.put("open", new String[]{"true", "false"});
		datePicker.put("placeholder", new String[]{});
		datePicker.put("popupStyle", new String[]{});
		datePicker.put("dropdownClassName", new String[]{});
		datePicker.put("size", new String[]{"default", "large", "small"});
		datePicker.put("suffixIcon", new String[]{});
		datePicker.put("defaultValue", new String[]{});
		datePicker.put("defaultPickerValue", new String[]{});
		datePicker.put("disabledTime", new String[]{});
		datePicker.put("format", new String[]{"YYYY-MM-DD", "YYYY-MM-DD HH:mm:ss"});
		datePicker.put("mode", new String[]{"time", "date", "month", "year"});
		datePicker.put("renderExtraFooter", new String[]{});
		datePicker.put("showTime", new String[]{});
		datePicker.put("showToday", new String[]{"true", "false"});
		datePicker.put("value", new String[]{});
		TAG_CONSTANT.put("a-date-picker", datePicker);

		HashMap<String, String[]> monthPicker = new HashMap<>();
		monthPicker.put("allowClear", new String[]{"true", "false"});
		monthPicker.put("autoFocus", new String[]{"true", "false"});
		monthPicker.put("dateRender", new String[]{});
		monthPicker.put("disabled", new String[]{"true", "false"});
		monthPicker.put("disabledDate", new String[]{});
		monthPicker.put("getCalendarContainer", new String[]{});
		monthPicker.put("locale", new String[]{});
		monthPicker.put("open", new String[]{"true", "false"});
		monthPicker.put("placeholder", new String[]{});
		monthPicker.put("popupStyle", new String[]{});
		monthPicker.put("dropdownClassName", new String[]{});
		monthPicker.put("size", new String[]{"default", "large", "small"});
		monthPicker.put("suffixIcon", new String[]{});
		monthPicker.put("defaultValue", new String[]{});
		monthPicker.put("defaultPickerValue", new String[]{});
		monthPicker.put("format", new String[]{"YYYY-MM"});
		monthPicker.put("monthCellContentRender", new String[]{});
		monthPicker.put("renderExtraFooter", new String[]{});
		monthPicker.put("value", new String[]{});
		TAG_CONSTANT.put("a-month-picker", monthPicker);

		HashMap<String, String[]> rangePicker = new HashMap<>();
		rangePicker.put("allowClear", new String[]{"true", "false"});
		rangePicker.put("autoFocus", new String[]{"true", "false"});
		rangePicker.put("dateRender", new String[]{});
		rangePicker.put("disabled", new String[]{"true", "false"});
		rangePicker.put("disabledDate", new String[]{});
		rangePicker.put("getCalendarContainer", new String[]{});
		rangePicker.put("locale", new String[]{});
		rangePicker.put("open", new String[]{"true", "false"});
		rangePicker.put("placeholder", new String[]{});
		rangePicker.put("popupStyle", new String[]{});
		rangePicker.put("dropdownClassName", new String[]{});
		rangePicker.put("size", new String[]{"default", "large", "small"});
		rangePicker.put("suffixIcon", new String[]{});
		rangePicker.put("defaultValue", new String[]{});
		rangePicker.put("defaultPickerValue", new String[]{});
		rangePicker.put("disabledTime", new String[]{});
		rangePicker.put("format", new String[]{"YYYY-MM-DD", "YYYY-MM-DD HH:mm:ss"});
		rangePicker.put("ranges", new String[]{});
		rangePicker.put("renderExtraFooter", new String[]{});
		rangePicker.put("showTime", new String[]{});
		rangePicker.put("value", new String[]{});
		TAG_CONSTANT.put("a-range-picker", rangePicker);

		HashMap<String, String[]> weekPicker = new HashMap<>();
		weekPicker.put("allowClear", new String[]{"true", "false"});
		weekPicker.put("autoFocus", new String[]{"true", "false"});
		weekPicker.put("dateRender", new String[]{});
		weekPicker.put("disabled", new String[]{"true", "false"});
		weekPicker.put("disabledDate", new String[]{});
		weekPicker.put("getCalendarContainer", new String[]{});
		weekPicker.put("locale", new String[]{});
		weekPicker.put("open", new String[]{"true", "false"});
		weekPicker.put("placeholder", new String[]{});
		weekPicker.put("popupStyle", new String[]{});
		weekPicker.put("dropdownClassName", new String[]{});
		weekPicker.put("size", new String[]{"default", "large", "small"});
		weekPicker.put("suffixIcon", new String[]{});
		weekPicker.put("defaultValue", new String[]{});
		weekPicker.put("defaultPickerValue", new String[]{});
		weekPicker.put("format", new String[]{"YYYY-wo"});
		weekPicker.put("value", new String[]{});
		weekPicker.put("renderExtraFooter", new String[]{});
		TAG_CONSTANT.put("a-week-picker", weekPicker);


		// -------------------------------------------------------------------

		HashMap<String, String[]> form = new HashMap<>();
		form.put("form", new String[]{});
		form.put("hideRequiredMark", new String[]{"true", "false"});
		form.put("layout", new String[]{"horizontal", "vertical", "inline"});
		form.put("labelCol", new String[]{});
		form.put("wrapperCol", new String[]{});
		form.put("selfUpdate", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-form", form);

		HashMap<String, String[]> formItem = new HashMap<>();
		formItem.put("colon", new String[]{"true", "false"});
		formItem.put("extra", new String[]{});
		formItem.put("hasFeedback", new String[]{"true", "false"});
		formItem.put("help", new String[]{});
		formItem.put("label", new String[]{});
		formItem.put("labelCol", new String[]{});
		formItem.put("required", new String[]{"true", "false"});
		formItem.put("validateStatus", new String[]{});
		formItem.put("wrapperCol", new String[]{});
		formItem.put("selfUpdate", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-form-item", formItem);

		// -------------------------------------------------------------------


		HashMap<String, String[]> input = new HashMap<>();
		input.put("addonAfter", new String[]{});
		input.put("addonBefore", new String[]{});
		input.put("defaultValue", new String[]{});
		input.put("id", new String[]{});
		input.put("prefix", new String[]{});
		input.put("disabled", new String[]{"true", "false"});
		input.put("size", new String[]{"default", "large", "small"});
		input.put("suffix", new String[]{});
		input.put("type", new String[]{});
		input.put("value", new String[]{});
		input.put("allowClear", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-input", input);

		HashMap<String, String[]> textarea = new HashMap<>();
		textarea.put("autosize", new String[]{"true", "false"});
		textarea.put("defaultValue", new String[]{});
		textarea.put("value", new String[]{});
		TAG_CONSTANT.put("a-textarea", textarea);

		HashMap<String, String[]> inputSearch = new HashMap<>();
		inputSearch.put("enterButton", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-input-search", inputSearch);

		HashMap<String, String[]> inputGroup = new HashMap<>();
		inputGroup.put("compact", new String[]{"true", "false"});
		inputGroup.put("size", new String[]{"default", "large", "small"});
		TAG_CONSTANT.put("a-input-group", inputGroup);

		HashMap<String, String[]> inputPassword = new HashMap<>();
		inputPassword.put("visibilityToggle", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-input-password", inputPassword);

		// -------------------------------------------------------------------


		HashMap<String, String[]> inputNumber = new HashMap<>();
		inputNumber.put("autoFocus", new String[]{"true", "false"});
		inputNumber.put("defaultValue", new String[]{});
		inputNumber.put("disabled", new String[]{"true", "false"});
		inputNumber.put("formatter", new String[]{});
		inputNumber.put("max", new String[]{});
		inputNumber.put("min", new String[]{});
		inputNumber.put("parser", new String[]{});
		inputNumber.put("precision", new String[]{});
		inputNumber.put("decimalSeparator", new String[]{});
		inputNumber.put("size", new String[]{});
		inputNumber.put("step", new String[]{});
		inputNumber.put("value", new String[]{});
		TAG_CONSTANT.put("a-input-number", inputNumber);

		// -------------------------------------------------------------------


		HashMap<String, String[]> radio = new HashMap<>();
		radio.put("autoFocus", new String[]{"true", "false"});
		radio.put("checked", new String[]{"true", "false"});
		radio.put("defaultChecked", new String[]{"true", "false"});
		radio.put("value", new String[]{});
		TAG_CONSTANT.put("a-radio", radio);

		HashMap<String, String[]> radioGroup = new HashMap<>();
		radioGroup.put("defaultValue", new String[]{});
		radioGroup.put("disabled", new String[]{"true", "false"});
		radioGroup.put("name", new String[]{});
		radioGroup.put("options", new String[]{});
		radioGroup.put("size", new String[]{"default", "large", "small"});
		radioGroup.put("value", new String[]{});
		radioGroup.put("buttonStyle", new String[]{"outline", "solid"});
		TAG_CONSTANT.put("a-radio-group", radioGroup);

		// -------------------------------------------------------------------

		HashMap<String, String[]> rate = new HashMap<>();
		rate.put("allowClear", new String[]{"true", "false"});
		rate.put("allowHalf", new String[]{"true", "false"});
		rate.put("autoFocus", new String[]{"true", "false"});
		rate.put("character", new String[]{});
		rate.put("count", new String[]{});
		rate.put("defaultValue", new String[]{});
		rate.put("disabled", new String[]{"true", "false"});
		rate.put("tooltips", new String[]{});
		rate.put("value", new String[]{});
		TAG_CONSTANT.put("a-rate", rate);

		// -------------------------------------------------------------------Ò

		HashMap<String, String[]> select = new HashMap<>();
		select.put("allowClear", new String[]{"true", "false"});
		select.put("autoClearSearchValue", new String[]{"true", "false"});
		select.put("autoFocus", new String[]{"true", "false"});
		select.put("defaultActiveFirstOption", new String[]{"true", "false"});
		select.put("defaultValue", new String[]{});
		select.put("disabled", new String[]{"true", "false"});
		select.put("dropdownClassName", new String[]{});
		select.put("dropdownMatchSelectWidth", new String[]{"true", "false"});
		select.put("dropdownRender", new String[]{});
		select.put("dropdownStyle", new String[]{});
		select.put("filterOption", new String[]{});
		select.put("firstActiveValue", new String[]{});
		select.put("getPopupContainer", new String[]{});
		select.put("labelInValue", new String[]{"true", "false"});
		select.put("maxTagCount", new String[]{});
		select.put("maxTagPlaceholder", new String[]{});
		select.put("maxTagTextLength", new String[]{});
		select.put("mode", new String[]{"default", "multiple", "tags", "combobox"});
		select.put("notFoundContent", new String[]{});
		select.put("optionFilterProp", new String[]{});
		select.put("optionLabelProp", new String[]{});
		select.put("placeholder", new String[]{});
		select.put("showSearch", new String[]{"true", "false"});
		select.put("showArrow", new String[]{"true", "false"});
		select.put("size", new String[]{"large", "small", "default"});
		select.put("suffixIcon", new String[]{});
		select.put("removeIcon", new String[]{});
		select.put("clearIcon", new String[]{});
		select.put("menuItemSelectedIcon", new String[]{});
		select.put("tokenSeparators", new String[]{});
		select.put("value", new String[]{});
		select.put("options", new String[]{});
		select.put("defaultOpen", new String[]{"true", "false"});
		select.put("open", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-pagination", select);


		HashMap<String, String[]> selectOption = new HashMap<>();
		selectOption.put("disabled", new String[]{"true", "false"});
		selectOption.put("key", new String[]{});
		selectOption.put("title", new String[]{});
		selectOption.put("value", new String[]{});
		selectOption.put("class", new String[]{});
		TAG_CONSTANT.put("a-select-option", selectOption);

		// -------------------------------------------------------------------

		HashMap<String, String[]> slider = new HashMap<>();
		slider.put("autoFocus", new String[]{"true", "false"});
		slider.put("defaultValue", new String[]{});
		slider.put("disabled", new String[]{"true", "false"});
		slider.put("dots", new String[]{"true", "false"});
		slider.put("included", new String[]{"true", "false"});
		slider.put("marks", new String[]{});
		slider.put("max", new String[]{});
		slider.put("min", new String[]{});
		slider.put("range", new String[]{"true", "false"});
		slider.put("step", new String[]{});
		slider.put("tipFormatter", new String[]{});
		slider.put("value", new String[]{});
		slider.put("vertical", new String[]{"true", "false"});
		slider.put("tooltipVisible", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-slider", slider);

		// -------------------------------------------------------------------

		HashMap<String, String[]> Aswitch = new HashMap<>();
		Aswitch.put("autoFocus", new String[]{"true", "false"});
		Aswitch.put("checked", new String[]{"true", "false"});
		Aswitch.put("checkedChildren", new String[]{});
		Aswitch.put("defaultChecked", new String[]{"true", "false"});
		Aswitch.put("disabled", new String[]{"true", "false"});
		Aswitch.put("loading", new String[]{"true", "false"});
		Aswitch.put("size", new String[]{});
		Aswitch.put("unCheckedChildren", new String[]{});
		TAG_CONSTANT.put("a-switch", Aswitch);

		// -------------------------------------------------------------------

		HashMap<String, String[]> timePicker = new HashMap<>();
		timePicker.put("addon", new String[]{});
		timePicker.put("allowClear", new String[]{"true", "false"});
		timePicker.put("autoFocus", new String[]{"true", "false"});
		timePicker.put("clearText", new String[]{});
		timePicker.put("defaultOpenValue", new String[]{});
		timePicker.put("defaultValue", new String[]{});
		timePicker.put("disabled", new String[]{"true", "false"});
		timePicker.put("disabledHours", new String[]{});
		timePicker.put("disabledMinutes", new String[]{});
		timePicker.put("disabledSeconds", new String[]{});
		timePicker.put("format", new String[]{});
		timePicker.put("getPopupContainer", new String[]{});
		timePicker.put("hideDisabledOptions", new String[]{"true", "false"});
		timePicker.put("hourStep", new String[]{});
		timePicker.put("inputReadOnly", new String[]{"true", "false"});
		timePicker.put("minuteStep", new String[]{});
		timePicker.put("open", new String[]{"true", "false"});
		timePicker.put("placeholder", new String[]{});
		timePicker.put("popupClassName", new String[]{});
		timePicker.put("popupStyle", new String[]{});
		timePicker.put("secondStep", new String[]{});
		timePicker.put("suffixIcon", new String[]{});
		timePicker.put("use12Hours", new String[]{"true", "false"});
		timePicker.put("value", new String[]{});
		TAG_CONSTANT.put("a-time-pick", timePicker);

		// -------------------------------------------------------------------

		HashMap<String, String[]> transfer = new HashMap<>();
		transfer.put("dataSource", new String[]{});
		transfer.put("disabled", new String[]{"true", "false"});
		transfer.put("filterOption", new String[]{});
		transfer.put("footer", new String[]{});
		transfer.put("lazy", new String[]{});
		transfer.put("listStyle", new String[]{});
		transfer.put("locale", new String[]{});
		transfer.put("operations", new String[]{});
		transfer.put("render", new String[]{});
		transfer.put("selectedKeys", new String[]{});
		transfer.put("showSearch", new String[]{"true", "false"});
		transfer.put("targetKeys", new String[]{});
		transfer.put("titles", new String[]{});
		TAG_CONSTANT.put("a-transfer", transfer);

		// -------------------------------------------------------------------


		HashMap<String, String[]> treeSelect = new HashMap<>();
		treeSelect.put("allowClear", new String[]{"true", "false"});
		treeSelect.put("defaultValue", new String[]{});
		treeSelect.put("disabled", new String[]{"true", "false"});
		treeSelect.put("dropdownClassName", new String[]{});
		treeSelect.put("dropdownMatchSelectWidth", new String[]{"true", "false"});
		treeSelect.put("dropdownStyle", new String[]{});
		treeSelect.put("filterTreeNode", new String[]{});
		treeSelect.put("getPopupContainer", new String[]{});
		treeSelect.put("labelInValue", new String[]{"true", "false"});
		treeSelect.put("loadData", new String[]{});
		treeSelect.put("maxTagCount", new String[]{});
		treeSelect.put("maxTagPlaceholder", new String[]{});
		treeSelect.put("multiple", new String[]{"true", "false"});
		treeSelect.put("placeholder", new String[]{});
		treeSelect.put("searchPlaceholder", new String[]{});
		treeSelect.put("searchValue", new String[]{});
		treeSelect.put("treeIcon", new String[]{"true", "false"});
		treeSelect.put("showCheckedStrategy", new String[]{});
		treeSelect.put("showSearch", new String[]{"true", "false"});
		treeSelect.put("size", new String[]{"default", "large", "small"});
		treeSelect.put("suffixIcon", new String[]{});
		treeSelect.put("treeCheckable", new String[]{"true", "false"});
		treeSelect.put("treeCheckStrictly", new String[]{"true", "false"});
		treeSelect.put("treeData", new String[]{});
		treeSelect.put("treeDataSimpleMode", new String[]{});
		treeSelect.put("treeDefaultExpandAll", new String[]{"true", "false"});
		treeSelect.put("treeDefaultExpandedKeys", new String[]{});
		treeSelect.put("treeExpandedKeys", new String[]{});
		treeSelect.put("treeNodeFilterProp", new String[]{});
		treeSelect.put("treeNodeLabelProp", new String[]{});
		treeSelect.put("value", new String[]{});
		TAG_CONSTANT.put("a-tree-select", treeSelect);


		HashMap<String, String[]> treeSelectNode = new HashMap<>();
		treeSelectNode.put("selectable", new String[]{"true", "false"});
		treeSelectNode.put("disableCheckbox", new String[]{"true", "false"});
		treeSelectNode.put("disabled", new String[]{"true", "false"});
		treeSelectNode.put("isLeaf", new String[]{"true", "false"});
		treeSelectNode.put("key", new String[]{});
		treeSelectNode.put("title", new String[]{});
		treeSelectNode.put("value", new String[]{});
		treeSelectNode.put("scopedSlots", new String[]{});
		TAG_CONSTANT.put("a-tree-select-node", treeSelectNode);

		// -------------------------------------------------------------------
		HashMap<String, String[]> upload = new HashMap<>();
		upload.put("accept", new String[]{});
		upload.put("action", new String[]{});
		upload.put("method", new String[]{});
		upload.put("beforeUpload", new String[]{});
		upload.put("customRequest", new String[]{});
		upload.put("data", new String[]{});
		upload.put("defaultFileList", new String[]{});
		upload.put("fileList", new String[]{});
		upload.put("headers", new String[]{});
		upload.put("listType", new String[]{});
		upload.put("name", new String[]{});
		upload.put("previewFile", new String[]{});
		upload.put("showUploadList", new String[]{});
		upload.put("remove", new String[]{});
		upload.put("transformFile", new String[]{});
		upload.put("directory", new String[]{"true", "false"});
		upload.put("disabled", new String[]{"true", "false"});
		upload.put("multiple", new String[]{"true", "false"});
		upload.put("supportServerRender", new String[]{"true", "false"});
		upload.put("withCredentials", new String[]{"true", "false"});
		upload.put("openFileDialogOnClick", new String[]{"true", "false"});
		TAG_CONSTANT.put("a-upload", upload);

		// -------------------------------------------------------------------
		// -------------------------------------------------------------------

	}
}
