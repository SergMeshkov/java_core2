package ru.geekbrains.java2.homeworks.homeworks3;

import java.util.*;

public class Phonebook {
    private HashMap<String, List<Long>> phoneNumber;

    public Phonebook() {
        this.phoneNumber = new HashMap<String, List<Long>>();
    }

    public void add(String s, Long l) {
        List<Long> num = new ArrayList<>();

        if (this.phoneNumber.containsKey(s)){
            num = this.phoneNumber.get(s);
            num.add(l);
            this.phoneNumber.put(s, num);
        }
        else {
            num.add(l);
            this.phoneNumber.put(s, num);
        }
    }

    public String get(String s){
        String res = "";

        if (this.phoneNumber.containsKey(s)) {
            res = "Телефон " + s + ": " +
                    this.phoneNumber.get(s).toString()
                            .replace("[","")
                            .replace("]", "")
                            .replace(",", "")
                            .trim();
        } else {
            res = "В телефонном справочнике нет такой фамилии";
        }
        return res;
    }

}
