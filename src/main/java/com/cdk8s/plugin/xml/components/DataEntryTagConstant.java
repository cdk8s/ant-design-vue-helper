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

		// -------------------------------------------------------------------

	}
}
