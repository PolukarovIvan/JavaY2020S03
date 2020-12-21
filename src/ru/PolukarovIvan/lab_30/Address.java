package ru.PolukarovIvan.lab_30;

import java.io.Serializable;

public final class Address implements Serializable {

    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private int apartmentNumber;

    public final static Address UNKNOWN_ADDRESS = new Address();

    public Address() {}

    public Address(
            String cityName,
            int zipCode,
            String streetName,
            int buildingNumber,
            int apartmentNumber
    ) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", zipCode=" + zipCode +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}