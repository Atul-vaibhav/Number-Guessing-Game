import java.util.*;

public class guess {
    
    public static void instructions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("             Instructions            ");
        System.out.println("1. You Will be asked to enter a Number between 1-50.\n2.You will be asked to Enter Your Number");
        System.out.println("3.A hint will be provided after wrong guess.\n");
        System.out.print("Enter your Name - ");
        String name = sc.nextLine();
        System.out.println("                   Welcome to the game "+name+"\n");
    }
    public static void playgame(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numbertoguess = random.nextInt(50)+1;
        int noofguess = 0;
        int maxguess = 5;
        boolean guessedcorrect = false;

        while(noofguess<maxguess){
            System.out.print("Enter Your Guess - ");
            int guess = sc.nextInt();
            noofguess++;
            if(numbertoguess==guess){
                System.out.println("Yes!! You guessed it correctly !!!!");
                guessedcorrect=true;
                break;
            }else if(guess<numbertoguess){
                System.out.println("The Number is higher than "+guess);
            }else{
                System.out.println("The Number is lesser than "+guess);
            }
            System.out.println("You have used "+noofguess+" guess");

        }
        if(!guessedcorrect){
            System.out.println("Sorry!! You have used all your chances.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Read Instructions.");
        System.out.println("2.Play Game.");
        System.out.println("3.Exit");
        System.out.print("Enter Your Choice - ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                instructions();
            case 2:
                playgame();
                break;
            case 3:
                System.out.println();
                break;
        }
    }
}
