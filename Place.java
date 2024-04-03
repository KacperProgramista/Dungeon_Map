public class Place {
	
	private String name;
	private String description;
	
	private Place[] transitions = new Place[4];
	
	public Place(String name) {
		this.name = name;
	}
	public void addTransition(Place left, Place up, Place right, Place down) {
		transitions[0] = left;
		transitions[1] = up;
		transitions[2] = right;
		transitions[3] = down;
	}
	
}
