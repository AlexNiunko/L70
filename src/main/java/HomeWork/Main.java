package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog", 5, "black", "Jack");
        Pet pet2 = new Pet("dog", 7, "white", "Tom");
        Pet pet3 = new Pet("dog", 10, "red", "Loo");
        Pet pet4 = new Pet("dog", 2, "gray", "flan");
        Pet pet5 = new Pet("cat", 5, "white", "Tom");
        Pet pet6 = new Pet("cat", 4, "black", "Louis");
        Pet pet7 = new Pet("cat", 7, "green", "Jori");
        Pet pet8 = new Pet("parrot", 9, "red", "Pirat");
        Pet pet9 = new Pet("parrot", 4, "purple", "Reaper");
        Pet pet10 = new Pet("parrot", 7, "blue", "Maks");

        ArrayList<Pet> list = new ArrayList<>();
        list.add(pet5);
        list.add(pet2);
        list.add(pet10);
        list.add(pet9);
        list.add(pet8);
        list.add(pet3);
        list.add(pet4);
        list.add(pet1);
        list.add(pet6);
        list.add(pet7);
        ArrayList<Pet> dogs = new ArrayList<>();
        ArrayList<Pet> cats = new ArrayList<>();
        ListIterator<Pet> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Pet element = listIterator.next();
            switch (element.kind){
                case "dog":
                    dogs.add(element);
                    break;
                case "cat":
                    cats.add(element);
                    break;
                case "parrot":
                    listIterator.remove();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        }
        for (Pet pet:cats){
            System.out.println(pet);
        }
        System.out.println();

        System.out.println(Pet.AverageAge(cats));
    }

}
