import java.util.Scanner;

public class market
{
    public static void main(String[] args)
    {
        Scanner buy = new Scanner(System.in);

        System.out.println("Hello sir/madam, What do you want to buy?");
        System.out.print("I want: "); 
        String item = buy.nextLine();

        System.out.print("How much kg you want? ");
        int quantity = buy.nextInt();

        System.out.println("Here is your bag of " + quantity + " kg of " + item + ". Thanks for coming!");

        buy.close();
    }
}
