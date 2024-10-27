public class HufflepuffStudents extends HogwartsStudents {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public HufflepuffStudents(int magicPower, int transgressionDistance, java.lang.String name, int hardworking, int loyal, int honest) {
        super(magicPower, transgressionDistance, name);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return getName();
    }
}
