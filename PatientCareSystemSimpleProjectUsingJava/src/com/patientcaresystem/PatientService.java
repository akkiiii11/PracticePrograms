package com.patientcaresystem;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public Patient getPatientByName(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    public List<Patient> getAllPatients() {
        return patients;
    }
}
