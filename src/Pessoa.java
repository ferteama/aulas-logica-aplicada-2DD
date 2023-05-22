public class Pessoa {
    // Atributo
    String nome;
    String sobrenome;
    // Métodos
    public void falar() {
        System.out.println("falei");
    }
    // Sobrecarga do método falar()
    public String falar(String volume){
        return "falei" + volume;

    }
    // Contrutor
    Pessoa(){

    }
    Pessoa(String _nome){
        this.nome = _nome;
    }
}

