package learnJava;

public class SecondProgram 
{
    public static void main(String[] arg)
    {
        int cost=90;
        char gender='a';
        double discountPercent=0;
        if(gender=='M' || gender=='m')
        {
             discountPercent=5;
        }
        if(gender=='F' || gender=='f')
        {
             discountPercent=6;
        }
        double netPrice=cost*(1-discountPercent/100.0);
        System.out.println(netPrice);    
    }
}