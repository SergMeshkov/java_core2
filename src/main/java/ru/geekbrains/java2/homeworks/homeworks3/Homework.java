package ru.geekbrains.java2.homeworks.homeworks3;

/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять
записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под
одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе
такой фамилии должны выводиться все телефоны.*/

import java.util.*;

public class Homework {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Pear", "Banana", "Orange",
                "Pineapple", "Apple", "Kiwi", "Peach", "Watermelon", "Apple",
                "Banana", "Pineapple", "Orange");
        Set<String> set = new HashSet<String>(words);
        System.out.println(set.toString());

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", 89246585646L);
        phonebook.add("Petrov", 2287466L);
        phonebook.add("Sidorov", 123456789L);
        phonebook.add("Kulikov", 26416485L);
        phonebook.add("Petrov", 89545444121L);
        phonebook.add("Ivanov", 26548658L);
        phonebook.add("Kulikova", 89245668556L);
        phonebook.add("Meshkov", 88005654655L);

        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Meshkov"));
        System.out.println(phonebook.get("Sidorova"));


    }
}