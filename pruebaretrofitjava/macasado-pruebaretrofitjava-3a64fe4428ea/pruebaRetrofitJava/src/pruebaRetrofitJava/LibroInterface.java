package pruebaRetrofitJava;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface LibroInterface {
	@GET("/api/v1/libro/{id}")
	Call<Libro> getLibro (@Path("id") int id);

	//Modificado por Diana

	//realizar petición de título de libro
	@GET("/api/v1/libro/{titulo}")
	Call<Libro> getTitulo (@Path("titulo") String titulo);


}
