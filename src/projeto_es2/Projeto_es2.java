
package projeto_es2;

import java.util.*;

public class Projeto_es2 
{

    public static void main(String[] args) 
    {
           Funcionario f = new Funcionario();
           String nome;
           Scanner leitor = new Scanner(System.in);
           
           System.out.println("Qual o nome do funcionario?");
           nome = leitor.next();
           
           f.setNome(nome);
           f.addFuncionario(f);
    }
    
}
