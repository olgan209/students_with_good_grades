import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String surname = info[0];
            String name = info[1];
            int math = Integer.parseInt(info[2]);
            int phi = Integer.parseInt(info[3]);
            int inform = Integer.parseInt(info[4]);

            Student student = new Student(surname, name, math, phi, inform);

        }
    }
}
//    Выведите фамилии и имена учащихся, не имеющих троек (а также двоек и колов).
//
//        Входные данные
//        Заданы сначала количество учащихся n, затем n строк, каждая из которых содержит
//        фамилию, имя и три числа (оценки по трем предметам: математике, физике, информатике).
//        Данные в строке разделены одним пробелом. Оценки принимают значение от 1 до 5.
//
//        Выходные данные
//        Необходимо вывести пары фамилия-имя по одной на строке, разделяя фамилию и имя одним
//        пробелом. Выводить оценки не нужно. Порядок вывода должен быть таким же, как в исходных данных.
//
//        Примеры
//        входные данные
//        3
//        Babat Anna 5 4 3
//        Belova Galina 4 3 5
//        Moroz Yaroslav 3 5 4