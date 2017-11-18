/*	MenyBuganim 302490610  BaruchRothkoff 311603252	*/
package assig1_2;

public class assig1_2_main {

	public static void main(String[] args){
		Track track = new Track();
		Racer racer1 = new Racer(10, track);
		Racer racer2 = new Racer(2, track);
		Racer racer3 = new Racer(3, track);
		Racer racer4 = new Racer(7, track);
		Thread t1 = new Thread(racer1);
		Thread t2 = new Thread(racer2);
		Thread t3 = new Thread(racer3);
		Thread t4 = new Thread(racer4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

/*public static void main(String[] args){
Track track = new Track();
Racer racer1 = new Racer(6, track);
Racer racer2 = new Racer(2, track);
Racer racer3 = new Racer(3, track);
Racer racer4 = new Racer(1, track);
Racer racer5 = new Racer(-8, track);
Racer racer6 = new Racer(11, track);
Racer racer7 = new Racer(10, track);
Racer racer8 = new Racer(10, track);
Thread t1 = new Thread(racer1);
Thread t2 = new Thread(racer2);
Thread t3 = new Thread(racer3);
Thread t4 = new Thread(racer4);
Thread t5 = new Thread(racer5);
Thread t6 = new Thread(racer6);
Thread t7 = new Thread(racer7);
Thread t8 = new Thread(racer8);
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
t6.start();
t7.start();
t8.start();
}*/
