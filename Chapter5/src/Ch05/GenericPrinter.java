package Ch05;

public class GenericPrinter<T> /* 실제 쓸 자료형 <> */ {
	
	private T material;
	
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
	
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}

}
