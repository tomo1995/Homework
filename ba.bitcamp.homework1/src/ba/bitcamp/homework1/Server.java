package ba.bitcamp.homework1;


	public class Server extends Computer {

		private int numOfComputers;



		public int getNumOfComputers() {

		return numOfComputers;

		}



		public Server(int numOfComputers, char[] address, String name) {

		super(name, address);

		this.numOfComputers = numOfComputers;

		}



		@Override

		public String toString() {

		return "Server [numOfComputers=" + numOfComputers + "]";

		}






		@Override

		public boolean equals(Object obj) {

		if (this == obj)

		return true;

		if (!super.equals(obj))

		return false;

		if (getClass() != obj.getClass())

		return false;

		Server other = (Server) obj;

		if (numOfComputers != other.numOfComputers)

		return false;

		return true;

		}



		}



