package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {
	public Jyanken_Chapter28() {
	}
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
	    //入力した内容を取得する
		String input = scanner.next();
		
		if(!input.equals("r") && !input.equals("s") && !input.equals("p")) {
			input = "error";
		}

	    //Scannerクラスのオブジェクトをクローズする
	    scanner.close();
		
		return input;
	}
	
	public String getRandom() {
		
		String pchand = "";
		double random = 0;
		random = Math.floor(Math.random() * 2);
		
		if(random == 0.0) {
			pchand = "r";
		} else if(random == 1.0) {
			pchand = "s";
		} else {
			pchand = "p";
		}
		
		return pchand;
	}
	
	public void playGame() {
		String youchoice = getMyChoice();
		String pcchoice = getRandom();
		
		if((youchoice.equals("r") && pcchoice.equals("r")) || (youchoice.equals("s") && pcchoice.equals("s")) || (youchoice.equals("p") && pcchoice.equals("p"))) {
			System.out.println("あいこです");
		}else if((youchoice.equals("r") && pcchoice.equals("s")) || (youchoice.equals("s") && pcchoice.equals("p")) || (youchoice.equals("p") && pcchoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}
}
