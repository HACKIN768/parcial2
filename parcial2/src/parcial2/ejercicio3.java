package parcial2;

public class ejercicio3 {
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public void libro(String ISB, String titulo, String autor, int numPaginas, String ISBN) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public String getISBN () {
		return ISBN;
	}
	
	public void setISBN(String ISBN0, String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    public String getAutor() {
    	return autor;
    }
    
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    
    public int getNumPaginas() {
    	return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas) {
    	this.numPaginas = numPaginas;
    }
    public String toString() {
    	return "El libro  con ISBN" + ISBN + "Creado por" + autor + "tiene" + numPaginas + "paginas.";
    
		
	}
}
   
