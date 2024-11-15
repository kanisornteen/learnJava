package exCollection;

import java.util.TreeSet;

public class TreeSetTeen {

	public static void main(String[] args) {
		TreeSet<String> data = new TreeSet<>();
		
		data.add("Scania");
		data.add("Volvo");
		data.add("MAN");
		data.add("Honda");
		data.add("Mclaren");
		data.add("A");
		data.add("B");
		data.add("C");
		data.add("Scania"); // เพิ่มข้อมูลตัวที่มีอยู่แล้วไม่ได้ ลองรันดูผลลัพธ์

		System.out.println(data);
		System.out.println(data.size());
		
		data.remove("MAN");
		
		System.out.println(data);
		System.out.println(data.contains("Scania"));
		System.out.println(data.size());
	}

}