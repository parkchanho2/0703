import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 첫번쨰 이벤트 처리 예제

class FrameEvent06 extends Frame{
	Button redbtn, bluebtn;
	
	public FrameEvent06() {
		setLayout(new FlowLayout()); //플로우 레이아웃 배치관리자 설정
		
		redbtn = new Button("Red Color");
		bluebtn = new Button("Blue Color");
		add(redbtn); add(bluebtn); //프레임 윈도우에 각 버튼 추가
		redbtn.setFont(new Font("궁서체",Font.BOLD|Font.ITALIC,25));
		//버튼 위에 출력되는 글꼴을 궁서체, 진하게 |기울임, 글자크기를 25로 지정
		
		ButtonListener handler = new ButtonListener(); // 이벤트 처리 객체 생성
		
		//각 버튼 이벤트 등록
		redbtn.addActionListener(handler);  //add + 이벤트 리스너 인터페이스이름(); 이 이벤트 등록 메서드
		bluebtn.addActionListener(handler); 
		
		setSize(300,200); setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}

class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("각 버튼이 클릭되었다.");
	}// 버튼을 클릭할 때 호출 
	
}
public class UiTest06 {
	public static void main(String[] args) {
		new FrameEvent06();
	}
}
