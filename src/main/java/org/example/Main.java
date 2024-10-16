package org.example;

import com.google.common.base.Joiner;
import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "World"};
        String message = Joiner.on(", ").join(words);
        System.out.println(message);

        Person person = new Person("John", "Doe", 30);
        // Сериализация объекта в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json); // Вывод JSON представления объекта

        // Десериализация JSON в объект
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println(deserializedPerson); // Вывод объекта
    }

}