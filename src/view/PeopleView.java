package view;

import model.People;

StructuringView
import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleView {

    public static void menu() {
        System.out.println("1 Consulta de Cadastro pelo Nome");
        System.out.println("2 Cadastro Nova Pessoa");
        System.out.println("3 Imprimir Pessoas Cadastradas");
        System.out.println("4 Sair");
    }

    public static int opcao() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Digite a opcao desejada:");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                if (opcao >= 1 && opcao <= 4) {
                    return opcao;
                } else {
                    System.out.println("Opção Invalida! Por favor escolha uma opção entre 1 e 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção Invalida! Por favor escolha uma opção entre 1 e 4.");
            }
        } while (true);
    }

    public void peopleRegister(String name, String CPF, int phoneNumber, String address, String email){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        name = scanner.nextLine();

        System.out.println("Digite o seu CPF");
        CPF = scanner.nextLine();

        System.out.println("Digite o seu número de celular");
        phoneNumber = scanner.nextInt();

        System.out.println("Digite o seu endereço:");
        address = scanner.nextLine();

        System.out.println("Diigite o seu e-mail");
        email = scanner.nextLine();

    }
    public void printPeopleDetails(ArrayList<People> ListPeople, String nameToSearch) {

        for (People people : ListPeople) {
            System.out.println("Dados Pessoais: ");
            System.out.println("Nome: " + people.getName());
            System.out.println("CPF: " + people.getCPF());
            System.out.println("Número de Telefone: " + people.getPhoneNumber());
            System.out.println("Endereço: " + people.getAddress());
            System.out.println("E-mail: " + people.getEmail());

        }

public class PeopleView {

    public void printPeopleDetails(People people){

        System.out.println("Dados Pessoais: "  );
        System.out.println("Nome: " + people.getName() );
        System.out.println("CPF: " + people.getCPF() );
        System.out.println("Número de Telefone: " + people.getPhoneNumber() );
        System.out.println("Endereço: " + people.getAddress() );
        System.out.println("E-mail: " + people.getEmail() );

    }

    public String nameSearch(ArrayList<People> ListPeople, String nameToSearch){
      for (People people : ListPeople){
          if (people.getName().equals(nameToSearch)){
              return people.getName();
          }
      }
        return nameToSearch;
    }

}
