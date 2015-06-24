package ba.bitcamp.homework1;

	public class ArrayManipulation {

		public static Computer[] extendArray (Computer[] c){


		Computer[] tmp = new Computer [c.length + 1] ;

		for ( int i = 0; i < c.length; i++){

		tmp [i] = c[i];

		}

		return tmp;

		}

		public static Computer[] shrinkArray (Computer [] c, int index){

		Computer [] tmp = new Computer[c.length - 1];

		for (int i = 0; i < c.length; i++){

		

		if(i < index){
			tmp [i] = c [i];


		}else{

		tmp[i]=c[i+1];

		}
	}return tmp;

	}
		
 }

