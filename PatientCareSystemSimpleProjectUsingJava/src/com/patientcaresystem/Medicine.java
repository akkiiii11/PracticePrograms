package com.patientcaresystem;

public class Medicine {
    private String name;
    private String dosage;

    public Medicine(String name, String dosage) {
        this.name = name;
        this.dosage = dosage;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    @Override
    public String toString() {
        return "Medicine{name='" + name + "', dosage='" + dosage + "'}";
    }
}
