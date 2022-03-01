package chap17.sec11.exam03_task_callback;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable{
	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Label lblResult;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	private Task<Integer> task;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnStart.setOnAction(event->handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
	}

	private void handleBtnStart(ActionEvent event) {
		task = new Task<Integer>() {
			@Override
			protected Integer call() throws Exception {
				int result = 0;
				for(int i=0; i<=100; i++) {
					if(isCancelled()) {
						updateMessage("취소됨");
						break;
					}
					result += i;
					updateProgress(i,100);
					updateMessage(String.valueOf(i));
					try { Thread.sleep(100); } catch(Exception e) {
						updateMessage("취소됨");
						break;
					}
				}
				return result;
			}
			
			// 상태별 콜백 메소드
			@Override
			protected void succeeded() {
				lblResult.setText(String.valueOf(getValue()));
			}
			
			@Override
			protected void cancelled() {
				lblResult.setText("취소됨");
			}
			
			@Override
			protected void failed() {
				lblResult.setText("실패");
			}
		};
		
	
		
		progressBar.progressProperty().bind(task.progressProperty());
		lblWorkDone.textProperty().bind(task.messageProperty());
		lblResult.setText("");
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}

	private void handleBtnStop(ActionEvent event) {
		task.cancel(); // break 시키기
	}
	

}

