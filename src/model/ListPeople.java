package model;

import java.util.ArrayList;

public class ListPeople {
    private ArrayList<People> list = new ArrayList<>();

    public void addPeople(People people) {
        list.add(people);
    }

    public People getPeopleByName(String name) {
        for (People people : list) {
           if(people.getName().equalsIgnoreCase(name)) {
              return people;
           }
        }
        return null;
    }

    public ArrayList<People> getAllPeople() {
        return list;
    }
}