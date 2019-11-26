package rover.commands;

import rover.model.Rover;

public class RightCommand implements Command {

	@Override
	public void command(final Rover rover) {
		
		rover.setHeading(rover.getHeading().onRight());
	}


}
