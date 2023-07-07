import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// 스윙 버튼 이벤트 처리 예제

class MyFrame14 extends JFrame implements ActionListener{

	private JButton button;
	private JLabel label;
	
	public MyFrame14() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("스윙 이벤트 예제 01");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 클릭되지 않았습니다.");
		button.addActionListener(this); // 버튼 이벤트 등록
		panel.add(button);
		panel.add(label); //패널에 버튼과 라벨 추가
		
		add(panel); //스윙 프레임 윈도우에 패널 추가
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) { //getSource 메소드는 이벤트 발생 소스 객체를 구함
			label.setText("마침내 버튼이 클릭 되었습니다."); //라벨에 문자 설정
			
		}
	}
}

public class UiTest14 {
	public static void main(String[] args) {
		new MyFrame14();
	}
}
