package Main;
import Pacotes.Pessoa;

public class TestaPessoa {
    
    public static void main(String[] args) {
        
        Pessoa P1 = new Pessoa("Carla", "Rua A, 137, Centro - Pirapora-MG", "(38) 3740-0000");
        
        System.out.println("Nome: " + P1.getNome());
        System.out.println("Endereço: " + P1.getEndereco());
        System.out.println("Telefone: " + P1.getTelefone());
    }
    
}