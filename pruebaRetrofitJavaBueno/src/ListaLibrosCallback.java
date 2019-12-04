
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import okhttp3.Headers;

import java.util.List;


public class ListaLibrosCallback implements Callback<List<Libro>>{

	@Override
	public void onFailure(Call<List<Libro>> arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		int i;

		i=0;
	}

	@Override
	public void onResponse(Call<List<Libro>> arg0, Response<List<Libro>> resp) {
		// TODO Auto-generated method stub
		
//	Libro libro;
	String contentType;
	int code;
	String message;
	boolean isSuccesful;
	//TODO hacer list para recoger array
		List<Libro> listaLibros;
		listaLibros = resp.body();
//	libro = resp.body();
	
	Headers cabeceras = resp.headers();
	contentType = cabeceras.get("Content-Type");
	code = resp.code();
	message = resp.message();
	isSuccesful = resp.isSuccessful();
	
//	System.out.println(libro.getId()+" "+libro.getTitulo()+" "+libro.getNumpag());
	System.out.println(listaLibros.get(0).getId()+" "+listaLibros.get(0).getTitulo()+" "+ listaLibros.get(0).getNumpag());

	if(listaLibros.isEmpty()){
		System.out.printf("No funciona, o no tiene nada");
	}else {
		System.out.println(listaLibros.get(0).getId()+" "+listaLibros.get(0).getTitulo()+" "+ listaLibros.get(0).getNumpag());
	}

	}



}
