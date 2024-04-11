package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {
	
	@FXML
	private Button loginButton;
	
	@FXML
	private TextField studentEmail;
	
	@FXML
	private TextField studentPassword;
	
	public void login(ActionEvent event) {
		System.out.println("Button clicked");
		
		System.out.println(studentEmail.getText());
		System.out.println(studentPassword.getText());
	}

}
