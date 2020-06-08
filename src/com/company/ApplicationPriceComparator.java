package com.company;

import com.company.devices.Application;

import java.util.Comparator;

public class ApplicationPriceComparator implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        return Double.compare(o1.priceApplication, o2.priceApplication);
    }
}
