
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;


public interface LibroInterface {
//	@GET("libro/{id}")
//	Call<List<Libro>> getListaLibro (@Path("id") int id);

	//Lista de libros
	@GET("libro")
	Call<List<Libro>> getListaLibro();

	//realizar peticiçión de único libro
	@GET("libro/{id}")
	Call<Libro> getLibro (@Path("id") int id);

	@POST ("libro")
	Call<Libro> crearLibro (@Body Libro libro);

	@PUT("libro")
	Call<Libro> actualizarLibro(@Body Libro libroNuevo);

	@DELETE("libro/{id}")
	Call<Void> borrarLibro(@Path("id") int id);
//
//	//Falta interfaz
//	@PUT("libro")
//	Call<Libro> actualizarLibro (@Body Libro libro);

//	@GET("libro/{numpag}")
//	Call<Libro> getNumpag (@Path("numpag") String numpag);


}
