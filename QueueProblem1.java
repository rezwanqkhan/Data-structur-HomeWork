package DataStructurHW1;

// PROBLEM 2: sorting randome arry by using stack
    //NAME & LASTNAME: REZWANULLAH QURAISHI
    // STUDENT NO: 
public class QueueProblem1 {
   
   // this method will calculate and retun the time for tooken by each bilet 
    private static int calculateTime(int[] tickets, int k) {
        int n = tickets.length;// n will take the length of the tickets in array

           // here! i used the queue class that we creat it at the class during lectures 
        // queue class works same with Queue in java classes
       queue theQueue = new queue(11); // maxSize is 11

          int time = 0;// int begining time is zero
          // this for loop will take items from tickets array and fill it in the theQueue
         for(int i =0; i < n; i++) {
            theQueue.insert(tickets[i]);
         }
        // this while loop works until the queue is not empty 
         while(!theQueue.isEmpty()) {

            long bilet = theQueue.remove();// remove the first item from the queue
            time++; // for a ticket it will takes 1 second
            if (bilet >1) // if the bilet takker wanna more than 1 tickets
             {
                   theQueue.insert(bilet -1); // decrease ticket one and put it in the queue again
                   if (k == 0) {
                    k= theQueue.size(); // in the begining if the people count is zero
                    // it will taks as much as the queue size
                } else {
                    k--; // if its not decrease
                }
                } else {
                    k--; 
                }
                }
          return time; // return the time in seconds
    }
    



    public static void main(String[] args) {
        int[] tickets = {3, 2,1}; // tickets array that has given into the problem document
        int k = 0;// the number of people
        int time = calculateTime(tickets, k);// calling calculateTime method 
        System.out.println(time + " seconds");// printting the time on the screen
        

    }

    
}


