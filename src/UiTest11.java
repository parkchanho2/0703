import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 스윙으로 텍스트 입력필드 만들기

public class UiTest11 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("온도 변환기"); //프레임 제목 설정
		JPanel panel = new JPanel(); // 스윙 패널은 각 컴포먼트들을 그룹화 해서 배치하는 컨테이너 즉 레이아웃이다.
		f.add(panel); // 스윙 프레임윈도우에 스윙 패널 추가
		
		// 배치 관리자 기본값
		// 1. 스위치프레임 윈도우 JFrame은 기본 배치관리자로 보더 레이아웃이다.
		// 2. 스윙 패널은 기본 배치관리자로 플로우 레이아웃이다.
		
		JLabel label01 = new JLabel("화씨 온도"); //JLabel은 설명 덧붙일 떄 사용
		JLabel label02 = new JLabel("섭씨 온도"); 
		
		JTextField field01 = new JTextField(15); // JTextField는 한줄 입력필드를 만든다
		JTextField field02 = new JTextField(15); 
		
		JButton button = new JButton("변환");
		
		panel.add(label01);
		panel.add(field01);
		panel.add(label02);
		panel.add(field02);
		panel.add(button);
		
		f.setSize(300,150);
		f.setLocationRelativeTo(null);
		setLocationRelativeTo(null);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 프레임 윈도우 닫기
		f.setVisible(true);
		
		// 스윙 프레임 윈도우를 정 중아에 나오게 만들어보자
	}

	private static void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}
}
