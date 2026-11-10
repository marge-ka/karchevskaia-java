package org.example;

public class Calculator {
    private final int firstNumber;
    private final int secondNumber;

    public Calculator(int a, int b) {
        this.firstNumber = a;
        this.secondNumber = b;
    }

    //- сложение двух чисел;
    public int add() {
        return firstNumber + secondNumber;
    }

    //- вычитание второго числа из первого;
    public int subtract() {
        return firstNumber - secondNumber;
    }

    //- умножение двух чисел;
    public int multiply() {
        return firstNumber * secondNumber;
    }

    //- деление первого числа на второе.
    public Double divide() throws DivisionByZeroException {
        if (secondNumber == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        } else {
            return (double) firstNumber / secondNumber;
        }
    }
}

