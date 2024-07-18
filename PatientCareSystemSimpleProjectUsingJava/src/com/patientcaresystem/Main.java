package com.patientcaresystem;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static PatientService patientService = new PatientService();
    private static DoctorService doctorService = new DoctorService();
    private static MedicineService medicineService = new MedicineService();
    private static AppointmentService appointmentService = new AppointmentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome Patient Care System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Medicine");
            System.out.println("4. Schedule Appointment");
            System.out.println("5. View All Patients");
            System.out.println("6. View All Doctors");
            System.out.println("7. View All Medicines");
            System.out.println("8. View All Appointments");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    addMedicine();
                    break;
                case 4:
                    scheduleAppointment();
                    break;
                case 5:
                    viewAllPatients();
                    break;
                case 6:
                    viewAllDoctors();
                    break;
                case 7:
                    viewAllMedicines();
                    break;
                case 8:
                    viewAllAppointments();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addPatient() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        Patient patient = new Patient(name, age, gender);
        patientService.addPatient(patient);
    }

    private static void addDoctor() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter specialization: ");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(name, specialization);
        doctorService.addDoctor(doctor);
    }

    private static void addMedicine() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter dosage: ");
        String dosage = scanner.nextLine();

        Medicine medicine = new Medicine(name, dosage);
        medicineService.addMedicine(medicine);
    }

    private static void scheduleAppointment() {
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        Patient patient = patientService.getPatientByName(patientName);
        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();
        Doctor doctor = doctorService.getDoctorByName(doctorName);
        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        System.out.print("Enter appointment date (yyyy-MM-DD): ");
        String dateStr = scanner.nextLine();
        LocalDate date;
        try {
            date = LocalDate.parse(dateStr);
            if (date.isBefore(LocalDate.now())) {
                System.out.println("The appointment date cannot be in the past.");
                return;
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            return;
        }

        appointmentService.addAppointment(patient, doctor, date);
    }

    private static void viewAllPatients() {
        List<Patient> patients = patientService.getAllPatients();
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    private static void viewAllDoctors() {
        List<Doctor> doctors = doctorService.getAllDoctors();
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

    private static void viewAllMedicines() {
        List<Medicine> medicines = medicineService.getAllMedicines();
        if (medicines.isEmpty()) {
            System.out.println("No medicines found.");
        } else {
            for (Medicine medicine : medicines) {
                System.out.println(medicine);
            }
        }
    }

    private static void viewAllAppointments() {
        List<Appointment> appointments = appointmentService.getAllAppointments();
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }
}

