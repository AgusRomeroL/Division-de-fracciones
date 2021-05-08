import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Division {

	public void AddFraction(int num0, int den0, int num1, int den1){
		  int totalNum, totalDen;

		  totalDen  = den0*num1;
		  totalNum  = num0*den1;
		  JOptionPane.showMessageDialog(null, "LA DIVISION: "+totalNum+"/"+totalDen,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		  
			try {
			      File myObj = new File("Resultados_Division.txt");
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
			      FileWriter myWriter = new FileWriter("Resultados_Division.txt");
			      myWriter.write(totalNum+"/"+totalDen);
			      myWriter.close();
			      System.out.println("Se guardó el resultado.");
			    } catch (IOException e) {
			      System.out.println("No se pudo guardar.");
			      e.printStackTrace();
			    }
		
	}

}