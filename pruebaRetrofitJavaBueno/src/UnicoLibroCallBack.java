import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class UnicoLibroCallBack implements Callback<Libro> {


    @Override
    public void onResponse(Call<Libro> call, Response<Libro> response) {

        Libro libro;
        String contentType;
        int code;
        String message;
        boolean isSuccesful;

	    libro = response.body();

        Headers cabeceras = response.headers();
        contentType = cabeceras.get("Content-Type");
        code = response.code();
        message = response.message();
        isSuccesful = response.isSuccessful();

	System.out.println(libro.getId()+" "+libro.getTitulo()+" "+libro.getNumpag());
    }

    @Override
    public void onFailure(Call<Libro> call, Throwable throwable) {
        int i = 0;
    }
}
