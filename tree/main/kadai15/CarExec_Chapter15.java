package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		int ChangeGear = 3;
		System.out.println("ギア1から" + ChangeGear + "に切り替えました");
		car(ChangeGear);
	}

	public static void car(int gear) {
		Car_Chapter15 c = new Car_Chapter15(gear);
		c.gearChange(gear);
		c.run();
	}
}
