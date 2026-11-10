package org.example;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator(5, 6);

        System.out.println(c.add() + " - сумма двух чисел");
        System.out.println(c.subtract() + " - результат вычитания второго числа из первого");
        System.out.println(c.multiply() + " - результат умножения двух чисел");

        try {
            System.out.println(String.format("%.2f", c.divide()) + " - результат деления первого числа на второе");
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
