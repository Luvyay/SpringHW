package Seminar1;

import Seminar1.Core.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrey", "Popov", 25);
        System.out.println(person);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String personGson = gson.toJson(person);
        System.out.println("----------------");
        System.out.println(personGson);

        Person personFromGson = gson.fromJson(personGson, Person.class);
        System.out.println("----------------");
        System.out.println(personFromGson);
    }
}
