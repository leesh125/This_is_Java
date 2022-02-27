package chap17.sec07.exam04_mediaview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable{
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPaused;
	@FXML private Button btnStop;
	
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
		});
		
		mediaPlayer.setOnStopped(()->{
			btnPlay.setDisable(false);
			btnPaused.setDisable(true);
			btnStop.setDisable(true);
		});
		
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
