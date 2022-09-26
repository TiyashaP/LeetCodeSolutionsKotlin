class FizzBuzz {
    private int n;
    private int i;
    private ReentrantLock lock;

    public FizzBuzz(int n) {
        this.n = n;
        this.i=1;
        lock=new ReentrantLock(true);
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
         while(true)
        {
    lock.lock();
       
        if(i>n)
        {
            lock.unlock();
            break;
        }
            if(i%3==0 && i%5!=0)
            {
               printFizz.run();
               i++;
                
            }
       lock.unlock(); 
        }
       
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
         while(true)
        {
     lock.lock();
       
        if(i>n)
        {
            lock.unlock();
            break;
        }
            if(i%3!=0 && i%5==0)
            {
               printBuzz.run();
                i++;
                
            }
       lock.unlock(); 
        }
       
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(true)
        {
         lock.lock();
        
        if(i>n)
        {
            lock.unlock();
            break;
        }
            if(i%3==0 && i%5==0)
            {
               printFizzBuzz.run();
               i++; 
            }
          lock.unlock(); 
        }
       
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(true)
        {
         lock.lock();
        
        if(i>n)
        {
            lock.unlock();
            break;
        }
            if(i%3!=0 && i%5!=0)
            {
               printNumber.accept(i);
               i++;
            }
        lock.unlock(); 
        }
      
    }
}
