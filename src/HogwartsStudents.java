public abstract class HogwartsStudents {
    private final int magicPower;
    private final int transgressionDistance;
    private final String name;

    public HogwartsStudents(int magicPower, int transgressionDistance, java.lang.String name) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public java.lang.String getName() {
        return name;
    }
}
