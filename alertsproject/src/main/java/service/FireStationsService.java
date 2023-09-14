package service;

import java.util.List;

import model.Firestations;
import model.specific.FireMedicalRecord;
import model.specific.FirestationsZone;
import model.specific.InfoByStation;

public interface FireStationsService {

    FirestationsZone getFirestationZone(int firestationNumber);

    List<String> getPhoneAlertFromFirestations(int firestation);

    List<Integer> getStationByAddress(String address);

    FireMedicalRecord getPersonInfosByAddressIfFire(String address);

    List<InfoByStation> getPersonInfoByStationsList(List<Integer> stations);

    Firestations saveFirestation(Firestations model);

    boolean deleteFirestation(Firestations model);
}