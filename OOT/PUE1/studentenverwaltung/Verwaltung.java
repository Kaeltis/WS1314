package studentenverwaltung;

import java.util.Date;

public class Verwaltung {

    public static void main(String[] args) {
        Student student1 = new Student("Max Jando", new Date(1987, 8, 3), Geschlecht.Maennlich);
        Student student2 = new Student("Sieglinde Bürger", new Date(1980, 12, 7), Geschlecht.Weiblich);
        Kurs oot = new Kurs("OOT", "09:00", "12:00");
        Kurs tpe = new Kurs("TPE", "09:00", "12:00");
        student1.addKurs(oot);
        student1.addKurs(tpe);
        System.out.println(student1.getStundenplan());
        System.out.println(student2.getAlter());
    }
}
