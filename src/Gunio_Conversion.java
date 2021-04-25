
import java.util.*;
public class Gunio_Conversion {
    //Program to convert US dollars to euro and vice versa

    public static void main(String[] args)
    {
        int userSelect;
        double amount;
        Scanner input = new Scanner(System.in);

        System.out.println("What currency to convert?");
        System.out.println("1. US dollars to Euros");
        System.out.println("2. Euros to US dollars");


        userSelect = input.nextInt();


        System.out.println("Enter the amount : ");
        amount = input.nextDouble(); //variable to store amount


        Amount converted = new Amount(amount);
        if(userSelect == 1) {
            System.out.println("CONVERTED: " +converted.getConvertedDollar());
        }else if(userSelect == 2){
            System.out.println("CONVERTED: " + converted.getConvertedEuro());
        } else {
            System.out.println("INVALID INPUT");
        }

    }

}

abstract class Currency {

    private double currency;

    public Currency(double currency) {
        this.currency = currency;
    }
    //get and set the currency
    public double getCurrency() {
        return currency;
    }
    public void setCurrency(double currency) {
        this.currency = currency;
    }

}

class Amount extends Currency{
    public Amount(double currency) {
        super(currency);
    }

    double getConvertedDollar() {
        return getCurrency() * 0.83;
    }
    double getConvertedEuro() {
        return getCurrency() * 1.21;
    }
}

