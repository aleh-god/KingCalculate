package Home.GOD;

import java.io.*;

public class Main {

    public static void main(String[] args) {


        GameName gameName;
        String textInputConsole;

        // Запускаем главное меню.
        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in))) {

            System.out.println("Добрый день. Вы находитесь в калькуляторе игры Кинг.");
            System.out.println("1. Для рассчета игры наберите в строке: 1");
            System.out.println("2. Для загрузки сохраненной игры наберите в строке: 2");
            System.out.println("3. Для просмотра игровых рекордов наберите в строке: 3");
            System.out.println("Для выхода наберите в строке: exit");
            // чтение с консоли
            while(!(br.readLine()).equals("exit")) {
                System.out.println("Ввод с консоли: " + br.toString() );

                //if (br.toString() == "1") {}
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Спасибо за игру. До новых встреч.");

	/*
        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in))) {

            // чтение с консоли
            System.out.println("Меню запущено. Для выхода наберите в строке: exit");
            while(!(br.readLine()).equals("exit")) {

                System.out.println("Ввод с консоли: " + br.toString());
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