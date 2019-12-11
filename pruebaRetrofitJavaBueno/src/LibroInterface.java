
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;


public interface LibroInterface {
//	@GET("libro/{id}")
//	Call<List<Libro>> getListaLibro (@Path("id") int id);
	@GET("libro/{id}")
	Call<List<Libro>> getListaLibro (@Path("id") int id);

	//realizar peticiçión de único libro
	@GET("libro/{id}")
	Call<Libro> getLibro (@Path("id") int id);

//	@GET("libro/{numpag}")
//	Call<Libro> getNumpag (@Path("numpag") String numpag);
//
	//Falta interfaz //TODO ver como se hace
	@POST ("libro")
	Call<Libro> crearLibro (@Body Libro libro);
//
//	//Falta interfaz
//	@PUT("libro")
//	Call<Libro> actualizarLibro (@Body Libro libro);


}
