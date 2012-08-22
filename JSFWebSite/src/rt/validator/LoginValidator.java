package rt.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class LoginValidator implements Validator {
	public void validate(FacesContext context, UIComponent component,
		      Object value) throws ValidatorException {
		    String user = (String) value;
		    
		    if (!user.equalsIgnoreCase("tester")&&!user.equalsIgnoreCase("tester1")) {
		      FacesMessage message = new FacesMessage();
		      message.setDetail("User " + user + " does not exist");
		      message.setSummary("The User does not exist.");
		      message.setSeverity(FacesMessage.SEVERITY_ERROR);
		      throw new ValidatorException(message);
		    }
		  }

}
