import java.util.*;
public class IncomeEg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        if(Income < 500000)
        {
            System.out.println("0% tax");
        }
        else if(Income>=500000 && Income<1000000)
        {
            System.out.println("20% tax");
        }
        else
        {
            System.out.println("30% tax");
        }

    }
}