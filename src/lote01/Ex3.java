package lote01;
//3. Carregar um vetor [100] inteiros positivos ou negativos. Classificar este vetor em ordem crescente e
//        apresentar os valores.

import java.util.Random;

public class Ex3 {
    private Integer[] loadVector(){
        Random r = new Random();
        Integer[] v = new Integer[100];
        for(int i=0;i<100;i++){
            v[i]=r.nextInt();
        }
        return v;
    }
    private Integer[] booble(Integer v[]){
        for(int i=0;i<v.length;i++){
            for(int ii=0;ii<v.length;ii++){
                if(v[i]<v[ii]){
                    Integer k = v[i];
                    v[i] = v[ii];
                    v[ii] = k;
                }
            }
        }
        return v;
    }
    public void calc(){
        Integer v[] = loadVector();
        v=booble(v);
        for(int i=0;i<100;i++){
            System.out.println(v[i]);
        }
    }
}
