import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BorrarLibroCallBack implements Callback<Void> {
    @Override
    public void onResponse(Call<Void> call, Response<Void> response) {
        int code;
//        String message;
        code = response.code();
        System.out.println("Libro con codigo: " + code + " eliminado");

    }

    @Override
    public void onFailure(Call<Void> call, Throwable throwable) {
        int i = 0;
    }
}
