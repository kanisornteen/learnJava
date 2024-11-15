package exGeneric;

// MultipleTypeParameter = รับ parameter ได้หลายตัว

class Item3<T, U>{
	public T data;
	public U data2;
	
	public Item3(T data, U data2) {
		this.data = data;
		this.data2 = data2;
	}
}

public class MultipleTypeParameter {
	public static void main(String[] args) {
		Item3<Integer, Boolean> obj1 = new Item3<>(10, true);
		System.out.println(obj1.data + "| " + obj1.data2);
		
		Item3<String, Float> obj2 = new Item3<>("Teen", 3.0f);
		System.out.println(obj2.data + "| " + obj2.data2);
		
		Item3<Double, Character> obj3 = new Item3<>(30.0, 'A');
		System.out.println(obj3.data + "| " + obj3.data2);
	}
}
