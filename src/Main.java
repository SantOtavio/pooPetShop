import javax.swing.*;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        principalMenu();
    }

    private static void principalMenu() {
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++MENU PETSHOP+++++" +
                "\n1 - Cadastrar animal" +
                "\n2 - Listar animais" +
                "\n3 - Editar animais" +
                "\n4 - Remover animais"));

        switch (choose){
            case 1:
                registerAnimal();
                break;
            case 2:
                listAnimals();
                break;
            case 3:
                editAnimals();
                break;
            case 4:
                removeAnimals();
                break;
        }
    }

    private static void removeAnimals() {
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null , "+++++MENU REMOVEDOR+++++" +
                "\n1 - Remover cachorro" +
                "\n2 - Remover bovino"));
        switch (choose){
            case 1:
            case 2:
                removeAnimalsMain(choose);
                break;
        }
    }

    private static void removeAnimalsMain(int choose) {
        if (choose == 1){
            int id = Integer.parseInt(JOptionPane.showInputDialog(null , "Insira o id do animal"));
            Cachorro.removeDog(id);
        } else if (choose == 2){
            String gta = JOptionPane.showInputDialog(null , "Insira o GTA do animal");
            Bovino.removeBovin(gta);
        } else {
            JOptionPane.showMessageDialog(null,  "deu erro ai cara");
            removeAnimals();
        }
    }

    private static void editAnimals() {
    }

    private static void listAnimals() {
    }

    private static void registerAnimal() {
        String nome, tipo, raca;
        int idade;

        nome = JOptionPane.showInputDialog(null, "Insira o nome do animal:");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do animal"));
        tipo = JOptionPane.showInputDialog(null, "Insira o tipo do animal");
        raca = JOptionPane.showInputDialog(null, "Insira a raça do animal");

        if (tipo.equalsIgnoreCase("CACHORRO")) {
            registerDog(nome, idade, tipo, raca);
        } else if (tipo.equalsIgnoreCase("BOVINO")) {
            registerBovin(nome, idade, tipo, raca);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR");
            registerAnimal();
        }
    }

    private static void registerBovin(String nome, int idade, String tipo, String raca) {
        int qtdArroba;
        String fazenda, gta;

        qtdArroba = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de arroba do bovino"));
        fazenda = JOptionPane.showInputDialog(null, "Insira a fazenda em que o bovino faz parte");
        gta = JOptionPane.showInputDialog(null, "Insira o gta do animal");

        Bovino.registerBovin(nome, idade, tipo, raca, qtdArroba, fazenda, gta);

    }

    private static void registerDog(String nome, int idade, String tipo, String raca) {
        int peso;
        boolean tomouVacina;
        String corOlho;
        int idAnimal;

        idAnimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um id para o animal"));
        peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o peso"));
        tomouVacina = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "O animal já tomou todas as vacinas?"));
        corOlho = JOptionPane.showInputDialog(null, "Qual a cor do olho do animal");

        Cachorro.registerDog(nome, tipo, raca, idade, idAnimal, peso, tomouVacina, corOlho);
    }
}
