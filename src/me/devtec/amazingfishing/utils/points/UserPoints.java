package me.devtec.amazingfishing.utils.points;

import me.devtec.shared.API;

public class UserPoints implements PointsManager {

	public double get(String player) {
		return API.getUser(player).getDouble("af.points");
	}

	public void set(String player, double points) {
		API.getUser(player).set("af.points", points);
	}

	public void add(String player, double points) {
		set(player, get(player)+points);
	}

	public void remove(String player, double points) {
		set(player, get(player)-points);
	}
}
