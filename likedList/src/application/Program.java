package application;

import entities.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println(list.getSize());
        list.add("AC");
        System.out.println("Size: " + list.get(1));

    }
}
