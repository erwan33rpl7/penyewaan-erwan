package penyewaan;

import java.util.Scanner;

public class penyewaantester extends Product {
    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
     CD CD =new CD();
     DVD DVD=new DVD();
    System.out.println("CD atau DVD?");
    String pilihan = s.next();
    if (pilihan.equals("CD")){
        CD.print();
    }else if (pilihan.equals("DVD")){
            DVD.print();
        }else {
        System.out.println("sistem error");
    }
    }
    
     }

        




    
    
    



   