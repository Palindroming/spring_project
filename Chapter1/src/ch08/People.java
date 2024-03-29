package ch08;

public class People {
	
	
	
	public int Height;
	public int Weight;
	public String Name;
	public int Age;
	
	public People() {}
	
	public People(int Height, int Weight, String Name, int Age) {
		
		this.Height = Height;
		this.Weight =Weight;
		this.Name = Name;
		this.Age = Age;
		
		
	}
	
	public String showPeopleInfo() {
		return "키가 "+ Height+ "이고 몸무게가 " + Weight + "킬로인 남성이 있습니다. 이름은 "+ Name +"이고 나이는 "+ Age +"세 입니다. ";

	}
	
}
