class FooBar {
    private int n;
    private boolean flag;

    public FooBar(int n) {
        this.n = n;
        flag=true;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
            synchronized(this)
            {
                while(!flag)
                    this.wait();
        	printFoo.run();
            flag=false;    
            this.notify();    
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
            synchronized(this)
            {
                while(flag)
                  this.wait();    
        	printBar.run();
            flag=true;
            this.notify();    
            }
        }
    }
}
