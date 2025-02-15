package view;

public class PeopleView {

    public void printPeopleDetails(String name, String CPF, int phoneNumber, String address, String email){

        System.out.println("Dados Pessoais: "  );
        System.out.println("Nome: " + name );
        System.out.println("CPF: " + CPF );
        System.out.println("Número de Telefone: " + phoneNumber );
        System.out.println("Endereço: " + address );
        System.out.println("E-mail: " + email );

    }
    public void noPeopleFound(){
        System.out.println("Nenhum registro encontrado!");
    }
}