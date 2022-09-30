package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class SearchingFacadeTestSuite {

    @Autowired
    private SearchingFacade searchingFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private Long budmaxId;
    private Long coalEnergyId;

    @BeforeEach
    void addDataForTests() {
        Employee mariaKowalska = new Employee("Maria" , "Kowalska");
        Employee andrzejNowak = new Employee("Andrzej", "Nowak");

        Company budmax = new Company("Budmax");
        Company coalEnergy = new Company("Coalenergy");

        budmax.getEmployees().add(mariaKowalska);
        coalEnergy.getEmployees().add(andrzejNowak);

        mariaKowalska.getCompanies().add(budmax);
        andrzejNowak.getCompanies().add(coalEnergy);

        companyDao.save(budmax);
        budmaxId = budmax.getId();
        companyDao.save(coalEnergy);
        coalEnergyId = coalEnergy.getId();
    }

    @AfterEach
    void deleteAllTestData() {
        //CleanUp
        try {
            companyDao.deleteById(budmaxId);
            companyDao.deleteById(coalEnergyId);
            companyDao.deleteAll();
        } catch (Exception e) {

        }
    }

    @Test
    void testFindACompanyByPartOfTheName() {
            //Given
            List<String> result = new ArrayList<>();
            //When
            try {
                result = searchingFacade.FindACompanyByPartOfTheName("dma");
            } catch (SearchingException e) {
                System.out.println(e.getMessage());
            }
            //Then
            assertNotEquals(0, result.size());
    }

    @Test
    void testFindAnEmployeeByPartOfTheName() {
        //Given
        List<String> result = new ArrayList<>();
        //When
        try {
            result = searchingFacade.FindAnEmployeeByPartOfTheName("wa");
        } catch (SearchingException e) {
            System.out.println(e.getMessage());
        }
        //Then
        assertNotEquals(0, result.size());
    }
}
