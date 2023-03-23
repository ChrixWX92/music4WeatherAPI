package com.techreturners.music4WeatherAPI.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Location {
    private String name;
    private String region;
    private String country;
    private String tz_id;
    private String localtime;
}
