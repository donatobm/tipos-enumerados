import java.util.*;
public class enumerado {


	enum lenguajes{

		PYTHON(".py"), JAVA(".java"), JAVASCRIPT(".js"), PHP(".php");

		private lenguajes(String extension){
			this.extension = extension;
		}

		public String Ext(){
			return extension;
			}

		private String extension;
		}


	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.println("Escriba un lenguaje de programacion para ver su extension: PYTHON, JAVA, JAVASCRIPT, PHP. \n");
		String inp = in.next().toUpperCase();

		lenguajes len=Enum.valueOf(lenguajes.class,inp);

		System.out.println("Lenguaje :"+len);
		System.out.println("Extension: "+len.Ext());

		}



	}