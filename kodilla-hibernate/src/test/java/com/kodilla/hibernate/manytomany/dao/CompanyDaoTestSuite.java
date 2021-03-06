package com.kodilla.hibernate.manytomany.dao;

/*
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

    @Autowired
    private EmployeeDao employeeDao;

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
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

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
    void testNamedQueries() {
        //Given
        Employee employee1 = new Employee("Artur", "Smith");
        Employee employee2 = new Employee("Anna", "Clarkson");
        Employee employee3 = new Employee("Monica", "Smith");
        Employee employee4 = new Employee("Ted", "Brian");

        Company company1 = new Company("New World Comp.");
        Company company2 = new Company("New York Times");
        Company company3 = new Company("Software Company");


        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee3);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee1);
        company3.getEmployees().add(employee4);

        employee1.getCompanies().add(company1);
        employee1.getCompanies().add(company3);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company1);
        employee4.getCompanies().add(company3);

        //When
        employeeDao.save(employee1);
        int employee1Id = employee1.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();
        employeeDao.save(employee3);
        int employee3Id = employee3.getId();
        employeeDao.save(employee4);
        int employee4Id = employee4.getId();

        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();
        companyDao.save(company3);
        int company3Id = company3.getId();

        List<Employee> lastNameEmployees = employeeDao.retrieveEmployeeLastName("Smith");
        List<Company> threeLettersOfName = companyDao.retrieveNameCompanySymbol("New");

        //Then
        assertEquals(2, lastNameEmployees.size());
        assertEquals(2, threeLettersOfName.size());

        //CleanUp
        try {
            employeeDao.deleteById(employee1Id);
            employeeDao.deleteById(employee2Id);
            employeeDao.deleteById(employee3Id);
            employeeDao.deleteById(employee4Id);
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
            companyDao.deleteById(company3Id);
        } catch (Exception e) {
            //do nothing
        }

    }
}
*/
