import java.awt.Frame;
import java.awt.event.WindowAdapter;

// AWT를 사용한 ui그리기와 종료
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class FrameEvent01 extends Frame{
	public FrameEvent01() {
		super("Frame Window"); //조상 클래스 오버로딩 된 생성자 호출
		setSize(300,200);// 프레임 폭을 300, 높이를 200으로 지정
		setVisible(true);// 프레임 윈도우 보이기
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); //닫기
				System.exit(0); //프레임 윈도우 종료
				
			}// 현재 프레임 윈도우 닫기 했을 때 호출
		}); //익명 클래스 문법으로 이벤트처리 -> 외부클래스 번호 $번호.class 로 컴파일된다. (FrameEvent01$1.class)
			// add + 이벤트리스너 인터페이스이름(); 이 이벤트 등록 메서드이다.
	}//생성자 정의
}

public class UiTest01 {
	public static void main(String[] args) {
		
		new FrameEvent01(); //생성자 호출
	}
}
