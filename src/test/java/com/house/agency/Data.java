package com.house.agency;

public class Data {

	/*
	 * a1cd57153fb08a44b7fff 012ddd153fb08a44b7ffe 2b958e153fb08a44b7ffd
	 * b44e46153fb08a44b7ffc 04e3b2153fb08a44b7ffb 5f550a153fb08a44b7ffa
	 * 6b2d4a153fb08a44b7ff9 91993f153fb08a44b7ff8 4af82c153fb08a44b7ff7
	 */
	public static String cityId = "a1cd57153fb08a44b7";
	public static String districtId = "012ddd153fb08a44b7";
	public static String townId = "2b958e153fb08a44b7";
	public static String buildingId = "b44e46153fb08a44b7";
	public static String buildingImageId = "04e3b2153fb08a44b7";
	public static String buildingUnitId = "5f550a153fb08a44b7";
	public static String houseId = "6b2d4a153fb08a44b7";
	public static String tradeId = "91993f153fb08a44b7";
	public static String userId = "1870dc153c592f7578";
	public static String houseImageId = "4af82c153fb08a44b7";

	public static String[] districts = { "福田-FT", "南山-NS", "罗湖-LH", "宝安-BA", "盐田-YT", "坪山新区-PSXQ", "光明新区-GMXQ",
			"大鹏新区-DPXQ", "龙华新区-LHXQ" };

	public static String[] towns_FT = { "皇岗-HG", "景田-JT", "梅林-ML", "上步-SB", "新洲-XZ", "华强-HQ", "石厦-SX", "香蜜湖-XMH",
			"上下沙-SXS", "竹子林-ZZL", "保税区-BSQ", "车公庙-CGM" };
	
	public static String[] towns_NS = { "前海-QH", "蛇口-SK", "南头-NT"};
	
	public static String[] towns_LH = { "布心-BX", "莲塘-LT", "黄贝岭-HBL"};
	
	public static String[] towns_BA = { "西乡-XX", "新安-XA", "福永-FY"};
	
	public static String[] towns_YT = { "沙头角-XTJ", "盐田港-YTG", "梅沙-MX"};
	
	public static String[] towns_PSXQ = { "坪山-PS", "坑梓-KX"};
	
	public static String[] towns_GMXQ = { "公明-GM", "光明-GM"};
	
	public static String[] towns_DPXQ = { "大鹏-DP", "南澳-NA", "葵涌-KC"};
	
	public static String[] towns_LHXQ = { "龙华-LH", "大浪-DL", "民治-MZ"};

	public static String[] buildings_FT = { "皇庭世纪-2011-福田滨河大道与益田路交汇处-building/FreOSWmiGjCOyPbwZb950UrTJtH7.jpg-1",
			"江南名苑-2001-福田福强路2143号-building/dcq2_jg9HbEuTUN9sVHEIov88R8.jpg-1",
			"水畔紫云阁-1999-福田滨河路以南（皇岗口岸以东）-building/FpW5nXd5jnIpe_T0EWmceMlfycdY.jpg-2",
			"晨晖家园-2000-皇岗公园一街-building/FgO_aADUXGU5AoUcNacpVzgYy_xw.jpg-1",
			"高发城驰苑-2003-福田区福民路与益田路交汇处东南-building/FhgoN9GAAbqYCwr1qppo7sUd1UXx.jpg-3",
			"银庄大厦-2005-福田区金田南路1013号-building/Ftta10E5Y5j7Vel48VThD6JQT3U9.jpg-4",
			"皇岗花园-2010-福田福田南彩田南路-building/Fvx1S6tUIbana5ZJO6ltCUD5FJG0.jpg-0",
			"皇御苑三期-1998-福田福田南路7号-building/FtsedJmt0GVzzf_WuwzPAcqqVsJa.jpg-4",
			"皇庭彩园-2006-福田金田路与福民路的交汇处-building/KSeAru7h6IAPAt71vnG530uClqQ.jpg-0",
			"骏皇名居-2004-福田丹桂路与金桂路交汇处-building/FkQuAg9hWsFCC6LXhqKeY2khLkIW.jpg-1" };
	
	public static String[] trade_FT = {"来座山 实用的户型 南北通透 业主低于市场价15万急卖",
			"慢城 大四房 楼王位置 三面采光 业主急卖 还是看山景的",
			"大赠送 拥有自己的装修风格 还是看山景的",
			"南北通透 全新装修 还是看山景的",
			"来座山 全新毛坯 大增送123送60平 实用",
			"城铁沿线91平570万元业主急售!",
			"友邻公寓性价比高,总价,诚意出售!",
			"一手业主享受高端高尔夫美景你值得拥有",
			"名匠设计,豪华装修,满五,业主诚心出售",
			"美荔园3室640万元地地道道好房!"};
	
	public static String[] image_FT = {
			"house/FgVS04PCNWRykjeQKltH1v1ZcNXh.jpg-卧室",
			"house/FoDwtQIoUvug8VxWKIZTTlSs8Vss.jpg-客厅",
			"house/Fv1LUQS378hkbrNFREpj67OnZTT3.jpg-厨房",
			"house/FvALB_y0gkhwLyYcGgEl0PHPEpBn.jpg-阳台" };

	public static String getNum(int i) {
		String s = "";
		if (i < 10) {
			s = "00" + i;
		} else if (i >= 10 && i < 100) {
			s = "0" + i;
		} else {
			s += i;
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(getNum(0));
	}
}
