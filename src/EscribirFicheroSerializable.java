import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirFicheroSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		int departamento[]= {1,2,3};
		String nombre[]= {"ventas","compras","informatica"};
		String localidad[]= {"valdepeñas","manzanares","infantes"};
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("departamentos.dat"));
		
		for (int i = 0; i < departamento.length; i++) {
			Atributos atributos = new Atributos(departamento[i],nombre[i],localidad[i]);
			oos.writeObject(atributos);
		}
		oos.close();
	}
	
}
