package chap17.sec07.exam03_view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.setItems(FXCollections.observableArrayList(
			"갤럭시S1","갤럭시S2","갤럭시S3","갤럭시S4","갤럭시S5","갤럭시S6"
		));
		listView.getSelectionModel().selectedIndexProperty().addListener(
				new ChangeListener<Number>() {
					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldaValue, Number newValue) {
						tableView.getSelectionModel().select(newValue.intValue());
						tableView.scrollTo(newValue.intValue());
					}
				}
			);
		
		ObservableList phoneList = FXCollections.observableArrayList(
					new Phone("갤럭시S1", "11223659_969010503157601_4319241685982588557_n.jpg"),
					new Phone("갤럭시S2", "11223659_969010503157601_4319241685982588557_n.jpg"),
					new Phone("갤럭시S3", "11223659_969010503157601_4319241685982588557_n.jpg"),
					new Phone("갤럭시S4", "11223659_969010503157601_4319241685982588557_n.jpg"),
					new Phone("갤럭시S5", "11223659_969010503157601_4319241685982588557_n.jpg"),
					new Phone("갤럭시S6", "11223659_969010503157601_4319241685982588557_n.jpg")
				);
		
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartphone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");
		
		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER;");
		
		tableView.setItems(phoneList);
		
		tableView.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<Phone>() {
				@Override
				public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
					if(newValue!=null) {
						imageView.setImage(new Image(
								getClass().getResource("images/" + newValue.getImage()).toString()));
					}
				}
			}
			);
		
	}
	
	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView 스마트폰: " + item);
		
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView 스마트폰: " + phone.getSmartPhone());
		System.out.println("TableView 이미지: " + phone.getImage());
	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
	
}
