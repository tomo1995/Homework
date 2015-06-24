package ba.bitcamp.homework1;
import  javax.naming.OperationNotSupportedException;
public class Main {

	public static void main(String[] args) {


		Client cl = new Client("name", new char[21]);

		Client cl1 = new Client("namee", new char [25]);


		Network n = new Network("Mreza1") {


		@Override

		public void removeComputer(Computer c) {

		// TODO Auto-generated method stub


		}


		@Override

		public void addComputer(Computer c) {

		// TODO Auto-generated method stub


		}

		};




		try {

		cl.connect(cl1);


		} catch (OperationNotSupportedException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}


		cl.disconnect();


		try {

		cl.connect(cl1);

		} catch (OperationNotSupportedException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		}
}
