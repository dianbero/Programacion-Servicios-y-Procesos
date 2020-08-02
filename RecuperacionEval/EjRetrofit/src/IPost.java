import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IPost {

    @GET("/posts/{id}")
    Call<Post> getPost(@Path("id") int id);

//    @POST("/posts/")
//    Call<Post> crearPost(@Body Post post);


}
