package lote01;

import java.util.Scanner;

public class Ex5 {
    private Integer[][] loadMatriz(){
        Integer[][] v = new Integer[4][4];
        Scanner s = new Scanner(System.in);
        int a = 1;
        for(int i=0;i<4;i++){
            for(int ii=0;ii<4;ii++){
                if(i==ii){
                    v[i][ii] = a;
                    a*=3;
                }
                else{
                    v[i][ii] = 0;//v[i][ii] = s.nextInt();
                }
            }
        }
        return v;
    }
    public void calc(){
        Integer[][] v = loadMatriz();
        for(int i=0;i<4;i++){
            for(int ii=0;ii<4;ii++){
                System.out.print(v[i][ii]+" | ");
            }
            System.out.println();
        }
    }
}
