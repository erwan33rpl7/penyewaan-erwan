package penyewaan;

import java.util.Scanner;

public class CD extends Product {
    private String artist;
   private int totalsong;
  private String label;
    public CD (){
        number = 7;
        name ="hari ini hari yang kau tunggu ";
        quantity =11;
        price= 12000.0;
        artist= "R-1";
        totalsong =9;
        label="ngawi music";
        
    }
    public void print(){
        System.out.println("number: "+ number);
        System.out.println("name: "+ name);
        System.out.println("quantity: "+ quantity);
        System.out.println("price: "+ price);
        System.out.println("artist: "+ artist);
        System.out.println("total song: "+ totalsong);
        System.out.println("label: "+ label);
    }
    


}