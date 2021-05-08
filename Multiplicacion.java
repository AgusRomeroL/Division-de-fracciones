import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Multiplicacion {

	public void AddFraction(int num0, int den0, int num1, int den1){

		  int totalNum, totalDen;

		  totalNum = num0*num1;
		  totalDen = den0*den1;
		  System.out.println(totalNum + "/" + totalDen);
		  
		  try {
		      File myObj = new File("Resultados_Multiplicacion.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("Se creo: " + myObj.getName());
		      } else {
		        System.out.println("Ya existe el archivo.");
		      }
		    } catch (IOException e) {
		      System.out.println("No se pudo crear el archivo.");
		      e.printStackTrace();
		    }
		
		try {
		      FileWriter myWriter = new FileWriter("Resultados_Multiplicacion.txt");
		      myWriter.write(totalNum+"/"+totalDen);
		      myWriter.close();
		      System.out.println("Se guardó el resultado.");
		    } catch (IOException e) {
		      System.out.println("No se pudo guardar.");
		      e.printStackTrace();
		    }

		}
	
}