package exCollection;

import java.util.HashSet;

public class HashSetTeen {

	public static void main(String[] args) {
		HashSet<String> data = new HashSet<>();
		
		data.add("Scania");
		data.add("Volvo");
		data.add("MAN");
		data.add("Honda");
		data.add("Mclaren");
		data.add("Scania"); // เพิ่มข้อมูลตัวที่มีอยู่แล้วไม่ได้ ลองรันดูผลลัพธ์

		System.out.println(data);
		System.out.println(data.size());
		
		data.remove("MAN");
		
		System.out.println(data);
		System.out.println(data.contains("Scania"));
		System.out.println(data.size());
	}

}
