package tpe.fruh_razzaq_jando.pue2;

public abstract class Unternehmen {
    private String name;
    private int gewinn;

    protected Unternehmen(String name, int gewinn) {
        this.name = name;
        this.gewinn = gewinn;
    }

    public String getName() {
        return name;
    }

    public int getGewinn() {
        return gewinn;
    }
}
