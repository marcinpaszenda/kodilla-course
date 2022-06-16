package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        long softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        long dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        long greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testRetrieveEmployeeNamedQueries() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        long id = johnSmith.getId();

        //When
        List<Employee> retrieveByLastname = employeeDao.retrieveByLastname("Smith");

        //Then
        assertEquals(1, retrieveByLastname.size());

        //CleanUp
        employeeDao.deleteById(id);
    }

    @Test
    void testRetrieveCompanyByFirstThreeLettersNamedQueries() {

        //Given
        Company softwareMachine = new Company("Software Machine");
        companyDao.save(softwareMachine);
        long id = softwareMachine.getId();

        //When
        List<Company> retrieveCompanyByFirstThreeLetters = companyDao.retrieveCompanyByFirstThreeLetters("Sof");

        //Then
        assertEquals(1, retrieveCompanyByFirstThreeLetters.size());

        //CleanUp
        companyDao.deleteById(id);
    }

}
