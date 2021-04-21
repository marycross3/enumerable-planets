package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

   private String displayName;
   private int yearLong;

    Planets(String displayName, int yearLong) {
        this.displayName = displayName;
        this.yearLong = yearLong;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getYearLong() {
        return yearLong;
    }
}
