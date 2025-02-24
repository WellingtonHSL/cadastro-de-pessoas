package controller;

import model.ListPeople;
import model.People;
import view.PeopleView;

import java.util.Scanner;

public class PeopleController {
    private ListPeople model;
    private PeopleView view;
    private Scanner scanner;

    public PeopleController(){
        this.model = new ListPeople();
        this.view = new PeopleView();
        this.scanner = new Scanner(System.in);
    }

    public void options() {
        int option;
        do {
            view.menu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    searchPeopleByName();
                    break;
                case 2:
                    addNewPeople();
                    break;
                case 3:
                    listAllPeople();
                    break;
                case 0:
                    view.printMessage("Saindo...");
                    break;
                default:
                    view.printMessage("Opção inválida! Tente novamente.");
            }
        } while (option != 0);
    }

    private void searchPeopleByName() {
        System.out.print("Digite o nome a ser pesquisado: ");
        String name = scanner.nextLine();
        People person = model.getPeopleByName(name);

        if (person != null) {
            view.printPeopleDetails(person);
        } else {
            view.printMessage("Nenhum registro encontrado!");
        }
    }

    private void addNewPeople() {
        People newPeople = view.peopleRegister();
        model.addPeople(newPeople);
        view.printMessage("Pessoa cadastrada com sucesso!");
    }

    private void listAllPeople() {
        view.printAllPeople(model.getAllPeople());
    }
}