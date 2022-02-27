package chap17.sec07.exam01_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;
	@FXML private Button btnExit;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass().getResource("images/" + 
								newValue.getUserData().toString() + ".jpg").toString());
				radioImageView.setImage(image);
				
			}
		});
	}
	
	public void handleBtnChkAction(ActionEvent e) {
		if(chk1.isSelected() && chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/11223659_969010503157601_4319241685982588557_n.jpg").toString())); 
		}else if(chk1.isSelected()){
			checkImageView.setImage(new Image(getClass().getResource("images/11223659_969010503157601_4319241685982588557_n.jpg").toString()));
		}else if(chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("images/12189963_189467861391711_627777799110954031_n.jpg").toString()));
		}else {
			checkImageView.setImage(new Image(getClass().getResource("images/11223659_969010503157601_4319241685982588557_n.jpg").toString()));
		}
	}
	
	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}
}
