package com.xworkzz.library.Product;

public class Road {

    public int roadId;
    public String roadName;
    public String location;
    public String roadType;
    public double length;

    @Override
    public boolean equals(Object obj) {

        Road road = (Road) obj;

        if (this.roadId == road.roadId
                && this.roadName.equals(road.roadName)
                && this.location.equals(road.location)
                && this.roadType.equals(road.roadType)
                && this.length == road.length) {

            return true;
        }

        return false;
    }
}
