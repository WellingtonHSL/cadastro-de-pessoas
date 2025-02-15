package view;

import model.People;

public class PeopleView {

    public void printPeopleDetails(People people){

        System.out.println("Dados Pessoais: "  );
        System.out.println("Nome: " + people.getName() );
        System.out.println("CPF: " + people.getCPF() );
        System.out.println("Número de Telefone: " + people.getPhoneNumber() );
        System.out.println("Endereço: " + people.getAddress() );
        System.out.println("E-mail: " + people.getEmail() );

    }
    public void noPeopleFound(){
        System.out.println("Nenhum registro encontrado!");
    }
}