package Home.GOD;

import java.io.*;

public class Main {

    public static void main(String[] args) {


        GameName gameName;
        gameName = GameName.takeBFG;
        System.out.println("Игра: " + gameName);

        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in))) {

            // чтение с консоли
            while(!(br.readLine()).equals("exit")) {

                System.out.println("Ввод с консоли: " + br.toString());
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

	/*
	            String text;
            while(!(text=br.readLine()).equals("ESC")){

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

	1 MetaGame
	    4 name players
	    4 ListGame
	        ListNameGame
	        Flag played
	        Game bj
	            name
	            Tricks
	    4 Score

	4 players
	4 places in table
	14 games for 1 player:

    Main menu
        Game menu
            Set players
            Set chain players
            Game loop
                Game info menu
                Set game
                Set brides
            Save menu
        Load menu
        Score menu
    exit menu

	 */

    }
}

enum GameName {
    takeTricks,
    takeBoys,
    takeGirls,
    takeHearts,
    takeKing,
    takeLastTwo,
    takeBFG,
    donottakeTricks,
    donottakeBoys,
    donottakeGirls,
    donottakeHearts,
    donottakeKing,
    donottakeLastTwo,
    donottakeBFG
};