public class GryffindorStudents extends HogwartsStudents {
    private final int nobility;
    private final int honor;
    private final int courage;


    public GryffindorStudents(int magicPower, int transgressionDistance, java.lang.String name, int nobility, int honor, int courage) {
        super(magicPower, transgressionDistance, name);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return getName();
    }
}
