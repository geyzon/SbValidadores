package bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectOne;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named /* Indica que esta classe se trata de um CDI Beans */
@SessionScoped /* Depois de requisitado, pode ser destruído */
public class DocBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipo;
	
	public String getTipo () {
		return tipo;
	}
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public void processar() {
		
	}
	public void validarDocumento (FacesContext context, UIComponent comp, Object value) throws ValidatorException {
		UISelectOne tipoInput = (UISelectOne) comp.findComponent("tipoDoc");
		UIInput numInput = (UIInput) comp.findComponent("numDoc");
		
		TipoDoc tipoDoc = (TipoDoc) tipoInput.getLocalValue();
		String numDoc = (String) numInput.getLocalValue();
	}
}
