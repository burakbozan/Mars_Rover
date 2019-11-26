package rover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.exception.CommandInitializationException;
import rover.model.Direction;

public class MarsRoverTest {
	
	@Test
	public void shouldReturnTrueWhenCommandsRun() throws CommandInitializationException{
		
		final MarsRover marsRover = new MarsRover(5, 5);
        marsRover.addRover(1, 2, Direction.N);
        marsRover.sendCommand("LMLMLMLMM");
        marsRover.addRover(3, 3, Direction.E);
        marsRover.sendCommand("MMRMMRMRRM");
        marsRover.addRover(3, 3, Direction.E);
        marsRover.sendCommand("R");
        
        assertEquals("1 3 N", marsRover.getRovers().get(0).finalLocation());
        assertEquals("5 1 E", marsRover.getRovers().get(1).finalLocation());
        assertEquals("3 3 S", marsRover.getRovers().get(2).finalLocation());
	}

}
