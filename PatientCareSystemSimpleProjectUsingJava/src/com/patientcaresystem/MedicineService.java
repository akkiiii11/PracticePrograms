package com.patientcaresystem;

import java.util.ArrayList;
import java.util.List;

public class MedicineService {
    private List<Medicine> medicines = new ArrayList<>();

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
        System.out.println("Medicine added successfully.");
    }

    public Medicine getMedicineByName(String name) {
        for (Medicine medicine : medicines) {
            if (medicine.getName().equalsIgnoreCase(name)) {
                return medicine;
            }
        }
        return null;
    }

    public List<Medicine> getAllMedicines() {
        return medicines;
    }
}

