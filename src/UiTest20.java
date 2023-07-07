import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 한줄 입력 박스 만드는 스윙 텍스트 필드



public class UiTest20 extends JFrame{
	private JButton button;
	private JTextField text,result;
	// JTextField 스윙 컴포넌트는 한줄 입력필드를 만든다.
	
	public UiTest20() {
		setSize(300, 130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트 처리 객체 생성
		ButtonListener2 listener = new ButtonListener2();
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력: ")); 
		text = new JTextField(15); //생성자 인자값 15는 입력박스 길이
		text.addActionListener(listener); //텍스트 필드 이벤트 등록
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값: "));
		result = new JTextField(15);
		result.setEditable(false); //텍스트 필드 수정불가
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener); //버튼이벤트 등록
		panel.add(button);
		
		add(panel); //스윙 프레임 윈도우에 패널 추가
		setVisible(true);
		
	}// 생성자
	
	// 내부 클래스 문법으로 이벤트 처리 클래스 생성 -> 외부클래스$내부클래스.class(UiTest20$ButtonListener2.class);
	private class ButtonListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == text) {
				String name = text.getText(); //텍스트 필드에 입력한 숫자값을 문자열로 구함.
				int value = Integer.parseInt(name); // 정수 숫자로 변경해서 구함.
				result.setText(" " + value * value); //거듭제곱을 구해서 문자열로 변경해서 설정
				text.requestFocus(); //텍스트 필드에 포커스 이동 
			}
		}// 이벤트 발생했을 떄 호출
	}
	public static void main(String[] args) {
		new UiTest20();
	}
}















