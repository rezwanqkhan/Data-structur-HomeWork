package DataStructurHW1;
class queue
{
         private static int maxSize;
         private static long[] queArray;
         private static int  front;
         private static int rear;
         int nItems;

         public queue(int s) // constructor
        {
           maxSize = s;
           queArray = new long[maxSize];
           front = 0;
           rear = -1;
           nItems = 0;
        }
        public  long insert(long j) 
       // put item at rear of queue
       {
           if(rear == maxSize-1)
              rear = -1; // deal with wraparound
           // increment rear and insert
           queArray[++rear] = j; 
           return nItems++;
        }
        public long remove() // take item from front of queue
        {
            // get value and incr front
             long temp = queArray[front++]; 
             if(front == maxSize) // deal with wraparound
                  front = 0;
             nItems--; // one less item
             return temp;
        }
        public static long peekFront() 
        {        return queArray[front]; 
        }
        
        public boolean isEmpty() // true if queue is empty
        { return (nItems==0); 
        }
        
        public boolean isFull() // true if queue is full
        { return (nItems==maxSize);
        }
        
        public  int size() // number of items in queue
        { return nItems;
        }

        public void display(){
            int i;
          if(isEmpty()){
            System.out.println("oops its empty");
            return;
          }
          

        }
   
        } // end class Queue

        


class QueueApp
{
         public static void main(String[] args)
        {
           queue theQueue = new queue(5); // queue holds 5 items
           theQueue.insert(10); // insert 4 items
           theQueue.insert(20); theQueue.insert(30); theQueue.insert(40);
           theQueue.remove(); // remove 3 items
           theQueue.remove(); // (10, 20, 30)
           theQueue.remove();
           theQueue.insert(50); // insert 4 more items
           theQueue.insert(60); // (wraps around)
           theQueue.insert(70); theQueue.insert(80);
           while( !theQueue.isEmpty() ) // remove and display
           { // all items
               long n = theQueue.remove(); // (40, 50, 60, 70, 80)
              System.out.print(n); 
              System.out.print(" ");
           }
           System.out.println(" ");
         } // end main()
} // end class QueueApp
