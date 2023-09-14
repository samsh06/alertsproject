package repository;

import java.util.List;

import model.Firestations;
import model.MedicalRecords;
import model.Person;

public interface DataFileAccess {
    int getNbStationByAddressFromPerson(Person person);

    int getAgeFromPerson(Person person);

    List<Person> getPersonsByFirestationNumber(int firestationNumber);

    List<Person> getPersonsByAddress(String address);

    int getAgeFromBirthdate(String birthdate);

    List<Firestations> getFirestations();

    List<Person> getPersons();

    List<MedicalRecords> getMedicalrecords();

    Person savePerson(Person model);

    Person updatePerson(Person model);

    boolean deletePerson(Person model);

    MedicalRecords saveMedicalRecords(MedicalRecords model);

    MedicalRecords updateMedicalRecords(MedicalRecords model);

    boolean deleteMedicalRecords(MedicalRecords model);

    Firestations saveFirestation(Firestations model);

    boolean deleteFirestation(Firestations model);
}