package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "";	// 姓を表す
	public String givenName = "";	// 名を表す
	public String address = "";		// 住所を表す
	
	abstract void setGivenName();

	//共通の紹介を出力する
	public void commonIntroduce() {
		familyName = "加藤";
		address = "住所は東京都中野区〇×です";
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println(address);
	}
	
	//個別の紹介を出力する
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
