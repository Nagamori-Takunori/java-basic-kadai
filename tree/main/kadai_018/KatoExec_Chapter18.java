package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		Kato_Chapter18 kt = new KatoTaro_Chapter18();
		Kato_Chapter18 ki = new KatoIchiro_Chapter18();
		Kato_Chapter18 kh = new KatoHanako_Chapter18();
		
		kt.setGivenName();
		ki.setGivenName();
		kh.setGivenName();
		kt.execIntroduce();
		ki.execIntroduce();
		kh.execIntroduce();

	}
}
