package asteroids.model.program;

import asteroids.model.Entity;

public class Variable <T> {
	private String variableName;
	private T value;

	public Variable(String variableName, T value){
		this.variableName = variableName;
		this.setValue(value);
	}
	
	public void setValue(T value) {
		if(!canHaveAsValue(value)) throw new IllegalArgumentException("Invalid value given to variable");
		this.value = value;
	}
	
	private boolean canHaveAsValue(T value) {
		return getValue()== null || (value instanceof Boolean && getValue() instanceof Boolean)
			||(value instanceof Double && getValue() instanceof Double)
			||(value instanceof Entity && getValue() instanceof Entity);
	}
	
	public T getValue(){
		return value;
	}

	public String getName() {
		return variableName;
	}
	
	public String toString(){
		return "[Variable: " + variableName + ", " + value + "]";
	}
}
