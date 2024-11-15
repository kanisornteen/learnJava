package exGeneric;

// GenericClass = คลาสที่สามารถมีพารามิเตอร์ได้
class Item<T>{
	public T data;
	
	public Item(T data) {
		this.data = data;
	}
}

public class GenericClass {
	public static void main(String[] args) {
		Item<Integer> obj1 = new Item<>(10);
		System.out.println(obj1.data);
		
		Item<String> obj2 = new Item<>("Teen");
		System.out.println(obj2.data);
		
		Item<Double> obj3 = new Item<>(30.0);
		System.out.println(obj3.data);
	}
}
