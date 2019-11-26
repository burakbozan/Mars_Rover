package rover.model;

public class Plateau {
	
	private Coordinates upperRightCoordinate = new Coordinates(0, 0);
	private final Coordinates lowerLeftCoordinate = new Coordinates(0, 0);
	
	public Plateau(final int upperRightCoordinateX, final int upperRightCoordinateY) {
		final Coordinates existCoordinate = new Coordinates(upperRightCoordinateX, upperRightCoordinateY);
		this.upperRightCoordinate = this.upperRightCoordinate.sum(existCoordinate);
	}
	
	public Coordinates getUpperRightCoordinate() {
		return upperRightCoordinate;
	}
	public Coordinates getLowerLeftCoordinate() {
		return lowerLeftCoordinate;
	}

}
