package asteroids.model.program.expression;

import java.util.List;
import java.util.Set;

import asteroids.model.Entity;
import asteroids.model.Helper;
import asteroids.model.program.Expression;
import asteroids.model.program.Variable;
import asteroids.part3.programs.SourceLocation;

public class GetYExpression extends EntityExpression{

	public GetYExpression(SourceLocation sourceLocation, Expression<Entity> entity) {
		super(sourceLocation, entity);
	}

	@Override
	public Double calculate() throws Exception {
		getEntity().setProgram(this.getProgram());
		if(getEntity().calculate() == null) throw new IllegalArgumentException("(gye) entity is null");
		return this.getEntity().calculate().getPosition()[1];
	}

	@Override
	public Double calculate(Object[] actualArgs, Set<Variable> localVars) throws Exception {
		if(getEntity() == null) throw new IllegalArgumentException("(gye) entity is null");
		return this.getEntity().calculate(actualArgs, localVars).getPosition()[1];
	}

}
