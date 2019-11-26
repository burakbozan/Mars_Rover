package rover.model;

public class Coordinates {
	
	private int x;
    private int y;

    public Coordinates(final int x, final int y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    public Coordinates move(final Direction direction){
    	
		return this.sum(direction.onForward());
    }
    
    public Coordinates sum(final Coordinates coordinates) {
    	
    	this.x += coordinates.getX();
    	this.y += coordinates.getY();
    	
    	return this;
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Coordinates other = (Coordinates) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "" + x + " " + y + "";
	}

}
