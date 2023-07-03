import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 패널은 각 컴포턴트들을 그룹화 해서 배치하는  컨테이너 즉 레이아웃의 일종. AWT나 스윙을 사용해서  각 그림 개체들을 배치할떄 패널도 그룹화해서 프레임윈도우에 배치해야 효과적으로 배치할 수 있다. 

class FrameEvent05 extends Frame{
	Panel pan01,pan02,pan03;
	
	public FrameEvent05() {
		//각 패널 객체 생성
		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();
		
		// 각 패널 배경색 지정
		pan01.setBackground(Color.orange);
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.red);
		
		add(BorderLayout.NORTH,pan01); // 첫번쨰 패널을 프레임 윈도우 북쪽에 배치
		add(BorderLayout.CENTER,pan02);
		add(BorderLayout.SOUTH,pan03);
		
		// 각 패널에 버튼 배치
		pan01.add(new Button("Button01"));
		pan01.add(new Button("Button02"));
		
		pan02.add(new Button("Button03"));
		
		pan03.add(new Button("Button04"));
		pan03.add(new Button("Button05"));
		
		setSize(300,130); // 
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}//생성자
}
public class UiTest05 {
	public static void main(String[] args) {
		new FrameEvent05();
	}
}
