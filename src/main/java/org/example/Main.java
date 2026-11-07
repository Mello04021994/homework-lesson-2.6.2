package org.example;

public class Main {

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Волченков", "+375336330133");
        directory.add("Горин", "+375445238275");
        directory.add("Волченков", "+375294445566");

        System.out.println("Телефон Волченков - " + directory.get("Волченков"));
        System.out.println("Телефон Горин - " + directory.get("Горин"));
    }

}