/*
 GRUPO: 
 
 Matheus Bezerra / 01524929
 Miguel Balbino  / 01511210
 Osvaldo Queiroz / 01523854
            
 */


import java.util.Random;
import java.util.Scanner;
public class AV {
    public static void main(String[] args) {
        int vet[] = new int[20];
        int vetAux[] = new int[vet.length];
        Random aleatorio = new Random();
        for(int i=0; i < vet.length;i++){
            vet[i] = aleatorio.nextInt(1000);
        }
        System.out.println("### Lista Desordenada ###");
        for(int val:vet){
            System.out.print(val+"-");
        }
        System.out.println("");
        try (Scanner leia = new Scanner(System.in)) {
            int opc = 0;
            while (opc != 4){
                System.out.println("");
                System.out.println("# Vamos Ordenar? #");
                System.out.println("1 - Por Troca");
                System.out.println("2 - Por Seleção");
                System.out.println("3 - Por Inserção");
                System.out.println("4 - Sair");
                System.out.println("");
                System.out.print("Informe a opção desejada: ");
                opc = leia.nextInt();
                switch (opc) {
                    case 1:
                        vetAux = vet.clone();
                        ordenarPorTroca(vetAux);
                        break;
                    case 2:
                        vetAux = vet.clone();
                        ordenarPorSelecao(vetAux);
                        break;
                    case 3:
                        vetAux = vet.clone();
                        ordenarPorInsercao(vetAux);
                        break;
                    case 4:
                        System.out.println("Sair");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                } 
            }
        }
    }

    /**
     * @param vetAux
     */
    private static void ordenarPorTroca(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordenação por Troca ###");
        //criar aqui a lógica da Ordenação por Troca
        int troca;
        for(int i=0; i < vetAux.length; i++){
            com++;
            for(int j = i +1; j < vetAux.length; j++){
                if (vetAux[i] > vetAux[j]){
                    troca = vetAux[j];
                    vetAux[j] = vetAux[i];
                    vetAux[i] = troca; 
                    tro++;
                }
            }
        }
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void ordenarPorSelecao(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        int menor, troca;
        System.out.println("### Ordenação por Seleção ###");
        //criar aqui a lógica da Ordenação por Seleção
        for(int i=0; i < vetAux.length; i++){
            menor = i;
            com++;
            for(int j = i+1; j < vetAux.length; j++){
                if (vetAux[j] < vetAux[menor]){
                    menor = j;
                    tro++;
                }
               }
                    troca = vetAux[menor];
                    vetAux[menor] = vetAux[i];
                    vetAux[i] = troca; 
                   }
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

        private static void ordenarPorInsercao(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordenação por Inserção ###");
        //criar aqui a lógica da Ordenação por Inserção
        int troca;
        int j;
        for(int i=1; i<vetAux.length; i++){
            troca = vetAux[i];
            j = i-1;
            com++;
            while(j >= 0 && vetAux[j] < troca){
            vetAux[j+1] = vetAux[j];
            tro++;
            j--;
            }
            vetAux[j+1] = troca;
        }
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void listarVetorOrdenado(int vetAux[]) {
        System.out.println("### Lista Ordenada ###");
        for(int val:vetAux){
            System.out.print(val+"-");
        }
        System.out.println("");
    }

    private static void listarComplexiade(int tro, int com) {
        System.out.println("### Complexidade ###");
        System.out.println("Comparações: "+com);
        System.out.println("Trocas: "+tro);
    }
}