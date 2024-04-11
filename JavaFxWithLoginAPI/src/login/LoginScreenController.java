package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.RestUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController {
	
	@FXML
	private Button loginButton;
	
	@FXML
	private TextField studentEmail;
	
	@FXML
	private TextField studentPassword;
	
		@FXML
	private Label loginErrorMessage;
	
	public void login(ActionEvent event) throws Exception {
		
		String url = "http://localhost:8081/api/v1/public/auth/validate";

		String jsonRequestAsString = "{\n"
        		+ "    \"username\": \""+studentEmail.getText()+"\",\n"
        		+ "    \"password\": \""+studentPassword.getText()+"\"\n"
        		+ "}";

		String response = RestUtil.sendPostRequest(url,jsonRequestAsString) ;
		
		if(response.contains("Success"))
			HomePage.show();
		else
			loginErrorMessage.setText("Login failed, check username and password");
		
	}
}
