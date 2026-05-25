package GFG100;
import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialOfLargeNumber {

    public static ArrayList<Integer> factorial(int n) {

        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String str = fact.toString();

        ArrayList<Integer> result = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            result.add(ch - '0');
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 10;

        ArrayList<Integer> ans = factorial(n);

        System.out.println(ans);
    }
}