package studentenverwaltung;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Student {

    private Date geburtstag;
    private String name;
    private Geschlecht geschlecht;
    private List<Kurs> kurse = new LinkedList<Kurs>();


    Student(String name, Date geburtstag, Geschlecht geschlecht) {
        setGeburtstag(geburtstag);
        setName(name);
        setGeschlecht(geschlecht);
    }

    void addKurs(Kurs kurs) {
        this.kurse.add(kurs);
    }

    void removeKurs(Kurs kurs){
       this.kurse.remove(kurs);
    }

    void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    void setName(String name) {
        this.name = name;
    }

    void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }

    Date getGeburtstag() {
        return this.geburtstag;
    }

    String getName() {
        return this.name;
    }

    Geschlecht getGeschlecht() {
        return this.geschlecht;
    }

    String getKurse(){
        return kurse.toString();
    }

    int getAlter() {
        return new Date().getYear() - getGeburtstag().getYear() + 1900;
    }

    String getStundenplan(){
        return kurse.toString();
    }

}
