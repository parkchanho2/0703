import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* 플로우 레이아웃 배치관리자 */

class FramEvent02 extends Frame{
	public FramEvent02() {
		setLayout(new FlowLayout()); // 플로우 레이아웃 배치관리자 설정
		// 플로우 레이아웃은 각 컴퍼넌트(컨테이너에 배치되는 각 그림 개체)가 컨테이너 (레이아웃)에 배치될 때 위에서 아래로
		// 좌에서 우로 물흐르듯 자연스럽게 배치된다.
		
		add(new Button("Button 01")); //프레임 윈도에 버튼 객체 추가
		add(new Button("Button 02")); 
		add(new Button("Button 03")); 
		add(new Button("Button 04")); 
		add(new Button("Button 05")); 
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
				System.exit(0);
			}
			
		}); //내부 무명 클래스 문법으로 이벤트처리 => 이벤트 등록 메서드
	}// 생성자 
}


public class UiTest02 {
	public static void main(String[] args) {
		new FramEvent02();
	}
}
