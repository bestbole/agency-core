package com.house.agency;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.house.agency.dao.IRegionDao;
import com.house.agency.entity.Region;
import com.house.agency.param.RegionQueryParam;

public class TestRegion extends BaseJunitTest {

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

	@Test
	public void testGetRegion() {
		// c875c815452e887867ffb da03e615452e887867ffa
		int index = 0;
		Map<String, List<Region>> regions = new LinkedHashMap<String, List<Region>>();
		getRegionById("da03e615452e887867ffa", regions, index);
		for (Map.Entry<String, List<Region>> entry : regions.entrySet()) {
			String key = entry.getKey();
			System.out.println("key=" + key);
			List<Region> values = entry.getValue();
			for (Region region : values) {
				System.out.println("name=" + region.getName());
			}
		}
	}

	private Region getRegionById(String id, Map<String, List<Region>> map, int index) {
		Region region = regionDao.getDataById(id);
		if (StringUtils.isEmpty(region.getParentId())) {
			return region;
		} else {
			String key = region.getLevel() + "_" + region.getId() + "_" + region.getParentId() + "_" + region.getName()
					+ "_" + region.getCode() + "_" + region.getSeq();
			
			List<Region> regions = null;
			if (index != 0) {
				RegionQueryParam param = new RegionQueryParam();
				param.setParentId(region.getParentId());
				regions = regionDao.list(param);
			} else {
				regions = new ArrayList<Region>();
			}
			map.put(key, regions);
		}
		index += 1;
		return getRegionById(region.getParentId(), map, index);
	}
}
