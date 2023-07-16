package me.ssagan.countryapp.view;

import me.ssagan.countryapp.model.entity.Region;

import java.util.Collection;

public class RegionWriter {
    public void display(Collection<Region> regions) {
        for (Region region : regions
        ) {
            System.out.println(region.toString());
        }
    }

}
