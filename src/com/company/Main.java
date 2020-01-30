package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<Cat> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i, new Cat("ads",3));
        }
        for (int i = arrayList.size()/2; i <(arrayList.size()/2)+98; i++) {
            arrayList.add(i,new Dog(13,"reks"));
        }
        for (int i = 0; i <arrayList.size(); i++) {
            System.out.println(arrayList.get(i)+"=="+i);
        }
//2 List
        arrayList.add("во время экзамена я забыл как создать массив ");
        arrayList.add("нельзя удленнять массив,при удалении элемента обр. дырка,");
        arrayList.add("Обладает свойствами интерфейсов");
        arrayList.add("ArrayList - это список на основе массива. " +
                "LinkedList - связанный список на основе элементов и связи между ними.");

        arrayList.add("");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));


//      1

    }
}
