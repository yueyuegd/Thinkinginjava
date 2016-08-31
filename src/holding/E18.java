package holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class E18 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("kai", "singer");
		map.put("xi", "dancer");
		map.put("yuan", "singer");
		map.put("lu", "idol");
		System.out.println(map);
		String[] keys = map.keySet().toArray(new String[0]);
		Arrays.sort(keys);
		//System.out.println(map);
		Map<String,String> map2 = new LinkedHashMap<String,String>();
		for(String s:keys){
			map2.put(s, map.get(s));
		}
		System.out.println(map2);
	}

}
