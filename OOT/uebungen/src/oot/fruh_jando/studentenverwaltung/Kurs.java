package oot.fruh_jando.studentenverwaltung;


public class Kurs {
    private String name;
    private String beginn;
    private String ende;

   public Kurs(String name, String beginn, String ende) {
        setName(name);
        setBeginn(beginn);
        setEnde(ende);
    }

    void setName(String name){
        this.name = name;
    }

    void setBeginn(String beginn){
        this.beginn = beginn;
    }

    void setEnde(String ende){
        this.ende = ende;
    }

    String getName(){
        return this.name;
    }

    String getBeginn(){
        return this.beginn;
    }

    String getEnde(){
        return this.ende;
    }

    @Override
    public String toString() {
        return this.name + " - " + beginn + " bis " + ende;
    }
}
