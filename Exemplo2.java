import java.util.Scanner;
public class Exemplo2{
  public void exibir(){
     System.out.println("Teste de Throws");
    Scanner scan = new Scanner(System.in);
    System.out.println("Bem vindo Digite seu nome:");
    String nome = scan.next();

    System.out.println("Digite sua idade:");
    int idade;
    try{
       idade = lerIdade();// caso o usuario digiter um caracter que não seja numero
    }catch(Exception e){
      System.out.println("Dado inserido invalido");
      System.out.println();
    }
      System.out.println("Fim do teste de Throws");
      System.out.println();
  } 
    // o throws ele passa a responsabilidade de resolver o  problema para quem for utilizar o metodo, no caso desse metodo, passando a responsabilidade caso o usuario não digite um caracter valido
    public static int lerIdade() throws Exception {
    Scanner scan = new Scanner(System.in);
    int idade = scan.nextInt();
    return idade;
    }
}