package com.patientcaresystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Patient patient, Doctor doctor, LocalDate date) {
        Appointment appointment = new Appointment(patient, doctor, date);
        appointments.add(appointment);
        System.out.println("Appointment added successfully.");
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}

