package greetingprogram;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GreetingProgramFXMLController implements Initializable {
    @FXML 
    private TextField nameTextField;
    @FXML
    private Button greetingButton; 
    @FXML
    private void showGreeting(ActionEvent event) {
        String text = nameTextField.getText();
        if(!text.equals("")){
            Alert greetingAlert = new Alert(AlertType.INFORMATION);
            greetingAlert.setTitle("Powitanie");
            int hour = LocalTime.now().getHour();
            if(hour > 6 && hour < 18) greetingAlert.setHeaderText("Dzień dobry " + text);
            else greetingAlert.setHeaderText("Dobry wieczór " + text);
            greetingAlert.showAndWait();
        }else{
            Alert informationAlert = new Alert(AlertType.INFORMATION);
            informationAlert.setTitle("Brak imienia");
            informationAlert.setHeaderText("Nie podałeś imienia.");
            informationAlert.showAndWait();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
