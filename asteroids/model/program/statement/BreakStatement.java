package asteroids.model.program.statement;

import asteroids.model.program.Statement;
import asteroids.part3.programs.SourceLocation;

public class BreakStatement extends Statement{

	public Statement whileBreaks;
	
	public BreakStatement(SourceLocation sourceLocation) {
		super(sourceLocation);
	}

	public boolean hasBreak() {
		return true;
	}

	public Statement getWhileBreak(){
		return this.whileBreaks;
	}
	
	@Override
	public void execute() throws Exception{
		if(!(getProgram().hasWhile())) throw new Exception("Break can only occur in while statement");
		return;	
	}
}
