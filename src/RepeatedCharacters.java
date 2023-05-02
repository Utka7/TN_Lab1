import java.util.*;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the line");
        String str = scanner.nextLine().toLowerCase();
        char[] charStr = str.toCharArray();
        Map<Character,Integer> repeatedChars = getSetRepeatCharInString(str);
        Set<Character> keys = repeatedChars.keySet();


        for (char c : keys){
            System.out.println(c + " " + repeatedChars.get(c));
        }
    }

    public static Map<Character,Integer> getSetRepeatCharInString(String str) {
        Map<Character,Integer> repeatedChars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    char c = str.charAt(i);
                    if (!repeatedChars.containsKey(c)){
                        repeatedChars.put(c,2);
                    }
                    else {
                        int count = repeatedChars.get(c);
                        repeatedChars.put(c,count + 1);
                    }
                }
            }
        }

        return repeatedChars;
    }
}
