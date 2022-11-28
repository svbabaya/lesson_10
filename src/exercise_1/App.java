/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/
package exercise_1;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 5 строк:");

        for(int i = 0; i < 5; ++i) arrayList.add(scan.nextLine());

        arrayList.remove(2);

        for(int i = arrayList.size() - 1; i >= 0; --i) System.out.println((String)arrayList.get(i));

    }

}
