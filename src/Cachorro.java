import java.util.ArrayList;

public class Cachorro extends Animal {
    private static String nome;
    private static String tipo;
    private static String raca;
    private static int idade;
    private static int peso;
    private static boolean tomouVacina;
    private static String corOlho;
    int idAnimal;

    public static ArrayList<Cachorro> listDogs = new ArrayList<Cachorro>();
    public static ArrayList<Cachorro> sellDogs = new ArrayList<Cachorro>();


    public Cachorro(String nome, String tipo, String raca, int idade, int peso, boolean tomouVacina, String corOlho, int idAnimal) {
        super(nome, tipo, raca, idade);
        this.peso = peso;
        this.tomouVacina = tomouVacina;
        this.corOlho = corOlho;
        this.idAnimal = idAnimal;
    }

    public static void registerDog(String nome, String tipo, String raca, int idAnimal, int idade, int peso, boolean tomouVacina, String corOlho) {

        Cachorro dTemp = new Cachorro(nome, tipo, raca, idade, peso, tomouVacina, corOlho, idAnimal);
        listDogs.add(dTemp);

    }

    public static void removeDog(int id) {
    }

    public static void sellDog(int idAnimal) {
        Cachorro sTemp = new Cachorro(nome, tipo, raca, idade, peso, tomouVacina, corOlho, idAnimal);
        sellDogs.add(sTemp);
        removeDog(idAnimal);
        Main.principalMenu();
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isTomouVacina() {
        return tomouVacina;
    }

    public void setTomouVacina(boolean tomouVacina) {
        this.tomouVacina = tomouVacina;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }
}
