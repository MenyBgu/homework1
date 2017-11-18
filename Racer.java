/*	MenyBuganim 302490610  BaruchRothkoff 311603252	*/
package assig1_2;

public class Racer implements Runnable {
	private static int globalId = 1;
	private int id;
	private int speed;
	private Track track;

	Racer(int speed, Track track) {
		id = globalId;
		globalId++;

		if (speed < 1 || speed > 10) {		//תנאי אם יהיה בעיה במהירות. דיפולטיבי שמתי 1.
			System.out.println("speed error. set default speed to 1.");
			this.speed = 1;
		} else {
			this.speed = speed;
		}

		this.track = track;
	}

	public void go() {
		String place;
		Thread.currentThread().setPriority(speed);
		for (int i = 1; i <= 100; i++)
			System.out.println("Runner " + id + " ran " + i + " meters.");
		track.setFinishedRacers();
		switch (track.getFinishedRacers()) {		//תפריט שמוסיף את הטייטל של המסיים.
		case 1:
			place = "st";
			break;
		case 2:
			place = "nd";
			break;
		case 3:
			place = "rd";
			break;
		default:
			place = "th";
			break;
		}
		System.out.println("Runner "+id+ " finished "+track.getFinishedRacers()+place);
	}

	public void run() {
		go();
	}
}
