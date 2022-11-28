/*
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой строки.
*/

package exercise_4;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 10 слов:");
        for (int i = 0; i < 10; i++) arrayList.add(scan.nextLine());

        arrayList = doubleValues(arrayList);

        for (String s : arrayList) System.out.println(s);
    }
    static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, list.get(i));
            i++;
        }
        return list;
    }
}
