package by.epam.tasks.aggregation.third.runner;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import by.epam.tasks.aggregation.third.bean.Area;
import by.epam.tasks.aggregation.third.bean.City;
import by.epam.tasks.aggregation.third.bean.Region;
import by.epam.tasks.aggregation.third.bean.State;
import by.epam.tasks.aggregation.third.logic.StateLogic;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Area> areaArrayList = new ArrayList<>();
		areaArrayList.add(new Area("Karpat",new City("Minsk"),123));
		areaArrayList.add(new Area("Karpati",new City("Gomel"),321));
		areaArrayList.add(new Area("Karpaty",new City("Grodno"),222));
		Region regionFirst = new Region("Pablovka", areaArrayList,new City("Pablo"));
		Region regionSecond = new Region("Malinovka", areaArrayList,new City("Pablo"));
		Region regionThird = new Region("Makovka", areaArrayList,new City("Pablo"));
		ArrayList<Region> regionArrayList = new ArrayList<Region>(){{
			add(regionFirst);
			add(regionSecond);
			add(regionThird);
		}};
		State state = new State("Pablovia", "Pabio", regionArrayList);
		System.out.println(state.getCapitalName());
		System.out.println(state.getRegionArrayList().size());
		System.out.println(new StateLogic().getStateSquare(state));
		for (Region region:state.getRegionArrayList()){
			System.out.println(region.getRegionCenterCity().getCityName());
		}
	}
}
