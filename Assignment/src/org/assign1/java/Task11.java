package org.assign1.java;

/*Display all the properties of running threads. Create 3 threads and rename thread1 to "yourName" and make this thread a daemon thread.
  Get the updated thread details.
 */

class Multi1 extends Thread {
	public void run() {
		System.out.println("thread name is Thread1");
				try {
					Thread.sleep(1000);
					}catch(Exception e) {
						System.out.println(e);
					}
				}

}
class Multi2 extends Thread{
	public void run() {
		System.out.println("Thread name is Thread 2");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
class Multi3 extends Thread{
	public void run() {
		System.out.println("Thread name  is Thread 3");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

public class Task11{
	
	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		Multi2 m2 = new Multi2();
		Multi3 m3 = new Multi3();
		m1.setName("kailash");
		System.out.println("This thread name is:"+m1.getName());
		m1.setDaemon(false);
		System.out.println("this is daemon thread:"+m1.isDaemon());
		m1.start();
		m2.start();
		m3.start();
	}
}


