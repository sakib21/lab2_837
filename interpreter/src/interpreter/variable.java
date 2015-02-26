package interpreter;

public class variable {
	String name;
	int value;
	
	variable(String x, int y){
		this.name= x;
		this.value =y;
	}
	
	int get(){
		
		return this.value;
	}

}
