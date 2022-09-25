class Foo {
    private Lock lock;
    private Condition firstExecuted;
    private Condition secondCondition;
    private volatile boolean isFirstExecuted;
    private volatile boolean isSecondExecuted;
    public Foo() {
        lock=new ReentrantLock();
        firstExecuted=lock.newCondition();
        secondCondition=lock.newCondition();
        
    }
    
    

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        isFirstExecuted=true;
        firstExecuted.signal();
         lock.unlock();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try{
            while(isFirstExecuted!=true)
             firstExecuted.await();
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        isSecondExecuted=true;    
        secondCondition.signal();    
        }
        finally{
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        // printThird.run() outputs "third". Do not change or remove this line.
        try{
         while(isSecondExecuted!=true)   
             secondCondition.await();
        printThird.run();
        }
        finally{
            lock.unlock();
        }
        
    }
}
