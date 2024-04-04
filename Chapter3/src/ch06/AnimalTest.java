package ch06;

import java.util.ArrayList;

class Animal{
	
	
	
	public void move() {
		
		System.out.println("동물이 움직입니다.");
		
	}
	
	public void eating() {
		System.out.println("먹습니다.");
	}
}


class Human extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		
		System.out.println("사람이 책을 읽습니다.");	}
	  
}

class Tiger extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 네 발로 뜁니다.");
		
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
		
	}
	
	public void hunting() {
	
		System.out.println("호랑이가 사냥을 합니다.");
		
	}
	
	
}

class Eagle extends Animal{
	
	public void move() {
		
		System.out.println("독수리가 하늘을 날아 다닙니다.");
		
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(eAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(hAnimal);
		eAnimal.eating(); 
		//flying을 하려면 다시 downcasting이 필요함.
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(eAnimal);
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
	// 코드는 한 줄인데 어떤 데이터 형이 들어갔느냐에 따라 어떤 인스턴스 형이 들어갔냐에 따라 move의 implementation이 달라진다.
	// 상속을 하게 되면 하위 클래스들을 상위 클래스 하나의 타입으로 모두 핸들링할 수 있다.
		
		
	}
	
	public void moveAnimal(Animal animal) {
		
		animal.move();
	}

}
