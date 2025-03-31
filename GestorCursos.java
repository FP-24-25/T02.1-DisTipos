package fp.tipos.cursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import fp.utiles.Checkers;

public class GestorCursos {

	private String nombre;
	private String url;
	private List<CursoOnLine> cursos;
	
	public GestorCursos(String nombre, String url) {
		Checkers.checkNoNull(nombre);
		this.nombre = nombre;
		setUrl(url);
		this.cursos= new ArrayList<>();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		Checkers.check("url no válida", url.startsWith("http") || url.startsWith("https"));
		this.url = url;
	}

	public String getNombre() {
		return nombre;
	}

	public List<CursoOnLine> getCursos() {
		return new ArrayList<>(cursos);
	}
	
	public void agregaCurso(CursoOnLine c) {
		if (c!= null) {
			cursos.add(c);
		}
	}
	public void eliminaCurso(CursoOnLine c) {
		if (c!= null) {
			cursos.add(c);
		}
	}
	
	public void agregaCursos(Collection<CursoOnLine> cursos) {
		for (CursoOnLine c: cursos ) {
			agregaCurso(c);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof GestorCursos))
			return false;
		GestorCursos other = (GestorCursos) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(url, other.url);
	}
	
	@Override
	public String toString() {
		String res = getNombre() ;
		if (getUrl()!= null) {
			res+= " (" + getUrl() + ") ";
		}
		return res + " - " + cursos.size() + " cursos";
	}
}
