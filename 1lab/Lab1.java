import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение:");
        String message = scanner.nextLine();
        String newMassage=new String("");
        // Удаляем пробелы и знаки препинания
        message = message.replaceAll("[^\\p{L}]", ""); // \\p{L} выбирает все буквенные символы

        int n = (int) Math.ceil(Math.sqrt(message.length())); // Размер таблицы (кол-во строк и столбцов)
        char[][] table = new char[n][n];

        // Заполняем таблицу
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (index < message.length()) {
                    table[i][j] = message.charAt(index++);
                } else {
                    table[i][j] = ' '; // Заполняем оставшиеся ячейки пробелами
                }
            }
        }

        // Выводим таблицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("********************************************************************");
        // Шифрованный
        for (int  j= 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                newMassage=newMassage+table[i][j];
                System.out.print(table[i][j] + " ");
            }
            newMassage=newMassage+" ";
            System.out.println();
        }
        System.out.println(newMassage);
    }
}
