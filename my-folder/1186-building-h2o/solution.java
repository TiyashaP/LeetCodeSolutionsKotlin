import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

class H2O {
    private CyclicBarrier cyclicBarrier;
    private Semaphore hydrogen;
    private Semaphore oxygen;
    public H2O() {
    	cyclicBarrier=new CyclicBarrier(3);
    	hydrogen=new Semaphore(2);
    	oxygen=new Semaphore(1);
    	
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
    	hydrogen.acquire();
        try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        releaseHydrogen.run();
        hydrogen.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygen.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
    	try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		releaseOxygen.run();
		oxygen.release();
		
    }
}
