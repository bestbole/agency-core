package com.house.agency;

import java.util.Map;

import com.myself.common.utils.MapUtil;
import com.myself.common.utils.UIDGeneratorUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(UIDGeneratorUtil.getUID());
		}
		/*a1cd57153fb08a44b7fff
		012ddd153fb08a44b7ffe
		2b958e153fb08a44b7ffd
		b44e46153fb08a44b7ffc
		04e3b2153fb08a44b7ffb
		5f550a153fb08a44b7ffa
		6b2d4a153fb08a44b7ff9
		91993f153fb08a44b7ff8
		4af82c153fb08a44b7ff7*/
		
		Map<String, String> map = MapUtil.getMap("1:中国,2:美国", "[,]");
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue() + "\t");
		}
	}
}
