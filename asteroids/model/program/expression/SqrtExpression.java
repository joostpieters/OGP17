package asteroids.model.program.expression;

import java.util.List;

import asteroids.model.program.Element;
import asteroids.model.program.Expression;
import asteroids.part3.programs.SourceLocation;

public class SqrtExpression extends Element implements Expression{

	private Expression<Double> expression;
	
	public SqrtExpression(SourceLocation sourceLocation, Expression<Double> e1) {
		super(sourceLocation);
		this.setExpression(e1);
	}
	
	private Expression<Double> getExpression(){
		return this.expression;
	}
	
	private void setExpression(Expression<Double> expression){
		this.expression = expression;
	}

	@Override
	public Double calculate() throws IllegalArgumentException {
		return Math.sqrt(this.getExpression().calculate());
	}

	@Override
	public Double calculate(List actualArgs) throws IllegalArgumentException {
		return Math.sqrt(this.getExpression().calculate(actualArgs));
	}

}