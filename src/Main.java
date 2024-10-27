public class Main {
    public static void main(String[] args) {
        GryffindorStudents gryffindor1 = new GryffindorStudents(5,55,"Гарри Поттер", 55, 45, 11);
        GryffindorStudents gryffindor2 = new GryffindorStudents(2,45,"Гермиона Грейнджер", 11, 55, 7);
        GryffindorStudents gryffindor3 = new GryffindorStudents(52,88,"Рон Уизли", 89, 1, 69);
        HufflepuffStudents hufflepuff1 = new HufflepuffStudents(58,45,"Седрик Диггори", 11, 10, 65);
        HufflepuffStudents hufflepuff2 = new HufflepuffStudents(77,48,"Захария Смит", 63, 19, 89);
        HufflepuffStudents hufflepuff3 = new HufflepuffStudents(15,77,"Джастин Финч-Флетчли", 77, 10, 19);
        RavenclawStudents ravenclaw1 = new RavenclawStudents(57,22,"Чжоу Чанг", 10, 19, 96, 55);
        RavenclawStudents ravenclaw2 = new RavenclawStudents(52,88,"Падма Патил", 11, 1, 69,4);
        RavenclawStudents ravenclaw3 = new RavenclawStudents(12,8,"Маркус Белби", 71, 12, 49,66);
        SlytherinStudents slytherin1 = new SlytherinStudents(52,88,"Драко Малфой", 11, 1, 69,55,99);
        SlytherinStudents slytherin2 = new SlytherinStudents(2,8,"Грэхэм Монтегю", 77, 44, 66,12,58);
        SlytherinStudents slytherin3 = new SlytherinStudents(52,88,"Грегори Гойл", 11, 1, 69,77,18);


        Hogwarts hogwarts = new Hogwarts();
        hogwarts.compare(gryffindor1, gryffindor2);
        Hogwarts hogwarts1 = new Hogwarts();
        hogwarts.compare(hufflepuff1, hufflepuff2);
        Hogwarts hogwarts2 = new Hogwarts();
        hogwarts.compare(ravenclaw1, ravenclaw2);
        Hogwarts hogwarts3 = new Hogwarts();
        hogwarts.compare(slytherin2, slytherin3);
        Hogwarts hogwarts4 = new Hogwarts();
        hogwarts.compare(slytherin2, hufflepuff2);

    }
}