package MenuLearn;

//    Основа меню - это абстрактный класс MenuEntry. У него есть единственное поле title, а также абстрактный метод run.

public abstract class MenuEntry {
    private String title;

    public MenuEntry(String title) {
        this.title = title;
    }

    public abstract void run();
}
