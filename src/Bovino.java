import javax.swing.*;
import java.util.ArrayList;

public class Bovino extends Animal {
    private static String nome;
    private static String tipo;
    private static String raca;
    private static int idade;
    private static int qtdArroba;
    private static String fazenda;
    String gta;

    public static ArrayList<Bovino> bovinList = new ArrayList<Bovino>();
    public static ArrayList<Bovino> sellBovinList = new ArrayList<Bovino>();

    public Bovino(String nome, String tipo, String raca, int idade, int qtdArroba, String fazenda, String gta) {
        super(nome, tipo, raca, idade);
        this.qtdArroba = qtdArroba;
        this.fazenda = fazenda;
        this.gta = gta;
    }



    public static void registerBovin(String nome, int idade, String tipo, String raca, int qtdArroba, String fazenda, String gta) {
        Bovino bTemp = new Bovino(nome, tipo, raca, idade, qtdArroba, fazenda, gta);
        bovinList.add(bTemp);
    }

    public static void removeBovin(String gta) {
        for (int i = 0; i < Bovino.bovinList.size(); i++) {
            if (Bovino.bovinList.get(i).getGta().equalsIgnoreCase(gta)) {
                Bovino.bovinList.remove(i);
            } else {
                JOptionPane.showMessageDialog(null, "Gta inserido é invalido");
                Main.principalMenu();
            }
        }
    }

    public static void sellBovin(String gta) {
        Bovino sTemp = new Bovino(nome, tipo, raca, idade, qtdArroba, fazenda, gta);
        sellBovinList.add(sTemp);
        removeBovin(gta);
        Main.principalMenu();
    }

    public int getQtdArroba() {
        return qtdArroba;
    }

    public void setQtdArroba(int qtdArroba) {
        this.qtdArroba = qtdArroba;
    }

    public String getFazenda() {
        return fazenda;
    }

    public void setFazenda(String fazenda) {
        this.fazenda = fazenda;
    }

    public String getGta() {
        return gta;
    }

    public void setGta(String gta) {
        this.gta = gta;
    }
}
