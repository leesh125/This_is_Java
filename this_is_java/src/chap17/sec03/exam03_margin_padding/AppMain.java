package chap17.sec03.exam03_margin_padding;



import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// 패딩 설정
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(50,10,10,50));
		  Button button = new Button();
		  button.setPrefSize(100, 100);
			/*
			 * // 마진 설정 HBox hbox = new HBox(); Button button = new Button();
			 * button.setPrefSize(100, 100); HBox.setMargin(button, new
			 * Insets(10,10,50,10));
			 * 
			 */
		hbox.getChildren().add(button);
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		// Application이 갖고있는 정적 메소드
		launch(args); 
	}

	

}
