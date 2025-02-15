package controller;

import model.ListPeople;
import view.PeopleView;

public class PeopleController {
    private ListPeople model;
    private PeopleView view;

    public PeopleController(ListPeople model, PeopleView view){
        this.model = model;
        this.view = view;
    }

    public ListPeople getModel(){
        return model;
    }

    public void setModel(ListPeople model){
        this.model = model;
    }

    public PeopleView getView(){
        return view;
    }

    public void setView(PeopleView view){
        this.view = view;
    }

}
