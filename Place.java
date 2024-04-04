public class Place {
	
	private String name;
	private String description;
	
	public Place[] transitions = new Place[4];
	
	public Place(String name) {
		this.name = name;
	}
	public void addTransition(Place left, Place up, Place right, Place down) {
		transitions[0] = left;
		transitions[1] = up;
		transitions[2] = right;
		transitions[3] = down;
	}
	public String getName() {
		return name;
	}
	public String getTransitions() {
		String string = "";
		if(transitions[0] != null)
			string += "Left ";
		if(transitions[1] != null)
			string += "Up ";
		if(transitions[2] != null)
			string += "Right ";
		if(transitions[3] != null)
			string += "Down ";
		return string;
	}
}
