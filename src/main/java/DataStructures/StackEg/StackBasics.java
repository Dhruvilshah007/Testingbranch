package DataStructures.StackEg;

import java.util.Stack;

class StackBasics
{
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");

        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }


    public static void main (String[] args)
    {

        //here we can have only wrapper class and not int,float(primitive Datatypes) etcc...
        // Pushing element on the top of the stack

        Stack<Integer> stack = new Stack<Integer>();

/*        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);*/


        // Creating an empty Stack
        Stack<String> s1 = new Stack<String>();

        // Use push() to add elements into the Stack
        s1.push("Welcome");
        s1.push("To");
        s1.push("Geeks");
        s1.push("For");
        s1.push("Geeks");

        // Displaying the Stack
        System.out.println("Initial Stack: " + s1);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + s1.peek());

        //is Empty method
      //  System.out.println(s1.isEmpty());


        // Removing elements using pop() method
        System.out.println("Popped element: "
                + stack.pop());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + s1);




    }








}



