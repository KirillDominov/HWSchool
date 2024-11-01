
public class SlytherinStudents extends HogwartsStudents {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourceFulness;
    private final int aThirstForPower;

    public SlytherinStudents(int magicPower, int transgressionDistance, java.lang.String name, int cunning, int determination, int ambition, int resourceFulness, int aThirstForPower) {
        super(magicPower, transgressionDistance, name);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceFulness = resourceFulness;
        this.aThirstForPower = aThirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourceFulness() {
        return resourceFulness;
    }

    public int getaThirstForPower() {
        return aThirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name=" + getName() +
                ",magicPower=" + getMagicPower() +
                ",transgressionDistance=" + getTransgressionDistance() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourceFulness=" + resourceFulness +
                ", aThirstForPower=" + aThirstForPower +
                '}';
    }
}