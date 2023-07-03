import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent09 extends Frame{
	public FrameEvent09() {
		
		super("FrameWindow Closing"); // 프레임 윈도우 제목 설정
		
		setSize(600,400);
		setVisible(true);
		
		addWindowListener(new EventHandler()); //프레임 윈도우 이벤트 등록
	} // 생성자 
	  // 내부클래스로 이벤트를 처리 -> 외부 클래스명 $내부클래스명.class(FrameEvent09$EventHandler.class)
	class EventHandler extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}//프레임 윈도우 닫기 화면 출력
	}
}
public class UiTest09 {
	public static void main(String[] args) {
		new FrameEvent09();
	}
}
