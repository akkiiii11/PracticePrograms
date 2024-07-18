package com.patientcaresystem;

import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public Doctor getDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        return null;
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}

