package exCollection;

import java.util.HashMap;

public class HashMapTeen {

	public static void main(String[] args) {
		HashMap<String, String> countries = new HashMap<>();
		
		countries.put("TH", "Thailand");
		countries.put("JP", "Japan");
		countries.put("CN", "China");

		System.out.println(countries);
		System.out.println(countries.get("TH"));
		System.out.println(countries.get("CN"));
		System.out.println(countries.get("JP"));
		System.out.println(countries.size());
		
		System.out.println(countries.containsKey("TH"));
		System.out.println(countries.containsValue("Thailand"));
		System.out.println(countries.containsKey("Lao"));
		System.out.println(countries.containsValue("Lao"));
		
		countries.remove("CN");
		System.out.println(countries);
		
		countries.clear();
		System.out.println(countries);
	}

}