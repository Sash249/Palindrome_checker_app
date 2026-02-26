public class palindromechecker {

    static void main(String[] args) {
        String input = "level";
        String reversed = "";
        for (int i = input.length()-1;i>=0;i--){
            reversed = reversed + input.charAt(i);
        }
        System.out.println("Original String:"+input);
        System.out.println("Reversed String:"+reversed);
        if(input.equals(reversed)) {
            System.out.println("Result:The string is a palindrome.");
        }
        else {
            System.out.println("Result:the string is NOT a palindrome.");
        }
    }
}


