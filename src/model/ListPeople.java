package model;

import view.PeopleView;

import java.util.ArrayList;

public class ListPeople {
    ArrayList<People> list = new ArrayList<People>();
    private PeopleView view;

    public ArrayList<People> getList() {
        return list;
    }

    public void setList(ArrayList<People> list) {
        this.list = list;
    }

    public void addPeople(People people) {
        this.list.add(people);
    }

    public People getPeopleByName(String name) {
        for (People people : list) {
           if(people.getName().equalsIgnoreCase(name)) {
              return people;
           }
        }
        return null;
    }

    public void getAllPeople() {
        if(list.isEmpty()) {
            view.noPeopleFound();
        } else {
            for (People people : list) {
                view.printPeopleDetails(people);
            }
        }
    }
}