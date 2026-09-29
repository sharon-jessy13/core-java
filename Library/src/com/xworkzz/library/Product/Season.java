package com.xworkzz.library.Product;

public class Season {

    public int seasonId;
    public String seasonName;
    public String climate;
    public double averageTemperature;
    public String months;

    @Override
    public boolean equals(Object obj) {

        Season season = (Season) obj;

        if (this.seasonId == season.seasonId
                && this.seasonName.equals(season.seasonName)
                && this.climate.equals(season.climate)
                && this.averageTemperature == season.averageTemperature
                && this.months.equals(season.months)) {

            return true;
        }

        return false;
    }
}
