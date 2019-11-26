package rover.commands;

import rover.model.Rover;

public class LeftCommand implements Command {

	@Override
	public void command(final Rover rover) {
		
		rover.setHeading(rover.getHeading().onLeft());
	}


}
