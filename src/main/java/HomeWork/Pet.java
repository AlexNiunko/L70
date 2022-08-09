package HomeWork;

import java.util.ArrayList;
import java.util.ListIterator;

public class Pet {
    public String kind;
    public int age;
    public String colour;
    public String name;

    public Pet(String kind, int age, String colour, String name) {
        this.setKind(kind);
        this.age = age;
        this.colour = colour;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "вид питомца-" + getKind() + '\'' +
                ", возраст=" + age +
                ", цвет='" + colour + '\'' +
                ", имя='" + name + '\'' +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }
    public static double AverageAge(ArrayList<Pet> list){
        double sum=0;
        ListIterator<Pet>iterator=list.listIterator();
        while (iterator.hasNext()){
            Pet pet= iterator.next();
            sum+= pet.age;
        }
        return sum/ list.size();
    }




}
