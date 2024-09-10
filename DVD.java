package penyewaan;

public class DVD extends Product {
   private int length;
    private String rating; 
    private String studio;
    public DVD (){
        number = 7;
        name ="selamat jumpa lah";
        quantity =9;
        price= 15000.0;
        length =44;
        rating ="PG13";
        studio ="ngawi jaya";


       
    }
    public void print(){
        System.out.println("number: "+ number);
        System.out.println("name: "+ name);
        System.out.println("quantity: "+ quantity);
        System.out.println("price: "+ price);
        System.out.println("length: "+ length);
        System.out.println("rating: "+ rating);
        System.out.println("studio: "+ studio);
    }

    
}
