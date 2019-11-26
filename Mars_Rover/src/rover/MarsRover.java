package rover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rover.commands.Command;
import rover.commands.LeftCommand;
import rover.commands.MoveCommand;
import rover.commands.RightCommand;
import rover.exception.CommandInitializationException;
import rover.model.Coordinates;
import rover.model.Direction;
import rover.model.Plateau;
import rover.model.Rover;

public class MarsRover {
	
	private final List<Rover> rovers = new ArrayList<Rover>();
    private final Plateau plateau;
    private int sentCommand = 0;
    
    private static Map<String, Command> stringToCommandMap = new HashMap<String, Command>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
        put("L", new LeftCommand());
        put("R", new RightCommand());
        put("M", new MoveCommand());
    }};
    
    public MarsRover(final int xCoor, final int yCoor) {
    	this.plateau = new Plateau(xCoor, yCoor);
	}
    
    public void addRover(final int x, final int y, final Direction heading) {
        final Rover rover = new Rover(new Coordinates(x, y), heading);
        this.rovers.add(rover);
    }
    
    public void sendCommand(final String commands) throws CommandInitializationException {
        
    	final Rover rover = rovers.get(sentCommand++);

        final String [] commandsArr = commands.split("(?!^)");

        for (int i = 0; i < commandsArr.length; i++) {
            final String strCommand = commandsArr[i];
            rover.execute(stringToCommandMap.get(strCommand));
        }
    }
    
//    public void sendCommand(final String commands) throws CommandInitializationException{
//    	
//    	for (int i = 0; i < commands.length(); i++) {
//    		processCommand(commands.charAt(i));
//		}
//    }
//    
//	public void processCommand(final Character command) throws CommandInitializationException {
//		
//		for (final Rover rover : this.rovers) {
//			
//			switch (command) {
//			case 'L':
//				rover.setHeading(rover.getHeading().onLeft());
//				break;
//			case 'R':
//				rover.setHeading(rover.getHeading().onRight());
//				break;
//			case 'M':
//				rover.setLocation(rover.getLocation().move(rover.getHeading()));
//				break;
//			default:
//				throw new CommandInitializationException("Wrong Command!");
//			}
//		}
//		
//	}

	public List<Rover> getRovers() {
		return rovers;
	}

	public Plateau getPlateau() {
		return plateau;
	}

}
