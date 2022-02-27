package chap17.sec07.exam05_slider_progressbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable{
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPaused;
	@FXML private Button btnStop;
	
	@FXML private ProgressBar progressBar;
	@FXML private Label labelTime;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Slider sliderVolume;
	
	
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Media media = new Media(getClass().getResource("media/video.mv4").toString());
		
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				btnPlay.setDisable(false);
				btnPaused.setDisable(true);
				btnStop.setDisable(true);
				if(mediaPlayer.isAutoPlay()) {
					mediaView.setVisible(false);
				}
				
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
					@Override
					public void changed(ObservableValue<? extends Duration> arg0, Duration arg1, Duration arg2) {
						double progress = mediaPlayer.getCurrentTime().toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						labelTime.setText(
							(int) mediaPlayer.getCurrentTime().toSeconds() + "/" +
							(int) mediaPlayer.getTotalDuration().toSeconds() + " sec"
						); 
						
						
					}
				});
			}
		});
		
		mediaPlayer.setOnPlaying(()->{
			btnPlay.setDisable(true);
			btnPaused.setDisable(false);
			btnStop.setDisable(false);
		});
		
		mediaPlayer.setOnPaused(()->{
			btnPlay.setDisable(false);
			btnPaused.setDisable(true);
			btnStop.setDisable(false);
		});
		
		mediaPlayer.setOnEndOfMedia(()->{
			endOfMedia = true;
			btnPlay.setDisable(false);
			btnPaused.setDisable(true);
			btnStop.setDisable(true);
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
		});
		
		mediaPlayer.setOnStopped(()->{
			btnPlay.setDisable(false);
			btnPaused.setDisable(true);
			btnStop.setDisable(true);
		});
		
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
			}
		});
		
		sliderVolume.setValue(50.0);
		
		btnPlay.setOnAction(event->{
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
			}
			mediaPlayer.play();
			endOfMedia = false;
		});
		
		btnPaused.setOnAction(event->mediaPlayer.pause());
		btnStop.setOnAction(event->mediaPlayer.stop());
		
	}
	
	
}
