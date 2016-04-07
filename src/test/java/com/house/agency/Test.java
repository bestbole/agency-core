package com.house.agency;

import com.myself.common.utils.UIDGeneratorUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(UIDGeneratorUtil.getUID());
		}
		/*5bdc50153ef6bbe1f8000
		dd3812153ef6bbe1f7fff
		8c436b153ef6bbe1f7ffe
		9e5c73153ef6bbe1f7ffd
		c791b9153ef6bbe1f7ffc
		3020ad153ef6bbe1f7ffb
		b15692153ef6bbe1f7ffa
		aa9f99153ef6bbe1f7ff9
		d42d08153ef6bbe1f7ff8
		d86fd3153ef6bbe1f7ff7*/
	}

}
