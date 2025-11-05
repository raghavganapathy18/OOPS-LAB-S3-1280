import java.util.*;

abstract class Device {
    protected int deviceId; protected String brand; protected double price;
    public Device(int id,String b,double p){ deviceId=id; brand=b; price=p; }
    public abstract void displayDetails();
}

interface Discountable {
    void applyDiscount(double percent);
}

class Smartphone extends Device implements Discountable {
    private double discountedPrice;
    public Smartphone(int id,String b,double p){ super(id,b,p); discountedPrice=p; }
    public void applyDiscount(double percent){ discountedPrice=price-(price*percent/100); }
    public void displayDetails(){
        System.out.println("Device ID: "+deviceId+"\nBrand: "+brand+"\nFinal Price: ₹"+discountedPrice);
    }
}

public class SmartDeviceStore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Smartphone phone=null; int ch;
        do{
            System.out.println("\n1.Add 2.Discount 3.View 4.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("ID: "); int id=sc.nextInt(); sc.nextLine();
                    System.out.print("Brand: "); String b=sc.nextLine();
                    System.out.print("Price: "); double p=sc.nextDouble();
                    phone=new Smartphone(id,b,p); break;
                case 2:
                    if(phone!=null){ System.out.print("Discount %: "); phone.applyDiscount(sc.nextDouble()); }
                    else System.out.println("Add phone first!");
                    break;
                case 3:
                    if(phone!=null) phone.displayDetails();
                    else System.out.println("No data!");
                    break;
            }
        }while(ch!=4);
        sc.close();
    }
}



// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 6
// Question 2
