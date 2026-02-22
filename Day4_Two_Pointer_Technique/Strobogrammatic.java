package Day4_Two_Pointer_Technique;

import java.util.*;

public class Strobogrammatic {

    public static boolean IsStrobogrammatic(Map<Character, Character> map, String st) {

        int i = 0;
        int j = st.length() - 1;

        while (i <= j) {

            char l = st.charAt(i);
            char r = st.charAt(j);

            // agar left character map me nahi hai
            if (!map.containsKey(l)) {
                return false;
            }

            // agar mapping match nahi kar rahi
            if (map.get(l) != r) {
                return false;
            }

            // pointer move karo
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String st = "119511";

        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');

        if (IsStrobogrammatic(map, st)) {
            System.out.println("Strobogrammatic number");
        } else {
            System.out.println("Not Strobogrammatic number");
        }
    }
}