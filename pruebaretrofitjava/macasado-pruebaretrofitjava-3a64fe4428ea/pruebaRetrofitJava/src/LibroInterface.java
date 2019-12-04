package pruebaRetrofitJava;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;



public interface LibroInterface {
	@GET("libro/{id}")
	Call<Libro> getLibro (@Path("id") int id);

	//realizar petición de título de libro
	@GET("libro/{titulo}")
	Call<Libro> getTitulo (@Path("titulo") String titulo);

	@GET("libro/{numpag}")
	Call<Libro> getNumpag (@Path("numpag") String numpag);

	//Falta interfaz
	@POST ("libro")
	Call<Libro> crearLibro (@Body Libro libro);

	//Falta interfaz
	@PUT ("libro")
	Call<Libro> actualizarLibro (@Part Libro libro);


}
