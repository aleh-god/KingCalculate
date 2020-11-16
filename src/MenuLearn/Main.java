package MenuLearn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Menu menu = new Menu();
        menu.addEntry(new MenuEntry("test1") {
        @Override
        public void run() {
            System.out.println("test1 run");
        }
        });

        menu.addEntry(new MenuEntry("test2") {
        @Override
        public void run() {
            System.out.println("test2 run");
        }
        });
        menu.run();
         */
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
 */