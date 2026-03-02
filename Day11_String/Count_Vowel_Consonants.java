package Day11_String;

public class Count_Vowel_Consonants {
    public static void main(String[] args) {
        String str = "aeiou";
        CountVowelConsonants(str);
    }
    public static void CountVowelConsonants(String str){
        int CountVowel =0;
        int CountConsonants =0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    CountVowel++;
                    }
                    else{
                        CountConsonants++;
                    }
            }
        }
        System.out.println("Count of Vowel : " + CountVowel + " and "+ "Count of Consonants : "+CountConsonants);


    }
}
