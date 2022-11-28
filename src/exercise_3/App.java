/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
    2.1. удалять из списка строк все слова, содержащие букву "р"
    2.2. удваивать все слова содержащие букву "л".
    2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
    2.4. с другими словами ничего не делать.

public static void main(String[] args) {
       ArrayList<String> strings = new ArrayList<String>();
       strings.add("роза");
       strings.add("лоза");
       strings.add("лира");
       strings = fix(strings);

       for (String string : strings) {
           System.out.println(string);
       }
   }

   public static ArrayList<String> fix(ArrayList<String> strings) {
       //напишите тут ваш код
       return null;
   }
*/

package exercise_3;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("моно");
        strings.add("рыба");
        strings.add("ралли");
        strings.add("лето");

        strings = fix(strings);

        for (String string : strings) System.out.println(string);
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) strings.remove(i);
            if (strings.get(i).contains("л") && !strings.get(i).contains("р")) strings.set(i, strings.get(i).repeat(2));
        }
        return strings;
    }
}
