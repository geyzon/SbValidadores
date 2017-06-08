package bean;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectOne;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named /* Indica que esta classe se trata de um CDI Beans */
@SessionScoped /* Depois de requisitado, pode ser destruído */
public class LivroBean implements Serializable {

	private static final long serialVersionUID = 1L;	
	private String titulo;
	private Date dataPublicacao;
	private Integer numPaginas;
	private Double preco;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public Integer getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}	
	public void cadastra(){
		System.out.println("Envio correto!");
		this.setTitulo(titulo);
		this.setDataPublicacao(dataPublicacao);
		this.setNumPaginas(numPaginas);
		this.setPreco(preco);
	}
	
	public void validarDocumento(FacesContext context, UIComponent comp, Object value) throws ValidatorException {
		UISelectOne tipoInput = (UISelectOne) comp.findComponent("tipoDoc");
		UIInput numInput = (UIInput) comp.findComponent("numDoc");
		
		TipoDoc tipoDoc = (TipoDoc) tipoInput.getLocalValue();
		String numDoc = (String) numInput.getLocalValue();
	}
}
