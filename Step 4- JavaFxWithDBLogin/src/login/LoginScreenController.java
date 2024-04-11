package login;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBOperations;
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
	
	public void login(ActionEvent event) throws SQLException, IOException {
		
		String query = "select * from users where login_name='"+studentEmail.getText()+"' and password='"+studentPassword.getText()+"'";
		ResultSet rs = DBOperations.executeQueryToGetResult(query);
		
		if(getResultSetCount(rs)==1)
			HomePage.show();
		else
			loginErrorMessage.setText("Login failed, check username and password");
		
	}
	
	private static int getResultSetCount(ResultSet rs) throws SQLException
	{
		int rowCount=0;
		while(rs.next())
		{
			rowCount=rowCount+1;
		}
		return rowCount;
	}

}
