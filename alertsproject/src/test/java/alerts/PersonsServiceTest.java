package alerts;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import data.CommonTestData;
import data.PersonTestData;
import model.DataFile;
import model.specific.ChildAlert;
import model.specific.FullInfoPerson;
import repository.DataFileAccess;
import repository.impl.DataFileAccessImpl;
import service.PersonsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class PersonsServiceTest {

    @Autowired
    private PersonsService personsService;

    @Autowired
    DataFileAccess dataFileAccess;

    private ChildAlert childAlertTest = PersonTestData.getChildAlertTest();

    private List<FullInfoPerson> fullInfoPersonByNameList = PersonTestData.getFullInfoPersonByNameList();

    private List<String> emailsFromCityList = PersonTestData.getEmailsFromCityList();

    @Before
    public void setup() {
        DataFile dataFileTest = new DataFile(CommonTestData.getPersonList(), CommonTestData.getFirestationsList(), CommonTestData.getMedicalRecordsList());
        ((DataFileAccessImpl) dataFileAccess).setDataFile(dataFileTest);
    }

    @Test
    public void getChildAlertFromAddressTest() {
        Assertions.assertThat(personsService.getChildAlertFromAddress("1509 Culver St")).isEqualTo(childAlertTest);
    }

    @Test
    public void getFullInfoByNameTest() {
        Assertions.assertThat(personsService.getFullInfoByName(null, "Boyd")).isEqualTo(fullInfoPersonByNameList);
    }

    @Test
    public void getEmailsFromCityTest() {
        Assertions.assertThat(personsService.getEmailsFromCity("Culver")).isEqualTo(emailsFromCityList);
    }

    @Test
    public void savePersonTest() {
        Assertions.assertThat(personsService.savePerson(CommonTestData.getPersonToAddTest())).isEqualTo(CommonTestData.getPersonToAddTest());
    }

    @Test
    public void updatePersonTest() {
        Assertions.assertThat(personsService.updatePerson(CommonTestData.getPersonToUpdateTest())).isEqualTo(CommonTestData.getPersonToUpdateTest());
    }

    @Test
    public void deletePersonTest() {
        Assertions.assertThat(personsService.deletePerson(CommonTestData.getPersonToDeleteTest())).isEqualTo(true);
    }
}