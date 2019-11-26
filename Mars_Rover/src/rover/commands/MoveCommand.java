package rover.commands;

import rover.model.Rover;

public class MoveCommand implements Command {

	@Override
	public void command(final Rover rover) {
		
		rover.setLocation(rover.getLocation().move(rover.getHeading()));
	}


}
