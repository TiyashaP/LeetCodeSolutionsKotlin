

import java.util.concurrent.Semaphore;

class DiningPhilosophers {
	private Semaphore[] semaphoreList;
	Semaphore zeroOrFour;

    public DiningPhilosophers() {
    	
    	semaphoreList=new Semaphore[]{new Semaphore(1),new Semaphore(1),new Semaphore(1),new Semaphore(1),new Semaphore(1),new Semaphore(1)};
    	 zeroOrFour=new Semaphore(1);
    }

    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
    	int rightFork=philosopher;
    	int leftFork=philosopher==0?4:philosopher-1;
    	if(philosopher==0||philosopher==4)
            zeroOrFour.acquire();
        if(philosopher%2==0)
        {semaphoreList[rightFork].acquire();
		semaphoreList[leftFork].acquire();
        }
        else
        {
            semaphoreList[leftFork].acquire();
            semaphoreList[rightFork].acquire();
        }
    		pickLeftFork.run();
     	    pickRightFork.run();
     	    eat.run();
     	   putLeftFork.run();
     	   putRightFork.run();
        if(philosopher==0||philosopher==4)
            zeroOrFour.release();
     	   semaphoreList[rightFork].release();
   		   semaphoreList[leftFork].release();

    }
}
