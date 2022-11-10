package listalinearsequencialordenada02;
import java.util.Scanner;
public class ListaLinearSequencialOrdenada02 {

    public static int pesquisarMaior(String vet[], int qtd, String valor){
        for (int i=0;i<qtd;i++){
            if (valor.compareTo(vet[i]) < 0){
                return i;
            }
        }
        return -1;
    }

    public static boolean listavazia(int qtd){
        if (qtd==0){
            System.out.println("Lista vazia!");
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean listacheia(String vetor[],int qtd){
        if (qtd==vetor.length){
            System.out.println("Lista cheia!");
            return false;
        } else {
            return true;
        }
    }
    
    public static int inserir(String vet[], int qtd){
        Scanner ler = new Scanner(System.in);
        String valor;
        int indice;
        if (qtd==vet.length){
            System.out.println("Lista Cheia! Nao posso incluir.");
        } else {
            System.out.print("Informe o valor: ");
            valor = ler.next();
            if (qtd==0){
                vet[qtd] = valor;
            } else {
                indice = pesquisarMaior(vet,qtd,valor);
                if (indice == -1){
                    vet[qtd] = valor;
                } else {
                    for (int i=qtd; i>indice; i--){
                        vet[i] = vet[i-1];
                    }
                    vet[indice] = valor;
                }
            }
            qtd++;
        }
        return qtd;
    }
    
    public static void listar(String vet[],int qtd){
        if (qtd==0){
            System.out.println("Lista vazia!");
        } else {
            for (int i=0;i<qtd;i++){
                System.out.println("O valor na posicao "+i+" e: "+vet[i]);
            }
        }
    }
    
    public static int pesquisar (String vet[], int qtd){
        Scanner ler = new Scanner(System.in);
        if (listavazia(qtd)){
            System.out.print("Informe o valor: ");
            String valor = ler.next();
            for (int i=0;i<qtd;i++){
                if (valor.equals(vet[i])){
                    System.out.println("Valor encontrado na posição "+i);
                    return i;
                }
            }
        }
        System.out.println("Valor não encontrado!");
        return -1;
    }

    public static int excluir (String vet[],int qtd){
        int indice = pesquisar(vet,qtd);
        if (indice==-1){
            return qtd;
        } else {
            for (int i=indice; i<qtd; i++){
                vet[i] = vet[i+1];
            }
            System.out.println("Valor excluído com sucesso!");
            return --qtd;
        }
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nomes[] = new String[5];
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
                    qtd = inserir(nomes,qtd);
                    break;
                case 2:
                    listar(nomes,qtd);
                    break;
                case 3:
                    pesquisar(nomes,qtd);
                    break;
                case 4:
                    qtd = excluir(nomes, qtd);
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
