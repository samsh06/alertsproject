package service;

import java.util.List;

import model.MedicalRecords;
import model.Person;

public interface MedicalRecordsService {

    List<String> getMedicationsFromPerson(Person person);

    List<String> getAllergiesFromPerson(Person person);

    boolean deleteMedicalRecords(MedicalRecords model);

    MedicalRecords updateMedicalRecords(MedicalRecords model);

    MedicalRecords saveMedicalRecords(MedicalRecords model);
}