import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='c')
                count++;
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        // REPLACE WITH YOUR CODE
        return str.toLowerCase().contains("the");
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String palinstr = "";
        for(int i = str.length()-1;i>=0;i--){
            palinstr += str.charAt(i);
        }
        return palinstr.equals(str);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me one word and I'll check how many a's, b's, and c's it has!");
        String abcs = scan.nextLine();
        System.out.println("It has "+countABC(abcs)+" a's, b's, and c's.");
        System.out.println("Give me a string and I'll check if there's a 'the'!");
        String hasthe = scan.nextLine();
        System.out.println("It is "+containsThe(hasthe)+" that there is a 'the' in this statement.");
        System.out.println("Give me a word and I will check if it is a palindrome!");
        String palin = scan.nextLine();
        System.out.println("It is "+ isPalindrome(palin)+" that this word is a palindrome.");
    }
}
