package lote01;
//Implemente uma Lista de Strings em alocação estática com todas as operações indicadas a seguir:
//-verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
//-verificar se a lista está cheia, retornando true se estiver cheia e false se não estiver;
//-adicionar uma String no início da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//-adicionar uma String no final da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//-adicionar uma String em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando o motivo;
//-remover a String do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-remover a String do final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-remover a String de determinada posição da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-percorrer a lista concatenando os elementos em uma String que será devolvida no final
public class Ex9 {
    private static String lista[];
    private void addMidString(String add, int index){
//        String k[] = lista. /////////
        PAREI AQUI. ME CORRIJA
    }
    private void addInitialString(String add){
        String[] re = new String[lista.length+1];
        re[0] = add;
        for(int i=0;i<lista.length;i++){
            re[i+1]=lista[i];
        }
        lista = re;
    }
    private void addFinalString(String add){
        String[] re = new String[lista.length+1];
        re[re.length-1] = add;
        for(int i=0;i<lista.length;i++){
            re[i]=lista[i];
        }
        lista = re;
    }
    private boolean verifyIfFull(){
        for(int i=0;i<lista.length;i++){
            if(lista[i]==null){
                continue;
            }
            return false;
        }
        return true;
    }
    private boolean verifyIfEmpty(){
        for(int i=0;i<lista.length;i++){
            if(lista[i]!=null){
                continue;
            }
            return false;
        }
        return true;
    }
}
