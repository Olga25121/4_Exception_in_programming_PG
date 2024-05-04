// Деление

// Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
// При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
// Если b равен нулю, программа должна вернуть результат равный нулю.
// После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
// Если аргументы не переданы через командную строку, используйте значения по умолчанию.

// На входе:
// '12'
// '5'
// На выходе:
// 17
// 2.4


// // Автотест

package Homework.hw_2;

class Expr {

    public static double expr(int a, int b) {
        double result = 0.0; // Initialize the result
        if (b != 0) {
            result = (double) a / b; // Perform the division and store the result
        }
        printSum(a, b);
        return result; // Return the result
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

public class task_3 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 3; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } 

        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}

// 2
// class Expr {

//     public static double expr(int a, int b) {
//       printSum(a, b);
//       if (b == 0) return 0;
//       return (double) a / b;
//     }
//     public static void printSum(int a, int b) {
//         System.out.println(a + b);
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

// public class task_3 {
//     public static void main(String[] args) {
//         int a;
//         int b;

//         if (args.length == 0) {
//             a = 90;
//             b = 3; // Default values if no arguments are provided
//         } else {
//             a = Integer.parseInt(args[0]);
//             b = Integer.parseInt(args[1]);
//         } 

//         double result = Expr.expr(a, b);
//         System.out.println(result);
//     }
// }