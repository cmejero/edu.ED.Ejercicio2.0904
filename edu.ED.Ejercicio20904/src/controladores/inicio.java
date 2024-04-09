package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {

		String rutaArchivo = "C:\\Users\\Carlos\\Desktop\\Cs1\\ENTORNO\\ficheros\\Ejercicio20904.txt";
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un mensaje");
		String mensaje = sc.nextLine();

		try {
			FileWriter fw = new FileWriter(rutaArchivo);
			fw.write(mensaje);
			fw.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}
	}

};