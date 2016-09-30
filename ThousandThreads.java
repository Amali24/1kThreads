/*(Synchronize threads) Write a program that launches 1,000 threads. Each
thread adds 1 to a variable sum that initially is 0. Define an Integer wrapper
object to hold sum. Run the program with and without synchronization to see
its effect.*/

import java.util.concurrent.*;

public class ThousandThreads {
    public static void main(String[] args){
        ExecutorService executor = Executors.newCachedThreadPool();
        
        for (int i = 0; i < 1000; i++){
            executor.execute(new AddToSumTask());        }
    }
}

class AddToSumTask implements Runnable{
    @Override    
    public void run(){
            
        }
    }
