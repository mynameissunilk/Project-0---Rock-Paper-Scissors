import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**-Main menu with options to enter play or history
 * -Handle invalid user input
 * -Use arrays or arraylists to store game history
 * -Handle incorrect capitalization
 * -Store history across sessions
 ****/

public class Main {

    public static void main(String[] args){

        /** Scanner **/
        Scanner playerInput = new Scanner(System.in);


        /** Send Scanner to mainMenu **/
        mainMenu(playerInput);

    }

    public static void mainMenu(Scanner s){
        boolean typo = false;
        String welcMsg = "****************\n*Welcome to RPS*\n****************\n==>Please Type 'Play' or 'History";
        String typoMsg = "Please Try Again:\nEnter 'Play' or 'History'";

        /** Menu Graphics **/
        System.out.println(welcMsg);

        /** Start Scanner **/
        String input = s.nextLine();

        if(input.equalsIgnoreCase("Play") || input.equalsIgnoreCase("History")){
            gameStart(s);
        }
        else {
            System.out.println(typoMsg);
            typo = true;
        }

        s.nextLine();

        while(typo) {
            System.out.println("Please Enter 'Play' or 'History': ");
            if(input.equalsIgnoreCase("Play") || input.equalsIgnoreCase("History"))
                typo = false;
        }
    }
}

    public static void gameStart(Scanner s){

        /** Prompt **/
        System.out.print("Choose Rock, Paper, or Scissors:\n********************************\n ");

        boolean input = true;
        String humanMove = s.nextLine();

        while(input){

            if(!humanMove.equalsIgnoreCase("Rock") || !humanMove.equalsIgnoreCase("Paper") || !humanMove.equalsIgnoreCase("Scissors"){
                System.out.println("Please re-enter: \nRock, Paper, or Scissors: "); */
            }
            if (humanMove == "Rock" || humanMove == "Paper" || humanMove == "Scissors")
                humanMove = s.nextLine();
                input = false;

                    }
        /*}
        System.out.println(humanMove);

        /** Computer Plays its Hand **/
        Random cpuPlayer = new Random();
        String cpuMove = "";
        int comp = cpuPlayer.nextInt(3);

        switch(comp){
            case 0:
                cpuMove="Rock";
                break;

            case 1:
                cpuMove="Paper";
                break;

            case 2:
                cpuMove="Scissors";
                break;
        }
    }

    public static void gameHist() {
        ArrayList<String> gameLog = new ArrayList<>(); // push all output to this ArrayList...}
    }



/*    public static void checkSpell(Scanner s, String wrong, String right){
        boolean spelling = false; //only called with typos...
        String typoMsgMain = "Please Try Again: ";

        if(!wrong.equals(right))
            System.out.println(typoMsg);

    }*/

