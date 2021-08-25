public class Exemplo1 {
    
    public void exibir(){
    System.out.println("Teste de Try, Catch e Finally");
    int [] numeros = {2, 4, 8, 16, 32};
    int [] divisor = {2, 0, 2, 0, 4};

    // exemplo de try, catch e finally
    for(int i=0; i<numeros.length; i++){
      try{// vaai tentar executar o erro
      System.out.println("Teste " + (i+1));
      System.out.println(numeros[i] + "/" + divisor[i] + " = " + numeros[i]/divisor[i]);//no decorrer do for vai tentar dividir 4 e 16 por 0
      
      }catch(ArithmeticException exception){//se houver erro o catch recebe o tipo do erro para tratar ele
      System.out.println("Erro ao dividir por 0");
      } 
      finally{
        System.out.println("teste de impressão no finally");//Oque tiver dentro do finally sempre vai ser executado independente se o codigo dentro do try foi executado com sucesso ou não
        System.out.println();
      }
    }
    System.out.println("Fim do teste de Try, Catch e Finally");
    System.out.println();
  }
}