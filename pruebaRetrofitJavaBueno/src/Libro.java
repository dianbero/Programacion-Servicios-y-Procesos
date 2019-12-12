

public class Libro {
	private int id;
	//private String createdAt;
	//private String updatedAt;
	private String titulo;
	private String numpag;

	public Libro(){
		this.id = 0;
		this.titulo = "Título Por defecto";
		this.numpag = "123";
	}
	//Sin id para post y put
	public Libro(String titulo, String numpag){
		this.titulo = titulo;
		this.numpag = numpag;
	}

	public Libro(int id, String titulo, String numpag){
		this.id = id;
		this.titulo = titulo;
		this.numpag = numpag;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumpag() {
		return numpag;
	}
	public void setNumpag(String numpag) {
		this.numpag = numpag;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
//	public String getCreatedAt() {
//		return createdAt;
//	}
//	public void setCreatedAt(String createdAt) {
//		this.createdAt = createdAt;
//	}
//	public String getUpdatedAt() {
//		return updatedAt;
//	}
//	public void setUpdatedAt(String updatedAt) {
//		this.updatedAt = updatedAt;
//	}
	
	

}
