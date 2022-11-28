/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

package exercise_5;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 10 строк:");
        for (int i = 0; i < 10; i++) arrayList.add(scan.nextLine());

        String min = arrayList.get(0);
        for (String s : arrayList) {
            if (s.length() >= min.length()) min = s;
            else {
                System.out.println("Нарушение порядка с индекса: " + arrayList.indexOf(s));
                break;
            }
        }
    }
}
