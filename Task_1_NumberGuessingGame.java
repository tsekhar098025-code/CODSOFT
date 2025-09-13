import java.util.*;
import java.util.Random;
class Task_1_NumberGuessingGame{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random randomNum =new  Random();
        int num =randomNum.nextInt(1,101);
        int c=0;
        int attempts = 0;
        boolean playAgain = true;
         System.out.println(" ! Welcome to number guessing Game !\n");
        while(playAgain){
             System.out.println("->simple info about this game :\n The number Range is 1 to 100.\n And you have 10 attempts.\n ");
            for(int i=1;i<=10;i++){
                    System.out.print("Enter your guess : ");
                    int userNum=sc.nextInt();
                    if(num==userNum){
                        System.out.println("Your guess is correct.");
                        c++;
                        break;
                    }else if(userNum<num){
                        System.out.println("your guess is too low! Try again.");
                    }else{
                        System.out.println("your guess is too high! try again.");
                    }
                    attempts++;
            }
                if(c==0){
                    System.out.println("Sorry you have used all your attempts. the correct number was :" + num);
                }else{
                    System.out.println("your final score is :"+(100-(attempts*10))+" points.\n");
                }
                
            System.out.println("will you try again :(y/n) :");
            char ch = sc.next().charAt(0);
            if(ch=='y'){
                playAgain = true;
            }else{
                playAgain = false;
            }
        }
        System.out.println("Thank you for playing!");
    }
}