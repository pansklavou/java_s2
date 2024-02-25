package hangman_game;

import java.util.Scanner;




public class Game {
    public static void main(String[] args){
       User user;
       Hangman hangman=new Hangman();

       Scanner input = new Scanner(System.in);
        System.out.print("Give your name: ");
        String name = input.next();
        user= new User(name);


        do { hangman.newGame();


            do {

                System.out.println(hangman.getSecretWord());
                System.out.println("Give a letter: ");
                String guess = input.next();
                hangman.play(guess);
                System.out.println(hangman.getSecretWord());
                if (hangman.isFound()) {
                    System.out.println("Found :) ");
                    user.found();
                    break;
                } else if (hangman.isHanged()) {
                    System.out.println("Hanged :(");
                    user.hanged();
                    break;
                }
            } while (true);
            System.out.println("Play again?(y/n)");
            String answer = input.next();
            if (answer.equals("n")) {
                break;
            }

        }while (true) ;

    System.out.println(user.getFinalScore());

    }

}
