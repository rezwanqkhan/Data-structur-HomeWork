package DataStructurHW1;
// PROBLEM 2: sorting randome array by using stack
    //NAME & LASTNAME: REZWANULLAH QURAISHI
    // STUDENT NO: 
public class StackProblem2 {
   
    public static void main(String[] args){
        // here an array that contain randome integer numbers 
        int[] expArray = { 9, 4, 3, -2, 7, 1};
        // here! i used the MyStack class that we creat it at the class during lectures 
        // MyStack class works same with stack in java classes
        MyStack expStack = new MyStack(6); // creat stack arry with max size 6 
        // this for loop takes all of values from expArray and push it into expStack
        for (int i = 0; i < expArray.length; i++){
            expStack.push(expArray[i]);
        }
        // this while loop will remove and print all of the values from expStack with unordered state
        System.out.print("unordered stack: ");
         while(!expStack.isEmpty()){
            long itemss = expStack.pop();
            System.out.print(itemss+" ");
        }
          // in the up while loop we remove and print all of the values from expStack for printting unordered state
          // in this for loop we push it again to expStack for sortting 
        for (int i = 0; i < expArray.length; i++){
            expStack.push(expArray[i]);
        }

        
        // for sortting it from less to greater we have to creat a new temprary stack
        MyStack tempStack = new MyStack(6);
        // now  this while loop work untile expStack is not empty by camparing temStack with expStack
        while (!expStack.isEmpty()){
            long tempp = expStack.pop(); // taking items from expStack in to temmp
            while (!tempStack.isEmpty() && tempStack.peek() < tempp) 
             // if tempStack is not empty and  camparing it with tempStack
             // add the items into expStack 
             {   expStack.push(tempStack.pop());
            }
            tempStack.push(tempp); // pushing the sorted items into thempStack 
        }

        // printing the ordered stack on the screen 
        System.out.print("\nordered stack: ");
        while (!tempStack.isEmpty()){
            System.out.print(tempStack.pop() + " ");
         }
       }
    }
