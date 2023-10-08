package Temel_Kavramlar;


import java.util.Scanner;
public class Do_WhileÖrn {
//1’den 100 ' e kadar olan sayıların toplamı.
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 
    
    int sayi = 0;
    
    do{
        
        System.out.println("Merhaba Albertine");
        
    }while(sayi > 5);
    
    
    System.out.println("****************");
    
    
    
    
    int sayac = 0, toplam = 0;
    
    do{
        
        sayac++;
        toplam += sayac;
        
    }while(sayac <= 100);
    
    System.out.println("Toplam: "+toplam);
    
    

	}

}
