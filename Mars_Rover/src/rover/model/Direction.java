package rover.model;

public enum Direction {

	N {
		@Override
		public Direction onLeft() {
			return W;
		}

		@Override
		public Direction onRight() {
			return E;
		}

		@Override
		public Coordinates onForward() {
			return new Coordinates(0, 1);
		}
	},
	S {

		@Override
		public Direction onLeft() {
			return E;
		}

		@Override
		public Direction onRight() {
			return W;
		}

		@Override
		public Coordinates onForward() {
			return new Coordinates(0, -1);
		}
	},
	W {

		@Override
		public Direction onLeft() {
			return S;
		}

		@Override
		public Direction onRight() {
			return N;
		}

		@Override
		public Coordinates onForward() {
			return new Coordinates(-1, 0);
		}
	},
	E {

		@Override
		public Direction onLeft() {
			return N;
		}

		@Override
		public Direction onRight() {
			return S;
		}

		@Override
		public Coordinates onForward() {
			return new Coordinates(1, 0);
		}
	};

	public abstract Direction onLeft();

	public abstract Direction onRight();

	public abstract Coordinates onForward();

}
