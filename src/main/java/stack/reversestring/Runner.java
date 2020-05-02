package stack.reversestring;

import java.util.Stack;

public class Runner {

    public static void main(String[] args) {
        System.out.println(reverseStringWithPointers("Hello World"));
        System.out.println(reverseStringWithLoop("Hello World"));
        System.out.println(reverseStringWithStack("Hello World"));
    }


    private static String reverseStringWithStack(String text){
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < text.length(); i++){
            stack.push(text.charAt(i));
        }

        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }

        return builder.toString();
    }

    private static String reverseStringWithLoop(String text){
        StringBuilder builder = new StringBuilder();

        for(int i = text.length() - 1; i >= 0; i--){
            builder.append(text.charAt(i));
        }

        return builder.toString();
    }

    private static String reverseStringWithPointers(String text){
        StringBuilder builder = new StringBuilder(text);
        int left = 0;
        int right = builder.toString().length() - 1;

        while(left < right){
            char temp = builder.charAt(left);
            builder.setCharAt(left, builder.charAt(right));
            builder.setCharAt(right, temp);

            left++;
            right--;
        }


        return builder.toString();
    }

}
