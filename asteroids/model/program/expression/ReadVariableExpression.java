package asteroids.model.program.expression;

import java.util.Set;

import asteroids.model.Helper;
import asteroids.model.program.Element;
import asteroids.model.program.Expression;
import asteroids.model.program.Variable;
import asteroids.part3.programs.SourceLocation;

public class ReadVariableExpression extends Element implements Expression<Object>{
	
	private String variableName;

	public ReadVariableExpression(SourceLocation sourceLocation, String name) {
		super(sourceLocation);
		setVariableName(name);
	}

	public String getVariableName() {
		return this.variableName;
	}

	private void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	@Override
	public Object calculate() throws Exception {
		try{
			return getProgram().getVariable(getVariableName()).getValue();
		}catch(Exception ex){
			throw new Exception("RVE error: " + ex.getMessage());
		}
	}

	@Override
	public Object calculate(Object[] actualArgs, Set<Variable> localVars) throws IllegalArgumentException {
		return getProgram().getVariable(variableName).getValue();
	}

}
