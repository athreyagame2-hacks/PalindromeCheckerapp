public class Palindromecheckerapp {
    public static void main(String[] args){
        String input = "level";

        long start = System.nanoTime();

        boolean isPalindrome = true;
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        long end = System.nanoTime();
        long time = end - start;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + time + " ns");

    }
}