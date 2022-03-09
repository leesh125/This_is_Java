package chap19.sec05.exam01_asynchronous_filechannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelReadExample {

	public static void main(String[] args) throws Exception {
		// 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		for(int i=0; i<10; i++) {
			Path path = Paths.get("C:/Temp/file" + i + ".txt");
			
			// 비동기 파일 채널 생성
			AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
				path,
				EnumSet.of(StandardOpenOption.READ),
				executorService
			);
			
			// 파일의 크기와 동일한 capacity를 갖는 버퍼 생성
			ByteBuffer byteBuffer = ByteBuffer.allocate((int)fileChannel.size());
			
			// 첨부 객체 생성
			class Attachment{
				Path path; // 파일 경로 저장
				AsynchronousFileChannel fileChannel; // 비동기 파일 채널 저장
				ByteBuffer byteBuffer; // 읽은 데이터를 저장할 버퍼
			}
			Attachment attachment = new Attachment();
			attachment.path = path;
			attachment.fileChannel = fileChannel;
			attachment.byteBuffer = byteBuffer;
			
			// CompletionHandler 객체 생성
			CompletionHandler<Integer, Attachment> completionHandlernew	 = 
					new CompletionHandler<Integer, Attachment>() {

						@Override
						public void completed(Integer result, Attachment attachment) {
							attachment.byteBuffer.flip();
							// 버퍼에 저장된 데이터를 문자열로 복원
							Charset charset = Charset.defaultCharset();
							String data = charset.decode(attachment.byteBuffer).toString();
							
							System.out.println(attachment.path.getFileName() + " : " + data +
										" : " + Thread.currentThread().getName());
							try {
								fileChannel.close();
							} catch (IOException e) {}
							
						}

						@Override
						public void failed(Throwable exc, Attachment attachment) {
							exc.printStackTrace();
							try {
								fileChannel.close();
							} catch (IOException e) {}
						}

						
						
					};
					
			fileChannel.read(byteBuffer, 0, attachment, completionHandlernew);
								
		}
		
		// 스레드풀 종료
		executorService.shutdown();
	}

}
