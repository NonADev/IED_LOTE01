package lote01;
//Implemente na classe Lista um método que remove o elemento de uma posição específica recebida
//por parâmetro
public class Ex7 {
    class Lista{
        public Integer[] removedor(Integer v[], int c){
            Integer vv[] = new Integer[v.length-1];
            for(int i=0, last=0;i<vv.length;i++, last++){
                if(i==c){
                    last++;
                }
                vv[i]=v[last];
            }
            return vv;
        }
    }
}
