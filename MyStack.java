package DataStructurHW1;
public class MyStack {
    int maxSize; // size of the stack
    private long[] stackArray;
    private int top; // top of the stack

    public MyStack(int s){
        maxSize = s;
        stackArray = new long[maxSize];// creat stack array
        top=-1;
    }

    public void push(long j)// put itemd on the top of the stack
    {
        stackArray[++top] = j;//increament top insert item
    }

    public long pop()// take item from  top of the stack
    {
        return stackArray[top--];// access item, decrement top
        }
        public long peek()// peek at the top of the stack
        {
            return stackArray[top];
        }

        public boolean isEmpty()// true if the stack is empty
        {
            return (top == -1);
        }

        public boolean isFull()// true if the stack is full
        {
            return (top==maxSize-1);
        }//end of the Mystack 
}

class stackApp{
    public static void main(String[] args){
        MyStack theStack = new MyStack(10);// make new stack
        theStack.push(20);// push items onto stack
        theStack.push(5);
        theStack.push(30);
        theStack.push(70);
        theStack.push(40);
        theStack.push(90);
        theStack.push(23);
        theStack.push(25);// this(25) is the top of the stack
        //stack = LIFO last in, first out 
        // pop will remove the items from top of the stack
        // push will add the items to the top of the stack
        // peek will access the top of the stack witout removing 

// while(!theStack.isEmpty()) // until it is empty
// {
//     // delete item from stack
//     long value = theStack.pop();
//     System.out.print(value); // display it 
//     System.out.print(" ");
// }

// long valuee = theStack.pop();
//  System.out.print(valuee);
//  long vlue2 = theStack.pop();
//  System.out.println("\n"+vlue2);
 long peekk = theStack.peek();
 System.out.print(peekk);
}
}
