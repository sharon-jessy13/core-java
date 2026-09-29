package com.xworkzz.library.Product;

public class Country {

    public int countryId;
    public String countryName;
    public String capital;
    public String continent;
    public long population;

    @Override
    public boolean equals(Object obj) {

        Country country = (Country) obj;

        if (this.countryId == country.countryId
                && this.countryName.equals(country.countryName)
                && this.capital.equals(country.capital)
                && this.continent.equals(country.continent)
                && this.population == country.population) {

            return true;
        }

        return false;
    }
}
