package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception {

    public static String COMPANY_NOT_FOUND = "Company is not found";
    public static String EMPLOYEE_NOT_FOUND = "Employee is not found";

    public SearchingException(String message) {
        super(message);
    }
}
