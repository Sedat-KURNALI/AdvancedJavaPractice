package TECHNOSTUDY_ISMETBY.Gun38.NonAccessModifiers.StaticModifiers;

public class Student {
    int id;
    String name;
    String surname;

    static int ogrencisayisi = 0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ogrencisayisi++;
        this.id = ogrencisayisi;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

