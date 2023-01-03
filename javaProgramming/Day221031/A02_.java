package Day221031;

import java.util.Scanner;

import Day221017.duck;
import Day221017.scannerref;

class Duck1{
    private double Ducksize;
    private String Duckname;

    public Duck1(double Ducksize,String Duckname){
        this.Duckname=Duckname;
        this.Ducksize=Ducksize;
        System.out.println("이름은: "+this.Duckname);
        System.out.println("크기는: "+this.Ducksize);
    }
}

public class A02_ {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("오리크기>> ");
        double Ducksize=scan.nextDouble();
        System.out.println("오리이름>> ");
        String Duckname=scan.nextLine();
        new Duck1(Ducksize, Duckname);        

    }
}
