import javax.swing.*;
import java.net.Inet4Address;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        principalMenu();
    }

    public static void principalMenu() {
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null, "+++++MENU PETSHOP+++++" +
                "\n1 - Cadastrar animal" +
                "\n2 - Listar animais" +
                "\n3 - Editar animais" +
                "\n4 - Remover animais" +
                "\n5 - Vender animais"));

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
            case 5:
                sellAnimal();
                break;
        }
    }

    private static void sellAnimal() {
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null , "1 - Cachorro 2 - Bovino"));

        switch (choose){
            case 1:
                int idAnimal = Integer.parseInt(JOptionPane.showInputDialog(null , "Insira o id do animal"));
                Cachorro.sellDog(idAnimal);
                break;
            case 2:
                String gta = JOptionPane.showInputDialog(null , "Insira o gta do animal");
                Bovino.sellBovin(gta);
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
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null , "+++++MENU EDITAR+++++" +
                "\n1 - Bovino" +
                "\n2 - Cachorro"));

        editAnimalsMain(choose);
    }

    private static void editAnimalsMain(int choose) {
        if (choose == 1){
            bovinEdit();
        } else if(choose == 2){
            dogEdit();
        } else {
            JOptionPane.showMessageDialog(null , "Numero inserido de forma incorreta!");
            editAnimals();
        }
    }

    private static void dogEdit() {
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null , "+++++MENU EDICAO CACHORRO+++++" +
                "\n1 - Um atributo" +
                "\n2 - Todos os atributos"));

        switch (choose){
            case 1:
            case 2:
                dogEditMain(choose);
                dogEditMain(choose);
                break;
        }
    }

    int peso;
    boolean tomouVacina;
    String corOlho;
    int idAnimal;

    private static void dogEditMain(int choose) {
        int idAnimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o id do animal"));
        if (choose == 1){
            choose = Integer.parseInt(JOptionPane.showInputDialog(null , "++++ESCOLHA ATRIBUTO+++++" +
                    "\n1 - Peso" +
                    "\n2 - Tomou a Vacina?" +
                    "\n3 - Cor do olho" +
                    "\n4 - Id do animal"));
            switch (choose){
                case 1:
                    int newPeso = Integer.parseInt(JOptionPane.showInputDialog(null , "Insira o novo peso"));
                    Cachorro.listDogs.get(idAnimal).setPeso(newPeso);
                    break;
                case 2:
                    boolean tomouvacinaNew = Boolean.parseBoolean(JOptionPane.showInputDialog(null , "Insira o novo valor para tomou vacina?"));
                    Cachorro.listDogs.get(idAnimal).setTomouVacina(tomouvacinaNew);
                    break;
                case 3:
                    String cordoolhonew = JOptionPane.showInputDialog(null , "Insira a cor do olho");
                    Cachorro.listDogs.get(idAnimal).setCorOlho(cordoolhonew);
                    break;
                case 4:
                    int newid = Integer.parseInt(JOptionPane.showInputDialog(null , "Insira um novo id"));
                    Cachorro.listDogs.get(idAnimal).setIdAnimal(newid);
                    break;
            }
        } else if (choose == 2){

        } else {
            JOptionPane.showMessageDialog(null , "N??mero inserido foi errado!");
            dogEdit();
        }
    }

    private static void bovinEdit() {
    }

    private static void listAnimals() {
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null , "+++++MENU LISTAGEM+++++" +
                "\n1 - Animais em estoque" +
                "\n2 - Animais vendidos"));

        if (choose == 1){
            for (int i = 0 ; i < Cachorro.listDogs.size() ; i++){
                JOptionPane.showMessageDialog(null , Cachorro.listDogs.get(i).getNome() + Cachorro.listDogs.get(i).getIdAnimal() + Cachorro.listDogs.get(i).getRa??a());
            }
            for (int i = 0 ; i < Bovino.bovinList.size() ; i++){
                JOptionPane.showMessageDialog(null , Bovino.bovinList.get(i).getNome() + Bovino.bovinList.get(i).getGta() + Bovino.bovinList.get(i).getRa??a());
            }
        } else if (choose == 2){
            for (int i = 0 ; i < Cachorro.listDogs.size() ; i++){
                JOptionPane.showMessageDialog(null , Cachorro.sellDogs.get(i).getIdAnimal());
            }
            for (int i = 0 ; i < Bovino.bovinList.size() ; i++){
                JOptionPane.showMessageDialog(null , Bovino.sellBovinList.get(i).getGta());
            }
        }

    }

    private static void registerAnimal() {
        String nome, tipo, raca;
        int idade;

        nome = JOptionPane.showInputDialog(null, "Insira o nome do animal:");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do animal"));
        tipo = JOptionPane.showInputDialog(null, "Insira o tipo do animal");
        raca = JOptionPane.showInputDialog(null, "Insira a ra??a do animal");

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
        Main.principalMenu();
    }

    private static void registerDog(String nome, int idade, String tipo, String raca) {
        int peso;
        boolean tomouVacina;
        String corOlho;
        int idAnimal;

        idAnimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um id para o animal"));
        peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o peso"));
        tomouVacina = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "O animal j?? tomou todas as vacinas?"));
        corOlho = JOptionPane.showInputDialog(null, "Qual a cor do olho do animal");

        Cachorro.registerDog(nome, tipo, raca, idade, idAnimal, peso, tomouVacina, corOlho);
        Main.principalMenu();
    }
}
