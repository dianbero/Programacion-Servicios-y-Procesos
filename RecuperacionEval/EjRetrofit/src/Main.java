import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Main {
    private final static String SERVER_URL = "http://jsonplaceholder.typicode.com";

    public static void main(String[] args) {

        PostsCallBack postsCallBack = new PostsCallBack();

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IPost iPost = retrofit.create(IPost.class);

        //Realiza petición para obtener post según su id
        iPost.getPost(4).enqueue(postsCallBack);


    }

}
