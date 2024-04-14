package ch07;

public class GenericPrinter<T extends Material> /* 실제 쓸 자료형 <> */ {
	
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
