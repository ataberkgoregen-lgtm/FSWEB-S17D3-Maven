package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Koala {
    private int id;
    private String name;
    private Double sleepHour;  // LocalTime değil, Double
    private Double weight;
    private String gender;     // Gender enum değil, String
}
