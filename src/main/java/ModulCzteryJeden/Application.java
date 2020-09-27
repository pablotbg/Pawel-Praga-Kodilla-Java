package ModulCzteryJeden;

import java.util.*;
import java.lang.*;
import java.io.*;

class Kodilla {

    public static void main (String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        int i = 0;
        for (String value : companies) {
            if (i < companies.size()-1) {
                System.out.print(value + ",");
            } else {
                System.out.print(value);
            }
            i++;
        };
    }
}
