package lote01;

import java.util.Random;

// Carregar uma matriz [4 x 4 inteiro]. Apresentar:
//          Soma dos valores no intervalo de 1 a 100
//          Quantidade de números ímpares entre 30 a 50
//          Quantidade de números divisíveis por 8
//          Quantidade de números ímpares divisíveis por 3
//          Fatorial do maior número informado na matriz
public class Ex4 {
    private Double[][] loadMatriz() {
        Double[][] m = new Double[4][4];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                m[i][ii] = r.nextInt()/100000000.0;
            }
        }
        return m;
    }

    private Double fatorialMaior(Double v[][]){
        Double k=v[0][0];
        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                if (k<v[i][ii])
                    k=v[i][ii];
            }
        }
        for(Double i=k-1;i>1;i--){
            k*=i;
        }
        return k;
    }

    private Double divPer3Imp(Double v[][]) {
        Double c = 0.0;
        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                if (v[i][ii] % 2 != 0 && v[i][ii] % 3 == 0)
                    c += v[i][ii];
            }
        }
        return c;
    }

    private int numDivPer8(Double v[][]) {
        int c = 0;
        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                if (v[i][ii] % 8 == 0)
                    c += v[i][ii];
            }
        }
        return c;
    }

    private int sum1_100(Double v[][]) {
        int c = 0;
        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                if (v[i][ii] > 1 && v[i][ii] < 100)
                    c += v[i][ii];
            }
        }
        return c;
    }

    private int impares30_50(Double v[][]) {
        int c = 0;
        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                if (v[i][ii] > 30 && v[i][ii] < 50 && v[i][ii]%2!=0)
                    c += v[i][ii];
            }
        }
        return c;
    }

    public void calc() {
        Double v[][] = loadMatriz();
        System.out.println(sum1_100(v));
        System.out.println(impares30_50(v));
        System.out.println(numDivPer8(v));
        System.out.println(divPer3Imp(v));
        System.out.println(fatorialMaior(v));
    }
}
