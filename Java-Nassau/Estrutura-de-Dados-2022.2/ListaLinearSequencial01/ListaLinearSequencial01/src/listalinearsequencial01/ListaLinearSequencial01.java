package listalinearsequencial01;
import java.util.Scanner;
public class ListaLinearSequencial01 {
    public static boolean listavazia (int qtd){
        if (qtd==0){
            System.out.println("Lista vazia!");
            return false;
        } else {
            return true;
        }
    }
    public static boolean listacheia (float vetor[],int qtd){
        if (qtd==vetor.length){
            System.out.println("Lista cheia!");
            return false;
        } else {
            return true;
        }
    }
    public static int inserir(float vet[], int qtd){
        Scanner ler = new Scanner(System.in);
        if (qtd==vet.length){
            System.out.println("Lista Cheia! Nao posso incluir.");
        } else {
            System.out.print("Informe o valor: ");
            vet[qtd] = ler.nextFloat();
            qtd++;
        }
        return qtd;
    }
    public static void listar(float vet[],int qtd){
        if (qtd==0){
            System.out.println("Lista vazia!");
        } else {
            for (int i=0;i<qtd;i++){
                System.out.println("O valor na posicao "+i+" e: "+vet[i]);
            }
        }
    }
    public static int pesquisar (float vetor[], int qtd){
        Scanner ler = new Scanner(System.in);
        int ret = -1;
        if (listavazia(qtd)){
            System.out.print("Informe o valor: ");
            float valor = ler.nextFloat();
            boolean naoachei = true;
            for (int i=0;i<qtd;i++){
                if (vetor[i] == valor){
                    System.out.println("Valor encontrado na posição "+i);
                    naoachei = false;
                    ret = i;
                }
            }
            if (naoachei){
                System.out.println("Valor não encontrado!");
            }
        }
        return ret;
    }
    public static int excluir (float vetor[],int qtd){
        int indice = pesquisar(vetor,qtd);
        if (indice==-1){
            return qtd;
        } else {
            vetor[indice] = vetor[(qtd-1)];
            System.out.println("Valor excluído com sucesso!");
            return --qtd;
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float notas[] = new float [5];
        int opc = 0;
        int qtd = 0;
        while (opc != 5){
            System.out.println("");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
            opc = ler.nextInt();
            switch (opc) {
                case 1:
                    qtd = inserir(notas,qtd);
                    break;
                case 2:
                    listar(notas,qtd);
                    break;
                case 3:
                    pesquisar(notas,qtd);
                    break;
                case 4:
                    qtd = excluir(notas, qtd);
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            } 
        }
    }
}
