package com.cdk8s.plugin.xml;

import com.cdk8s.plugin.xml.components.GeneralTagConstant;
import com.cdk8s.plugin.xml.components.LayoutTagConstant;

import java.util.HashMap;


public class AntDesignVueTagConstant {
	public static HashMap<String, HashMap<String, String[]>> TAG_CONSTANT = new HashMap<>();

	static {
		TAG_CONSTANT.putAll(GeneralTagConstant.TAG_CONSTANT);
		TAG_CONSTANT.putAll(LayoutTagConstant.TAG_CONSTANT);
	}
}
