class FizzBuzz {
    private int n;
    private ReentrantLock reentrantLock;
     private int count;

    public FizzBuzz(int n) {
        this.n = n;
        this.reentrantLock=new ReentrantLock();
        this.count=1;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
       while(count<=n)
        {
           reentrantLock.lock();
            if(count%3==0 && count%5!=0 && count<=n)
            {
             printFizz.run();
                count++;
            
            }
            reentrantLock.unlock();
            
        }
        
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
         while(count<=n)
        {
             reentrantLock.lock();
            if(count%3!=0 && count%5==0 && count<=n)
            {
             printBuzz.run();
                count++;
            
            }
              reentrantLock.unlock();
            
        }
        
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
          while(count<=n)
        {reentrantLock.lock();
            if(count%15==0 && count<=n)
            {
             printFizzBuzz.run();
             count++;
            }
            reentrantLock.unlock();
        }
        
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
          while(count<=n)
        {reentrantLock.lock();
            if(count%3!=0 && count%5!=0 && count<=n)
            {
             printNumber.accept(count);
            count++;
            }
          reentrantLock.unlock();
            
        }
        
    }
}
