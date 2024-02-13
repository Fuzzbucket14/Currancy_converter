
import javax.money.*;



public class Main {

    public static void main(String[] args){
        CurrencyUnit usd = Monetary.getCurrency("USD");


        System.out.println(usd);

    }
}