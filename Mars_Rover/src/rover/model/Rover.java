package rover.model;

import rover.commands.Command;

public class Rover {
	
	private Coordinates location;
    private Direction heading;
    
    public Rover(final Coordinates location, final Direction heading) {
    	this.setLocation(location);
    	this.setHeading(heading);
	}
    
    public String finalLocation() {
        return location.toString() + " " + heading.toString();
    }
    
    public void execute(final Command command){
        command.command(this);
    }
    
	public Coordinates getLocation() {
		return location;
	}
	public void setLocation(final Coordinates location) {
		this.location = location;
	}
	public Direction getHeading() {
		return heading;
	}
	public void setHeading(final Direction heading) {
		this.heading = heading;
	}

}
