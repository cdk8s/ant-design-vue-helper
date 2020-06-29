package com.cdk8s.plugin.xml;

import com.cdk8s.plugin.xml.components.*;

import java.util.HashMap;


public class AntDesignVueTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		TAG_CONSTANT.putAll(GeneralTagConstant.TAG_CONSTANT);
		TAG_CONSTANT.putAll(LayoutTagConstant.TAG_CONSTANT);
		TAG_CONSTANT.putAll(DataDisplayTagConstant.TAG_CONSTANT);
		TAG_CONSTANT.putAll(DataEntryTagConstant.TAG_CONSTANT);
		TAG_CONSTANT.putAll(FeedBackTagConstant.TAG_CONSTANT);
		TAG_CONSTANT.putAll(NavigationTagConstant.TAG_CONSTANT);
		TAG_CONSTANT.putAll(OtherTagConstant.TAG_CONSTANT);
	}
}
