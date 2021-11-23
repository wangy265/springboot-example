package refactor.wang.enumway;

public enum Operator {

	ADD {
		@Override
		public int apply(int a, int b) {
			return a + b;
		}
	},
	
	DIVISION {
		@Override
		public int apply(int a, int b) {
			return a-b;
		}
		
	};

	public abstract int apply(int a, int b);

}
