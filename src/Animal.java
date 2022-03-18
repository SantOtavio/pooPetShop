public class Animal {
    String nome, tipo, raca;
    int idade;

    public Animal(String nome, String tipo, String raça, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raça;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaça() {
        return raca;
    }

    public void setRaça(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
