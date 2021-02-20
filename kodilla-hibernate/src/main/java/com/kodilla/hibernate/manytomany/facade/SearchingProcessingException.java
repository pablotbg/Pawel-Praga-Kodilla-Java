package com.kodilla.hibernate.manytomany.facade;

public class SearchingProcessingException extends Exception {

    public static String ERR_NOT_COMPANY = "Company does not exist";
    public static String ERR_NOT_EMPLOYEE = "Employee not employed";

    public SearchingProcessingException(String message) {
        super(message);
    }
}
