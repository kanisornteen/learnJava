package exGeneric;

// BoundedTypeParameter = การกำหนดขอบเขตในการกำหนด Type ใน Generic

class Item2<T extends Integer>{ // จากตัวอย่างนี้, class นี้รับได้แค่ Integer
	public T data;
	
	public Item2(T data) {
		this.data = data;
	}
}

public class BoundedTypeParameter {
	public static void main(String[] args) {
		Item2<Integer> obj1 = new Item2<>(50);
		System.out.println(obj1.data);
		
//		Item<String> obj2 = new Item<>("Teen"); // ส่งประเภทอื่น ๆ ไปไม่ได้
//		System.out.println(obj2.data);
//		
//		Item<Double> obj3 = new Item<>(30.0);
//		System.out.println(obj3.data);
	}
}
