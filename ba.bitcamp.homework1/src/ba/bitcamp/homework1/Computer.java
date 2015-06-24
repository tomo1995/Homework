package ba.bitcamp.homework1;

	import java.util.Arrays;



	public abstract class Computer  {

	private String name;

	private MACaddress address;


	public String getName() {

	return name;

	}


	public Computer() {

	super();

	this.name = "computer";

	this.address = new MACaddress(new char[]{'5','g','3','4','8','7', '2', '3', '6', 't', 'm', '8'});

	}


	public MACaddress getAddress() {

	return address;

	}


	public Computer(String name, char[] address) {

	super();

	this.name = name;

	this.address = new MACaddress(address);

	}


	public class MACaddress {


	private char[] name; // 0123456789ab




	public char[] getName() {

	return name;

	}



	public MACaddress(char[] name) {

	super();

	this.name = name;

	}



	@Override

	// 01:23:45:67:89:ab

	public String toString() {

	String s = "";


	for(int i = 0; i < name.length; i++ ){

	if(i % 2 == 0 && i != 0 && i != name.length -1 ){

	s+=":";

	}

	s += name[i];

	}


	return s;

	}






	@Override

	public boolean equals(Object obj) {

	if (this == obj)

	return true;

	if (obj == null)

	return false;

	if (getClass() != obj.getClass())

	return false;

	MACaddress other = (MACaddress) obj;

	if (!getOuterType().equals(other.getOuterType()))

	return false;

	if (!Arrays.equals(name, other.name))

	return false;

	return true;

	}



	private Computer getOuterType() {

	return Computer.this;

	}



	}



	@Override

	public boolean equals(Object obj) {

	if (this == obj)

	return true;

	if (obj == null)

	return false;

	if (getClass() != obj.getClass())

	return false;

	Computer other = (Computer) obj;

	if (address == null) {

	if (other.address != null)

	return false;

	} else if (!address.equals(other.address))

	return false;

	if (name == null) {

	if (other.name != null)

	return false;

	} else if (!name.equals(other.name))

	return false;

	return true;

	}

	@Override

	public String toString() {

	return "Computer [name=" + name + ", address=" + address + "]";

	}




	}

