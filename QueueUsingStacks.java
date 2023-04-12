package DataStructurHW1;
import java.util.Stack;
// PROBLEM 3 BONUS
 // NAME & LASTNAME: REZWANULLAH QURAISHI
    // STUDENT NO: 200316057
public class QueueUsingStacks {
    // for using stacks to make queue we have to create two sprate stack one for taking
    // and other for removing or returning the tooken items 
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
     // this method will add items in to the stack1
    public void enqueue(int item) {
        stack1.push(item);
    }
    // if the stack2 is empty then it will take all of the items from the stack1
    // after that it will add it in to stack2 by using push 
    // and finally it will return value of stack2 that token from stack1
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        // creatting new queue by using QueueUsingStack class 
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);// pushing items into queue using enqueue method
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // removing items by using dequeue method (prints 1)
        System.out.println(queue.dequeue()); // prints 2
        System.out.println(queue.dequeue()); // prints 3
        System.out.println(queue.dequeue()); // prints 4
    }
}

    

