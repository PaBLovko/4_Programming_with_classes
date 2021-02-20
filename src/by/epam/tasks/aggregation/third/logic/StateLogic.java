package by.epam.tasks.aggregation.third.logic;

import by.epam.tasks.aggregation.third.bean.Area;
import by.epam.tasks.aggregation.third.bean.Region;
import by.epam.tasks.aggregation.third.bean.State;

public class StateLogic {

	public double getStateSquare(State state){
		double square = 0;
		for (Region region : state.getRegionArrayList()){
			for (Area area : region.getAreaArrayList()) {
				square += area.getAreaSquare();
			}
		}
		return square;
	}
}
