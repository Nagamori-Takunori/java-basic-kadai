package kadai_015;

// 車クラス
public class Car_Chapter15 {
	
	private int gear = 1;	// 1速から5速のギアを表す
	private int speed = 10;	// ギアチェンジ後の速度を表す
	
    // コンストラクタ（初期化処理）
    public Car_Chapter15(int gear) {
    	this.gear = gear;
    }
    
	// ギアの値により速度を変える
	public void gearChange(int afterGear) {
		if(afterGear <= 5 && afterGear >= 1) {
			speed = gear * 10;
		} else {
			speed = 10;
		}
	}

	public void run() {
		// TODO 自動生成されたメソッド・スタブ;
		System.out.println("速度は時速" + speed + "kmです。");
	}
}
