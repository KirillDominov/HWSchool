public class RavenclawStudents extends HogwartsStudents {
    private final int smart;
    private final int wiseint;
    private final int witty;
    private final int fullOfCreativity;

    public RavenclawStudents(int magicPower, int transgressionDistance, java.lang.String name, int smart, int wiseint, int witty, int fullOfCreativity) {
        super(magicPower, transgressionDistance, name);
        this.smart = smart;
        this.wiseint = wiseint;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWiseint() {
        return wiseint;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return getName();
    }
}
