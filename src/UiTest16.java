import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// jdk 1.8에서 추가된 수학 함수형 언어인 람다식 문법으로 이벤트 처리 예제

class MyFrame16 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame16() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("람다식 이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼 클릭");
		label = new JLabel("아직 버튼이 클릭되지 않았습니다.");
		
		button.addActionListener(e -> {
			label.setText("드디어 버튼이 클림됨.");
		}); // 람다식으로 버튼이 이벤트 처리
		
		panel.add(button);
		panel.add(label);
		
		add(panel);
		setVisible(true);
		
	}
}
public class UiTest16 {
	public static void main(String[] args) {
		new MyFrame16();
	}
}
