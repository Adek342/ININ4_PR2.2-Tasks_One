package com.company.devices;

public class Application implements Comparable {
    public String nameApplication;
    public Double versionOfApplication;
    public Double priceApplication;

    public Application(String nameApplication, Double versionOfApplication, Double priceApplication)
    {
        this.nameApplication = nameApplication;
        this.versionOfApplication = versionOfApplication;
        this.priceApplication = priceApplication;
    }

    @Override
    public int compareTo(Object o) {
        return this.nameApplication.compareTo(((Application) o).nameApplication);
    }
}
