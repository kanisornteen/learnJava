package exCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTeen {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>(List.of("Honda"));
		data.add("Scannia");
		data.add("Volvo");
		data.add("MAN");
		data.add(1, "Benz"); // เพิ่มรายการไปที่ index ที่ 1

		System.out.println(data);
		System.out.println(data.get(0));
		System.out.println(data.size());
	}
	
	// อ่านสรุปได้ที่ https://www.canva.com/design/DAGWIbImj3I/72OxkFp52KMfk5Okc53wjA/view?utm_content=DAGWIbImj3I&utm_campaign=designshare&utm_medium=link&utm_source=editor
}
