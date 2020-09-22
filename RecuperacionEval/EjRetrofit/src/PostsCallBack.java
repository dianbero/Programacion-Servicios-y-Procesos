import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class PostsCallBack implements Callback<Post> {

    @Override
    public void onResponse(Call<Post> call, Response<Post> response) {
        Post post;
        String contentType;
        int codigo;
        String mensaje;
        boolean exito;

        post = response.body(); //Cuerpo de la respuesta, el objeto que devuelve en json

        Headers cabeceras = response.headers();
        contentType = cabeceras.get("Content-Type");
        codigo = response.code();
        mensaje = response.message();
        exito = response.isSuccessful();

        System.out.println("Código: " + codigo + " \nMensaje: " + mensaje + " \nEs éxito: " + exito +"\n\n");

        //Muestra datos del objeto recibido
        System.out.println(post.toString());



    }

    @Override
    public void onFailure(Call<Post> call, Throwable throwable) {
        System.out.print("Se produjo un error");
    }
}
