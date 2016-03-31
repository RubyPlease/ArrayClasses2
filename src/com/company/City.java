package com.company;

/**
 * Created by RobertBarber on 3/29/16.
 *
 * a city is a place where people live
 * cities need a mayor
 * cities need a population
 * mayor has a salary
 * a city cannot afford a mayor if population is <1000
 * maximum salary of mayor is $1000000
 * minimum salary of mayor is $10000
 * mayor's salary is equal to population * 10
 * population cannot pay more than $10 per com.company.person for mayor's salary
 */
public class City {
    String cityName;
    String mayor;
    int population;
    int mayorSalary;
    boolean mayorSalaryMax;
    boolean mayorSalaryMin;
    boolean canAffordSalary;

    /* this constructor will create a city. I need to know the population */
    /* private City(int pop, int maySal){
        population = pop;
        // I am going to set the salary of the mayor equal to the population * 10 //
        mayorSalary = pop * 10;
        /* I also need to set the minimum and maximum limits on
        the salary of the mayor, at $10000 and $1000000 respectively.
        If the population is < 1000, then the mayorSalary will be $10000.
        If the population is > 100000, then the mayorSalary will be $1000000. */
        //mayorSalary = maySal;

        //I need to determine if the city has the population to afford the salary of the mayor//
        /*If the city has a population less than the minimum required
        to pay the mayor's salary, then the city is not viable */
    //}

}
