package ba.bitcamp.homework1;

	import javax.naming.OperationNotSupportedException;



	public interface Connectable {

	void connect(Computer c) throws OperationNotSupportedException ;

	void connect(Network n) throws OperationNotSupportedException;

	void disconnect();

	}

