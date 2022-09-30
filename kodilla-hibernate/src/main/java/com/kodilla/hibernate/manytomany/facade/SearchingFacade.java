package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchingFacade {
    public static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public SearchingFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<String> FindACompanyByPartOfTheName(String partName) throws SearchingException {
        LOGGER.info("Searching company with " + partName + " in name.");

        List<String> result = companyDao.findACompanyByPartOfTheName("%" + partName + "%").stream()
                .map(n -> n.getName())
                .collect(Collectors.toList());

        if (result.size() == 0) {
            LOGGER.info(SearchingException.COMPANY_NOT_FOUND);
            throw new SearchingException(SearchingException.COMPANY_NOT_FOUND);
        }
        return result;
    }


    public List<String> FindAnEmployeeByPartOfTheName(String partName) throws SearchingException {
        LOGGER.info("Searching employee with " + partName + " in name.");

        List<String> result = employeeDao.findAnEmployeeByPartOfTheName("%" + partName + "%").stream()
                .map(n -> n.getFirstname() + " " + n.getLastname())
                .collect(Collectors.toList());

        if (result.size() == 0) {
            LOGGER.info(SearchingException.EMPLOYEE_NOT_FOUND);
            throw new SearchingException(SearchingException.EMPLOYEE_NOT_FOUND);
        }
        return result;
    }

}
