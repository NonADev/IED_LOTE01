package lote01;

import java.util.List;

//Implemente uma Lista de caracteres em alocação estática com todas as operações indicadas a seguir:
//-verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
//-verificar se a lista está cheia, retornando true se estiver cheia e false se não estiver;
//-adicionar caractere no início da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//-adicionar caractere no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//-adicionar caractere em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando o motivo;
//-remover caractere do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-remover caractere do final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-remover caractere de determinada posição da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-percorrer a lista concatenando os elementos em uma String que será devolvida no final
public class Ex8 {
    private static char[] lista;
    private String concatCAString(){
        String re = "";
        for(int i=0;i<lista.length;i++){
            re+=lista[i];
        }
        return re;
    }
    private void removeCharIndex(int index){
        String a=lista.toString().substring(0,index-1);
        String b=lista.toString().substring(index+1, lista.length);
        lista = (a+b).toCharArray();
    }
    private void removeCharInicial(){
        lista = lista.toString().substring(1).toCharArray();
    }
    private void removeCharFinal(){
        lista = lista.toString().substring(0,lista.length-1).toCharArray();
    }
    private boolean verifyIfEmpty() {
        for (char c : lista) {
            if (c == '\u0000')
                continue;
            return false;
        }
        return true;
    }
    private boolean verifyIfFull() {
        for (char c : lista) {
            if (c != '\u0000')
                continue;
            return false;
        }
        return true;
    }
    private void addInicioChar(char a){
        String b = a+lista.toString();
        try{
            lista = b.toCharArray();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private void addFinalChar(char a){
        String b = lista.toString()+a;
        try{
            lista = b.toCharArray();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private void midPositionInsert(char c, int index){
        try{
            String a = lista.toString().substring(0,index-1);
            String b = lista.toString().substring(index+1, lista.length);
            String z = a+c+b;
            lista = z.toCharArray();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
