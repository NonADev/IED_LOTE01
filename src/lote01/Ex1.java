package lote01;

import java.util.Random;

public class Ex1{
    private Double[] loadVector(){
        Random r = new Random();
        Double v[] = new Double[100];
        for(int i=0;i<100;i++){
            v[i] = r.nextDouble()*1000;
        }
        return v;
    }
    private Double media100_1000(Double[] v){
        Double soma=0.0;
        for(int i=0;i<100;i++){
            if(v[i]>100&&v[i]<1000)
                soma+=v[i];
        }
        return (soma/100);
    }
    private Double mediaGeral(Double[] v){
        Double soma=0.0;
        for(int i=0;i<100;i++){
            soma+=v[i];
        }
        return (soma/100);
    }
    private Double somaNegativos(Double[] v){
        Double soma=0.0;
        for(int i=0;i<100;i++){
            if(v[i]<0)
                soma+=v[i];
        }
        return soma;
    }
    public void calc(){
        Double[] v = this.loadVector();
        System.out.println("Media '$>100 & $<1000: "+this.media100_1000(v));
        System.out.println("Media geral: "+this.mediaGeral(v));
        System.out.println("Soma Negativos: "+this.somaNegativos(v));
    }
}