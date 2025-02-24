package view;

import model.People;

import java.util.List;
import java.util.Scanner;

public class PeopleView {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Consultar cadastro pelo Nome.");
        System.out.println("2 - Cadastrar nova pessoa.");
        System.out.println("3 - Listar todas as pessoas Cadastradas.");
        System.out.println("0 - Sair.");
        System.out.print("Escolha uma opção: ");
    }

    public People peopleRegister(){
        System.out.println("\nDigite o seu nome");
        String name = scanner.nextLine();

        System.out.println("Digite o seu CPF");
        String CPF = scanner.nextLine();

        System.out.println("Digite o seu número de celular");
        String phoneNumber = scanner.nextLine();

        System.out.println("Digite o seu endereço:");
        String address = scanner.nextLine();

        System.out.println("Diigite o seu e-mail");
        String email = scanner.nextLine();

        return new People(name, CPF, phoneNumber, address, email);
    }
    public void printPeopleDetails(People people) {
            System.out.println("\n----- Dados Pessoais -----");
            System.out.println("Nome: " + people.getName());
            System.out.println("CPF: " + people.getCPF());
            System.out.println("Número de Telefone: " + people.getPhoneNumber());
            System.out.println("Endereço: " + people.getAddress());
            System.out.println("E-mail: " + people.getEmail());
    }

    public void printAllPeople(List<People> peopleList) {
        if(peopleList.isEmpty()) {
            System.out.println("\nNenhum registro encontrado!");
        } else {
            for (People people : peopleList) {
                printPeopleDetails(people);
            }
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}