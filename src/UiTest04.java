import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 그리드 레이아웃 배치관리자

class FrameEvent04 extends Frame{
	public FrameEvent04() {
		setLayout(new GridLayout(3,2)); // 3행 * 2열의 그리드 레이아웃 배치관리자 설정
		
		add(new Button("Button 01"));
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
				
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); 
				System.exit(0);
			}
			
		});
	}//생성자
}
public class UiTest04 {
	public static void main(String[] args) {
		new FrameEvent04();
	}
}
