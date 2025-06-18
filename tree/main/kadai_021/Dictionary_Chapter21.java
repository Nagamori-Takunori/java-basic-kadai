package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> fruitMap = new HashMap<String,String>();
	boolean fruitflg;
	
	public Dictionary_Chapter21() {
		
		fruitMap.put("apple",		"りんご");
		fruitMap.put("peach",		"桃");
		fruitMap.put("banana",		"バナナ");
		fruitMap.put("lemon",		"レモン");
		fruitMap.put("pear",		"梨");
		fruitMap.put("kiwi",		"キウィ");
		fruitMap.put("strawberry",	"いちご");
		fruitMap.put("grape",		"ぶどう");
		fruitMap.put("muscat",		"マスカット");
		fruitMap.put("cherry",		"さくらんぼ");
		
	}
	
	public void search(String[] name) {
		for(int i = 0; i < name.length; i++) {
			fruitflg = false;
			if(fruitMap.get(name[i]) != null) {
				fruitflg = true;
				System.out.println(name[i] + "の意味は" + fruitMap.get(name[i]));
			}
			if(fruitflg == false) {
				System.out.println(name[i] + "は辞書に存在しません");
			}
		}
	}
}
