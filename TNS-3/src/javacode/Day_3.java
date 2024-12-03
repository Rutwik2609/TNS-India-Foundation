package javacode;

import java.util.Scanner;

public class Day_3 {

    public static class Person {

        // Data members
        private String name;
        private int income;
        private String gender;
        private int age;
        private int tax;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIncome() {
            return income;
        }

        public void setIncome(int income) {
            this.income = income;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getTax() {
            return tax;
        }

        public void setTax(int tax) {
            this.tax = tax;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Income: " + income + ", Tax: " + tax;
        }
    }

    public static class Taxcalculation {
        public void calculateTax(Person person) {
            if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
                person.setTax(0);
                System.out.println("Tax not applicable.");
            } else {
                if (person.getIncome() <= 160000) {
                    person.setTax(0);
                } else if (person.getIncome() > 160000 && person.getIncome() < 500000) {
                    person.setTax((person.getIncome() - 160000) * 10 / 100);
                } else if (person.getIncome() > 500000 && person.getIncome() < 800000) {
                    person.setTax((person.getIncome() - 500000) * 20 / 100 + 34000);
                } else {
                    person.setTax((person.getIncome() - 800000) * 30 / 100 + 94000);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter person name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter gender: ");
        String gender = sc.next();
        
        System.out.println("Enter income: ");
        int income = sc.nextInt();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        Taxcalculation taxcalculation = new Taxcalculation();
        taxcalculation.calculateTax(person);

        System.out.println(person);
        
        sc.close();
    }
}
