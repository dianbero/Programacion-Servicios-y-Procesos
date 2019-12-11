

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;





/***************************************
 * SE PUEDEN DESCARGAR JARS DE CONVERTIDORES DE AQUÍ:
 * http://search.maven.org/
 * 
 * Por ejemplo:
 * http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.squareup.retrofit2%22
 * 
 * Si usamos gradle, simplemente añadiríamos la dependencia:
 * com.squareup.retrofit2:converter-gson/home/migue/Descargas/converter-gson-2.1.0.jar
 *
 */



public class Principal {
	
//	private final static String SERVER_URL = "http://lumenrest.dev";
	private final static String SERVER_URL = "http://biblioteca.devel:8080/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retrofit retrofit;
		ListaLibrosCallback listaLibrosCallback = new ListaLibrosCallback();
		PostLibro postLibro = new PostLibro();
		UnicoLibroCallBack unicoLibroCallBack = new UnicoLibroCallBack();

		retrofit = new Retrofit.Builder()
							   .baseUrl(SERVER_URL)
							   .addConverterFactory(GsonConverterFactory.create())
							   .build();
		
		LibroInterface libroInter = retrofit.create(LibroInterface.class);

		//Nuevo libro
		Libro libro = new Libro();

		libroInter.getLibro(1).enqueue(unicoLibroCallBack);
		libroInter.crearLibro(libro).enqueue(postLibro);






		//TODO revisar
//		libroInter.getListaLibro(1).enqueue(listaLibrosCallback);


//		libroInter.getTitulo().enqueue(libroCallback);

//		libroInter.crearLibro().enqueue(libroCallback);


		

	}


	


}