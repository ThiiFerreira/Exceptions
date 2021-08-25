import java.util.Scanner;
public class Exemplo3 {
  public void exibir(){
    System.out.println("Teste de throw");
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um ano apartir de 2010:");
    int ano = scan.nextInt();
    verificaAno(ano);
    System.out.println("Fim do teste de throw");
    System.out.println();
  }

  public void verificaAno(int ano){
       try{
         if(ano>2010){
            System.out.println("Ok, ano valido");
            System.out.println();
         }else{
            //throw serve para criarmos nossa propria exceção
            throw new Exception("Exceção por ano invalido");
         }
       }catch(Exception e){
          System.out.println(e.getMessage());//getMessage serve para exibir o motivo do erro
       }
  }
}

