import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// javax.swing 패키지의 스윙 api로 ui 그리기)
// 스윙 프레임 윈도우에 스윙 버튼을 배치

class FrameEvent10 extends JFrame{ //AWT Frame에 영문 대문자 J가 붙어서 JFrame이 되면 스윙 프레임윈도우가 된다.
	public FrameEvent10() {
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 프레임 윈도우 닫기
		setTitle("스윙 프레임 윈도우 그리기 ");  // 스윙 프레임 윈도우 제목설정
		
		setLayout(new FlowLayout()); //플로우 레이아웃 배치관리자 설정
		JButton btn = new JButton("버튼");
		this.add(btn); //프레임 윈도우 버튼추가 this.생략가능
		
		setVisible(true);
	}
	
}
public class UiTest10 {
	public static void main(String[] args) {
		new FrameEvent10();
	}
}
