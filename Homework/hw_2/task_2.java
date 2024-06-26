// Деление элементов массива на число

// Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
// Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
// Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.

// На входе:
// '1 2 3 4 5 6 7 8 9'
// '1'
// На выходе:
// intArray[8] / d = 9 / 1 = 9.0
// 9.0
// После запуска программы, если не переданы аргументы командной строки, 
// то intArray будет {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} и d будет равно 0. 
// В этом случае результат выражения intArray[8] / d будет бесконечность (так как деление на 0).

// Таким образом, программа выведет сообщение:

// It's not possible to evaluate the expression - intArray[8] / d as d = 0.
// NaN

package Homework.hw_2;

// // Автотест

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {
        if (intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        } else if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        } else {
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + catchedRes1);
            return catchedRes1;
        }
    }
}

public class task_2 {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            d = 0; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}

// 2

// import java.util.Arrays;

// class Expr {

//     public static double expr(int[] intArray, int d) {
//         if (intArray.length < 9) {
//             System.out.println(
//                     "It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
//             return Double.NaN;
//         }
//         if (d == 0) {
//             System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
//             return Double.NaN;
//         }
//         System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + (double) intArray[8] / d);
//         return (double) intArray[8] / d;
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

// public class task_2 {
//     public static void main(String[] args) {
//         int[] intArray;
//         int d;

//         if (args.length == 0) {
//             intArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//             d = 0; // По умолчанию используем 0, если аргумент не передан
//         } else {
//             intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
//             d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
//         }

//         double result = Expr.expr(intArray, d);
//         System.out.println(result);
//     }
// }