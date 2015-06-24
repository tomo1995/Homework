package ba.bitcamp.homework1;

public abstract class Network {
	private String name;

	private Computer [] computers;


	public Network(String name) {

	super();

	this.name = name;

	this.computers = new Computer[0];

	}

	public abstract void addComputer(Computer c);


	public abstract void removeComputer(Computer c);

	}

