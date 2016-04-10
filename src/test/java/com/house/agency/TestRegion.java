package com.house.agency;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.agency.dao.IRegionDao;
import com.house.agency.entity.Region;

public class TestRegion extends BaseJunitTest {

	private String cityId = "53f67e153e44203258000";

	private String[] datas = { "5bdc50153ef6bbe1f7a-福田-FT", "dd3812153ef6bbe1f7b-南山-NS", "8c436b153ef6bbe1f7c-罗湖-LH",
			"9e5c73153ef6bbe1f7d-宝安-BA", "c791b9153ef6bbe1f7e-盐田-YT", "3020ad153ef6bbe1f7f-坪山新区-PSXQ",
			"b15692153ef6bbe1f7g-光明新区-GMXQ", "aa9f99153ef6bbe1f7h-大鹏新区-DPXQ", "d42d08153ef6bbe1f7i-龙华新区-LHXQ" };

	private String[] towns = { "5bdc50153ef6bbe1f6a-皇岗-HG", "dd3812153ef6bbe1f6b-景田-JT", "8c436b153ef6bbe1f6c-梅林-ML",
			"9e5c73153ef6bbe1f6d-华强-HQ", "c791b9153ef6bbe1f6e-香蜜湖-XMH" };

	@Autowired
	private IRegionDao regionDao;

	@Test
	public void testSaveRegionCity() {
		Region param = new Region();
		param.setId(Data.cityId + "001");
		param.setStatus("1");
		param.setCreateTime(new Date());
		param.setName("深圳");
		param.setCode("SZ");
		param.setLevel("2");
		param.setSeq(1);
		regionDao.save(param);

	}

	@Test
	public void testGetRegionCity() {
		Region data = regionDao.getDataById("a1cd57153fb08a44b7001");
		System.out.println("name=" + data.getName());
	}

	@Test
	public void testSaveRegionDistricts() {
		for (int i = 0; i < Data.districts.length; i++) {
			String[] data = Data.districts[i].split("-");
			Region param = new Region();
			param.setId(Data.districtId + Data.getNum(i + 1));
			param.setParentId(Data.cityId + "001");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("3");
			param.setSeq((i + 1));
			regionDao.save(param);
		}

	}

	@Test
	public void testSaveRegionTowns_FT() {
		for (int i = 0; i < Data.towns_FT.length; i++) {
			String[] data = Data.towns_FT[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(i + 1));
			param.setParentId(Data.districtId + "001");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_NS() {
		for (int i = 0; i < Data.towns_NS.length; i++) {
			String[] data = Data.towns_NS[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(i + 1 + Data.towns_FT.length));
			param.setParentId(Data.districtId + "002");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_LH() {
		for (int i = 0; i < Data.towns_LH.length; i++) {
			String[] data = Data.towns_LH[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(i + 1 + Data.towns_FT.length + Data.towns_NS.length));
			param.setParentId(Data.districtId + "003");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_BA() {
		for (int i = 0; i < Data.towns_BA.length; i++) {
			String[] data = Data.towns_BA[i].split("-");

			Region param = new Region();
			param.setId(Data.townId
					+ Data.getNum(i + 1 + Data.towns_FT.length + Data.towns_NS.length + Data.towns_LH.length));
			param.setParentId(Data.districtId + "004");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_YT() {
		for (int i = 0; i < Data.towns_YT.length; i++) {
			String[] data = Data.towns_YT[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(
					i + 1 + Data.towns_FT.length + Data.towns_NS.length + Data.towns_LH.length + Data.towns_BA.length));
			param.setParentId(Data.districtId + "005");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_PSXQ() {
		for (int i = 0; i < Data.towns_PSXQ.length; i++) {
			String[] data = Data.towns_PSXQ[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(i + 1 + Data.towns_FT.length + Data.towns_NS.length
					+ Data.towns_LH.length + Data.towns_BA.length + Data.towns_YT.length));
			param.setParentId(Data.districtId + "006");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_GMXQ() {
		for (int i = 0; i < Data.towns_GMXQ.length; i++) {
			String[] data = Data.towns_GMXQ[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(i + 1 + Data.towns_FT.length + Data.towns_NS.length
					+ Data.towns_LH.length + Data.towns_BA.length + Data.towns_YT.length + Data.towns_PSXQ.length));
			param.setParentId(Data.districtId + "007");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_DPXQ() {
		for (int i = 0; i < Data.towns_DPXQ.length; i++) {
			String[] data = Data.towns_DPXQ[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(
					i + 1 + Data.towns_FT.length + Data.towns_NS.length + Data.towns_LH.length + Data.towns_BA.length
							+ Data.towns_YT.length + Data.towns_PSXQ.length + Data.towns_GMXQ.length));
			param.setParentId(Data.districtId + "008");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}

	@Test
	public void testSaveRegionTowns_LHXQ() {
		for (int i = 0; i < Data.towns_LHXQ.length; i++) {
			String[] data = Data.towns_LHXQ[i].split("-");

			Region param = new Region();
			param.setId(Data.townId + Data.getNum(i + 1 + Data.towns_FT.length + Data.towns_NS.length
					+ Data.towns_LH.length + Data.towns_BA.length + Data.towns_YT.length + Data.towns_PSXQ.length
					+ Data.towns_GMXQ.length + Data.towns_DPXQ.length));
			param.setParentId(Data.districtId + "009");
			param.setStatus("1");
			param.setCreateTime(new Date());
			param.setName(data[0]);
			param.setCode(data[1]);
			param.setLevel("4");
			param.setSeq((i + 1));
			regionDao.save(param);
		}
	}
}
