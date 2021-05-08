import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Resta {
	public void AddFraction(int num0, int den0, int num1, int den1){
		int MCM, totalNum;

		  num0 = num0*den1;
		  num1 = num1*den0;
		  totalNum = num0-num1;
		  MCM = den0*den1;
		  JOptionPane.showMessageDialog(null, "LA RESTA: "+totalNum+"/"+MCM,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		

		  try {
		      File myObj = new File("Resultados_Resta.txt");
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
		      FileWriter myWriter = new FileWriter("Resultados_Resta.txt");
		      myWriter.write(totalNum+"/"+MCM);
		      myWriter.close();
		      System.out.println("Se guard� el resultado.");
		    } catch (IOException e) {
		      System.out.println("No se pudo guardar.");
		      e.printStackTrace();
		    }
		  
	}


}