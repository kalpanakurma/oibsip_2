import java.util.Scanner;
import java.util.Random; 
public class NumberGuessing
{
    public static void guessIt()
    {
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        int number =rand.nextInt(100);
        int l = 5;
        int i, g;
System.out.println("A number is Generated"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials and Win the Game");
        for (i = 0;i< l;i++) 
        {
            System.out.println("Guess the number:"); 
            g = sc.nextInt(); 
            if (number == g)
            {
                System.out.println("Congratulations You Won !!!"+ " You guessed the number.");
                break;
            }
            else if(number > g && i != l - 1)
            {
                System.out.println("The number is "+ "greater than " + g);
            }
            else if (number < g && i != l - 1) 
            {
                System.out.println("The number is"+ " less than " + g);
            }
        } 
        if (i == l)
        {
            System.out.println("You have exhausted"+ " 5 trials "+ "Betterluck next time.");
            System.out.println("The number was " + number);
        }
    }
    public static void main(String arg[])
    {
        guessIt();
    }
}

