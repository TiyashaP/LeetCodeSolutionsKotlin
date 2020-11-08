



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private int count;
    private Lock lock;
    		
    public FizzBuzz(int n) {
        this.n = n;
        this.count=1;
        this.lock=new ReentrantLock();
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
    	
    	while(count<=n)
    	{
    	lock.lock();
    	if(count%3==0 && count%5!=0 && count<=n)
    	{
    		count++;
    		printFizz.run();
            
    	}
    	lock.unlock();
    	}
    	
        
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
    	
    	while(count<=n)
        {
    	lock.lock();
    	if(count%5==0 && count%3!=0 && count<=n)
    	{
    		count++;
    		printBuzz.run();
            
    	}
    	lock.unlock();
        }
    	
        
        
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
    	
    	while(count<=n)
        {
    	lock.lock();
    	if(count%3==0 && count%5==0 && count<=n)
    	{
    		count++;
    		printFizzBuzz.run();
            
    	}
    	lock.unlock();
        }
    	
        
        
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
    	
    	while(count<=n)
    	{lock.lock();
    		if(count%3!=0 && count%5!=0 && count<=n)
    	{
    		printNumber.accept(count);
            count++;
    	}
    		lock.unlock();
    	}
    	
        
        
    }
}

