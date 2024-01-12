//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hogwarts[] students = {
                new Gryffindor("Гарри", "Поттер", "Gryffindor", 40, 95, 100, 97, 100),
                new Gryffindor("Гермиона", "Грейнджер", "Gryffindor", 75, 98, 95, 100, 87),
                new Gryffindor("Рон", "Уизли", "Gryffindor", 20, 56, 84, 95, 92),
                new Hufflepuff("Захария", "Смит", "Hufflepuff", 25, 70, 87, 78, 94),
                new Hufflepuff("Седрик", "Диггори", "Hufflepuff", 42, 79, 90, 98, 100),
                new Hufflepuff("Джастин", "Финч-Флетчли", "Hufflepuff", 15, 57, 23, 100, 82),
                new Ravenclaw("Чжоу", "Чанг", "Ravenclaw", 17, 47, 78, 69, 54, 97),
                new Ravenclaw("Падма", "Патил", "Ravenclaw", 12, 75, 84, 75, 66, 92),
                new Ravenclaw("Маркус", "Белби", "Ravenclaw", 23, 52, 69, 78, 92, 59),
                new Slytherin("Драко", "Малфой", "Slytherin", 34, 92, 87, 56, 100, 81, 100),
                new Slytherin("Грэхэм", "Монтегю", "Slytherin", 12, 75, 56, 83, 89, 57, 77),
                new Slytherin("Грегори", "Гойл", "Slytherin", 29, 68, 64, 71, 84, 74, 86)
        };
        System.out.println(students[7]);

        ((Gryffindor) students[1]).compareTalents((Ravenclaw) students[7]);
        ((Gryffindor) students[0]).compareTalents((Gryffindor) students[2]);

    }
}
