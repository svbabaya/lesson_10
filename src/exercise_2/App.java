/*
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/
package exercise_2;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");

//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList.add(i + 1, "именно");
//            i++;
//        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).equals("именно")) arrayList.add(i + 1, "именно");
        }

        for (String s : arrayList) System.out.println(s);
    }
}
