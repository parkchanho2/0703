import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 보더 레이아웃 배치관리자 

class FrameEvent03 extends Frame{
	public FrameEvent03(){
		setLayout(new BorderLayout()); //보더 레이아웃 배치관리자 설정
		
		add(new Button("Button 01"), "North"); //프레임 윈도우 북쪽에 버튼 추가
		add(new Button("Button 02"), "West"); //프레임 윈도우 서쪽에 버튼 추가
		add(new Button("Button 03"), "Center"); //프레임 윈도우 중앙에 버튼 추가
		add(new Button("Button 04"), "East"); //프레임 윈도우 동쪽에 버튼 추가
		add(new Button("Button 05"), "South"); //프레임 윈도우 남쪽에 버튼 추가
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				
			}
			
		});
	}// 생성자
}

public class UiTest03 {
	public static void main(String[] args) {
		new FrameEvent03();
	}
}
