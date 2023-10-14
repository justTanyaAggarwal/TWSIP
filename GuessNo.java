import java.util.*;
//import java.util.Random;

        // user-defined class
        class Game{
            public int number;
            public int input_no;
            public int no_of_guesses=0;

        // constructor that generates a random no.
            Game(){
                Random r = new Random();
                this.number=r.nextInt(100);
            }
         // method for taking no. from the player
            void TakeUserInput(){
                System.out.println("Guess the no. ");
                Scanner sc= new Scanner(System.in);
                input_no=sc.nextInt();
            }
            //method for calculating no. of guesses and tell the player how far he is from his goal
            boolean iscorrectnumber( ) {
                no_of_guesses++;
                if (input_no == number) {
                   // System.out.printf("yes !! you guessed it right.\nit is %d \n ~ you have taken %d attempts ", number, no_of_guesses);
                    System.out.printf("YES !! You Guessed it Right in %d ATTEMPTS. ", no_of_guesses);
                    return true ;
                }
                else if (input_no > number)
                    System.out.println("too high");
                else if (input_no < number)
                    System.out.println("too low");
                return false;
            }
        }
        //main class
        public class GuessNo{
            public static void main(String[] args) {
                Game g = new Game();
                boolean b=false;
                //loop that helps to take input from the player again and again until he is correct
                System.out.println("(Between 1-100)");
                while (!b) {
                    g.TakeUserInput();
                    b = g.iscorrectnumber();

                }
            }
            
        }

