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
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";

        while (!"4".equals(s)){
            System.out.println("1. Для создания массива из нечетных числе введите 1");
            System.out.println("2. Для создания массива из чисел Фибоначчи введите 2");
            System.out.println("3. Для создания двумерного массива введите 3");
            System.out.println("4. Для выхода из приложения введите 4");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }

            switch (x){
                case 1:
                    // вызов метода 1
                    break;
                case 2:
                    // вызов метода 2
                    break;
                case 3:
                    // вызов метода 3
            }
        }
        System.out.println("До свидания!");
    }
}
/*
   private void startPO() {
        boolean exit = false;
        while (!exit) {
            programMenu();
            int menuinput = sc.nextInt();
            if (menuinput == 1) {
               //действие1
            } else if (menuinput == 2) {
                //действие2
            } else if (menuinput == 3) {
                //действие3
            } else if (menuinput == 4) {
                //действие3
            } else if (menuinput == 5) {
                exit = true;
            }
        }
    }



    private void programMenu() {
        System.out.println(
                "Выберете пункт меню:" + "\n"
                        + "1. блаблабла" + "\n"
                        + "2. бла бла" + "\n"
                        + "3. блаблаблабла" + "\n"
                        + "4. блабла" + "\n"
                        + "5. exit" + "\n"

        );
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