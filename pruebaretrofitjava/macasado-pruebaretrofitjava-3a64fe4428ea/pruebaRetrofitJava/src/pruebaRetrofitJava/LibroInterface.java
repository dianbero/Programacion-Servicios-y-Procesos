package pruebaRetrofitJava;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;



public interface LibroInterface {
	@GET("/libro/{id}")
	Call<Libro> getLibro (@Path("id") int id);

	//realizar petición de título de libro
	@GET("/api/v1/libro/{titulo}")
	Call<Libro> getTitulo (@Path("titulo") String titulo);

	@GET("api/v1/libro/{numpag}")
	Call<Libro> getNumpag (@Path("numpag") String numpag);

	@POST ("/libro")
	Call<Libro> crearLibro (@Body Libro libro);



}
