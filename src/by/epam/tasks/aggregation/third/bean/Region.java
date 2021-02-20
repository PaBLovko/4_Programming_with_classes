package by.epam.tasks.aggregation.third.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Region {

	private String regionName;
	private ArrayList<Area> areaArrayList;
	private City regionCenterCity;

	public Region(String regionName, ArrayList<Area> areaArrayList, City regionCenterCity) {
		this.regionName = regionName;
		this.areaArrayList = areaArrayList;
		this.regionCenterCity = regionCenterCity;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public ArrayList<Area> getAreaArrayList() { return areaArrayList; }

	public void setAreaArrayList(ArrayList<Area> areaArrayList) {
		this.areaArrayList = areaArrayList;
	}

	public City getRegionCenterCity() { return regionCenterCity; }

	public void setRegionCenterCity(City regionCenterCity) {
		this.regionCenterCity = regionCenterCity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionName, areaArrayList, regionCenterCity);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Region region = (Region) o;
		return Objects.equals(regionName, region.regionName) &&
				Objects.equals(areaArrayList, region.areaArrayList) &&
				Objects.equals(regionCenterCity, region.regionCenterCity);
	}

	@Override
	public String toString() {
		return "Region{" +
				"nameRegion=" + regionName +
				", areaList=" + areaArrayList +
				", regionCenterCity=" + regionCenterCity +
				'}';
	}
}
