package intro;
//Rock Paper Scissors Game
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class ex3_12_2 {
    public static void main(String[] args){
        String R;
        String P;
        String S;
        int pc_choice;
        String x = null;
        String player_choise;
        Random rnd=new Random();
        int pc_wins;
        int player_wins;
        int ties;
        int i;

        i=0;
        pc_wins=0;
        player_wins=0;
        ties=0;

        do {
            pc_choice=rnd.nextInt(3);
            System.out.println("Rock, Paper, Scissors...?");
            Scanner in= new Scanner(System.in);
            player_choise=in.next();
            if (pc_choice==0){
                x="R";}
            else if (pc_choice==1) {
                x="P";}
            else if (pc_choice==3) {
                x="S";}
            System.out.println(x);

            if (Objects.equals(player_choise, x)){
                System.out.println("Tie");
                ties=ties+1;}
            else if (Objects.equals(player_choise, "R") && Objects.equals(x, "S")){
                System.out.println("Rock beats Scissors! Player wins!");
                player_wins=player_wins+1;  }
            else if (Objects.equals(player_choise, "P") && Objects.equals(x, "R")) {
                System.out.println("Paper beats Rock! Player wins!");
                player_wins=player_wins+1;}
            else if (Objects.equals(player_choise, "S") && Objects.equals(x, "P")) {
                System.out.println("Scissors beats Paper! Player wins!");
                player_wins=player_wins+1;}
            else if (Objects.equals(x, "R") && Objects.equals(player_choise, "S")) {
                System.out.println("Rock beats Scissors! PC wins!");
                pc_wins=pc_wins+1;}
            else if (Objects.equals(x, "P") && Objects.equals(player_choise, "R")) {
                System.out.println("Paper beats Rock!PC wins!");
                pc_wins=pc_wins+1;}
            else if (Objects.equals(x, "S") && Objects.equals(player_choise, "P")) {
                System.out.println("Scissors beat Paper! PC wins!");
                pc_wins=pc_wins+1;}
            i=i+1;




        }while (i<20);
        System.out.println("The ties are: "+ties);
        System.out.println("Player wins are: "+player_wins);
        System.out.println("PC wins are: "+pc_wins);
        System.out.println(i);


    }

}
