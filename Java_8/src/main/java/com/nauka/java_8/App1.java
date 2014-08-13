package com.nauka.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Grzegorz
 */
public class App1 {
    
    private static Employee[] sampleEmployees = {
        new Employee("Grzegorz", "Maciałek", 5000),
        new Employee("Przemysław", "Maciałek", 5000),
        new Employee("Izabela", "Maciałek", 2000),
        new Employee("Anna", "Maciałek", 3000),
        new Employee("Filip", "Maciałek", 1000)
    };
    
    private static List<Employee> getSampleEmployees() {
        return Arrays.asList(sampleEmployees);
    }
    
    public static <T> T firstMatch(List<T> candidates, 
                                   Predicate<T> matchFunction) {
        for(T possibleMatch : candidates) {
            if(matchFunction.test(possibleMatch)) {
                return possibleMatch;
            }
        }
        return null;
    }

    public static <T> List<T> allMatches(List<T> candidates, 
                                         Predicate<T> matchFunction) {
        List<T> matches = new ArrayList<>();
        for(T possibleMatch : candidates) {
            if(matchFunction.test(possibleMatch)) {
                matches.add(possibleMatch);
            }
        }
        return matches;
    }
    
    public static void main(String[] args) {
    
        List<Employee> employees = getSampleEmployees();
        firstMatch(employees, e -> e.getImie().equals("Iza"));
        
        System.out.println("Pierwszy:");
        System.out.println(firstMatch(employees, e -> e.getWyplata().equals(5000)));
        
        System.out.println("Wszyscy:");
        System.out.println(allMatches(employees, e -> e.getWyplata().equals(5000)));
        
        
    }
}
