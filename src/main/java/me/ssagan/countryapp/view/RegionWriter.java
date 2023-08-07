package me.ssagan.countryapp.view;

import me.ssagan.countryapp.model.entity.Region;

import java.util.Collection;

public class RegionWriter {
    private static RegionWriter instance;

    private RegionWriter(){
    }

    public static RegionWriter getInstance(){
        if (instance == null) {
            instance = new RegionWriter();
        }
        return instance;
    }

    public void display(String caption, Collection<Region> regions) {
        System.out.println(caption);
        for (Region region : regions) {
            System.out.println(region);
        }
    }
}
