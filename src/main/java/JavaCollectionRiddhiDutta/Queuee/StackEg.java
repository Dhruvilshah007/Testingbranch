package JavaCollectionRiddhiDutta.Queuee;

import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {

        //stack is class and it extends vector which is from List
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }


    }
}
