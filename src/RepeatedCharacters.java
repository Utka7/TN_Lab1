import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the line");
        String str = scanner.nextLine().toLowerCase();
        char[] charStr = str.toCharArray();
        Set <Character> repetedChar = getSetRepeatCharInString(str);

        System.out.println("Repeated characters:");
        for (char c : repetedChar){
            System.out.println(c);
        }

    }

    public static Set <Character> getSetRepeatCharInString(String str){

        char[] charStr = str.toLowerCase().toCharArray();
        Set <Character> repetedChar = new HashSet<>();

        for (int i = 0; i < charStr.length; i++){
            for (int j = i + 1; j < charStr.length; j++){
                if (charStr[i] == charStr[j]){
                    repetedChar.add(charStr[i]);
                }
            }
        }
        return repetedChar;
    }
}
