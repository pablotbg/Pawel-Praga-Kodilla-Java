package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SearchingFacadeTestSuite {

    @Autowired
    private SearchingFacade searchingFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testFindEmployeesWhoseLastNameContainsPhrase() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        List<Employee> employeesList = searchingFacade.findEmployeesWhoseLastNameContainsPhrase("smi");

        //Then
        Assertions.assertEquals(1, employeesList.size());

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void testFindCompaniesWhoseNameContainsPhrase() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        List<Company> companiesList = searchingFacade.findCompaniesWhoseNameContainsPhrase("ma");

        //Then
        Assertions.assertEquals(3, companiesList.size());

        //CleanUp
        companyDao.deleteAll();
    }
}