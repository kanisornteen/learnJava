package exCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetTeen {

	public static void main(String[] args) {
		LinkedHashSet<String> data = new LinkedHashSet<>();
		
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