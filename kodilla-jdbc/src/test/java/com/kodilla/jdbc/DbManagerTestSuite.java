package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

//    @Test
//    void testSelectUsers() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while (rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " +
//                    rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        assertEquals(5, counter);
//    }
//
//    @Test
//    void testSelectUsersAndPosts() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = "select U.FIRSTNAME, U.LASTNAME, count(*) as NUMBER_OF_POST " +
//                "from USERS U JOIN POSTS P on U.ID = P.USER_ID group by P.USER_ID " +
//                "having count(*) >= 2;";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while (rs.next()) {
//            System.out.println(rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME") + ", " +
//                    rs.getInt("NUMBER_OF_POST"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        assertEquals(2, counter);
//    }
}