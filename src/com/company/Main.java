package com.company;

public class Main {



    public static void main(String[] args) {
        Band myBand1;
        myBand1 = new Band();
        myBand1.bandName = "bandos";
        myBand1.yearFormed = 1973;
        myBand1.active = true;
        myBand1.albums = 13;
        myBand1.members = 6;
        myBand1.style = "metal";
        myBand1.country = "Hondurus";

        Phone mePhone;
        mePhone = new Phone();
        mePhone.phoneName = "iPhone";
        mePhone.phoneBrand = "Apple";
        mePhone.isSmart = true;
        mePhone.phoneCost$ = 500;
        mePhone.phoneWeightOz = 10;

        City newCity;
        newCity = new City();
        newCity.cityName = "Nashville";
        newCity.mayor = "Garth";
        newCity.population = 800000;
        newCity.mayorSalary = 1000000;
        newCity.canAffordSalary = true;

        Team myTeam;
        myTeam = new Team();
        myTeam.teamName = "Reds";
        myTeam.teamCity = "Cincinnati";
        myTeam.lastYearAllStars = 2;
        myTeam.lastYearWins = 64;
        myTeam.lastYearPlayoffs = false;

        Animal myAnimal;
        myAnimal = new Animal();
        myAnimal.animalName = "rattlesnake";
        myAnimal.animalLimbs = 0;
        myAnimal.animalRegion = "North America";
        myAnimal.animalAsPet = false;
        myAnimal.animalKingdom = "Reptilia";
        myAnimal.eatMeat = true;
        myAnimal.landAnimal = true;


    }




}
