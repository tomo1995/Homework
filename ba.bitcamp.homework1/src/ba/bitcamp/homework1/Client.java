package ba.bitcamp.homework1;

	import javax.naming.OperationNotSupportedException;



	public class Client extends Computer implements Connectable {

	private Computer connectedToComputer;

	private Network connectedToNetwork;

	public Client(String name, char[] address) {

	super(name, address);

	this.connectedToComputer = connectedToComputer;

	this.connectedToNetwork = connectedToNetwork;

	}

	

	public void connect(Computer c) throws OperationNotSupportedException {


	if(connectedToComputer == null){

	connectedToComputer = c;

	}else {

	throw new OperationNotSupportedException();

	}



	}


	@Override

	public void connect(Network n) throws OperationNotSupportedException {



	if(connectedToNetwork == null){

	connectedToNetwork = n;

	}else{

	throw new OperationNotSupportedException();

	}

	}


	@Override

	public void disconnect() {

	connectedToComputer = null;

	connectedToNetwork = null;


	}

	public Computer getConnectedToComputer() {

	return connectedToComputer;

	}

	public void setConnectedToComputer(Computer connectedToComputer) {

	this.connectedToComputer = connectedToComputer;

	}

	public Network getConnectedToNetwork() {

	return connectedToNetwork;

	}

	public void setConnectedToNetwork(Network connectedToNetwork) {

	this.connectedToNetwork = connectedToNetwork;

	}

	@Override

	public String toString() {

	return "Client [connectedToComputer=" + connectedToComputer

	+ ", connectedToNetwork=" + connectedToNetwork + "]";

	}


	@Override

	public boolean equals(Object obj) {

	if (this == obj)

	return true;

	if (!super.equals(obj))

	return false;

	if (getClass() != obj.getClass())

	return false;

	Client other = (Client) obj;

	if (connectedToComputer == null) {

	if (other.connectedToComputer != null)

	return false;

	} else if (!connectedToComputer.equals(other.connectedToComputer))

	return false;

	if (connectedToNetwork == null) {

	if (other.connectedToNetwork != null)

	return false;

	} else if (!connectedToNetwork.equals(other.connectedToNetwork))

	return false;

	return true;

	}
}
