package GoneSolver;

public class Pebble {
	private String color;
	private int iterationValue;
	
	private Pebble leftNeighbor;
	private Pebble rightNeighbor;
	private Pebble upNeighbor;
	private Pebble downNeighbor;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getIterationValue() {
		return iterationValue;
	}
	
	public void setIterationValue(int iterationValue) {
		this.iterationValue = iterationValue;
	}
	
	public Pebble getLeftNeighbor() {
		return leftNeighbor;
	}
	
	public void setLeftNeighbor(Pebble leftNeighbor) {
		this.leftNeighbor = leftNeighbor;
	}
	
	public Pebble getRightNeighbor() {
		return rightNeighbor;
	}
	
	public void setRightNeighbor(Pebble rightNeighbor) {
		this.rightNeighbor = rightNeighbor;
	}
	
	public Pebble getUpNeighbor() {
		return upNeighbor;
	}
	
	public void setUpNeighbor(Pebble upNeighbor) {
		this.upNeighbor = upNeighbor;
	}
	
	public Pebble getDownNeighbor() {
		return downNeighbor;
	}
	
	public void setDownNeighbor(Pebble downNeighbor) {
		this.downNeighbor = downNeighbor;
	}
	
	private Pebble() {
		
	}
	
	public static final Pebble build() {
		return new Pebble();
	}
	
	public boolean flipColor() {
		boolean flipped = false;
		// Add if/switch statement that flips the current pebbles color(if possible)
		return flipped;
	}
}
