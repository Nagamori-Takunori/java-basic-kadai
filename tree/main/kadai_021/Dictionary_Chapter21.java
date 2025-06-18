package kadai_021;

import java.util.HashMap;
import java.util.Map.Entry;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> fruitMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21(String[] name) {

		boolean fruitflg = true;
		
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
		
		for(int i = 0; i < name.length; i++) {
			fruitflg = false;
			for(Entry<String,String> entry : fruitMap.entrySet()) {
				if(entry.getKey().equals(name[i])) {
					fruitflg = true;
					System.out.println(name[i] + "の意味は" + entry.getValue());
				}
			}
			if(fruitflg == false) {
				System.out.println(name[i] + "は辞書に存在しません");
			}
		}
		
	}
}
