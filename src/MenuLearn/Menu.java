package MenuLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Теперь нужен только какой-нибудь контейнер, который будет в хранить все пункты меню и выводить их в бесконечном цикле.
// Этим будет заниматься класс Menu.
// В качестве дополнения, он будет автоматически создавать пункт меню Exit и добавлять его в конец списка.

/*
public class Menu {
    private List entries = new ArrayList();
    private boolean isExit = false;

    // Конструктор
    public Menu() {
        // Добавляем пункт меню Exit
        entries.add(new MenuEntry("Exit") {
            @Override
            public void run() {
                isExit = true;
            }
        });
    }

    public void addEntry (Menu menu) {

    }

    public void run() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Бесконечный цикл, пока не нажали кнопку выход
        while (!isExit) {
            printMenu();
            try {
                String line = reader.readLine();
                int choice = Integer.parseInt(line);
                // Выбираем нажатый пункт меню и выполняем его код
                MenuEntry entry = entries.get(choice - 1);
                entry.run();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

 */