package lote01;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    private Integer[] loadVector(){
        Random r = new Random();
        Integer[] v = new Integer[5];
        for(int i = 0; i<5;i++){
            v[i]= r.nextInt();
        }
        return v;
    }
    private Integer fatorial(int n){
        int re = n;
        for(n--;n>1;n--){
            re*=n;
        }
        return re;
    }
    public void calc(){
        Integer[] v = new Integer[5];
        Integer[] vv = new Integer[5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++){
            v[i] = s.nextInt();
        }
        for(int i=0;i<5;i++){
            vv[i] = fatorial(v[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println(v[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println(vv[i]);
        }
    }
}
