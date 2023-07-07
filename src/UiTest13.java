import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// java 스윙 ui 배치를 개발자에 의해서 임의로 배치하는 절대 위치로 배치하기 

class MyFrame01 extends JFrame{
	JButton bt01;
	private JButton bt02, bt03;
	
	public MyFrame01() {
		setTitle("절대 위치 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		JPanel p = new JPanel();
		
		p.setLayout(null); // 임의의 위치에 ui 컴포넌트를 절대 위치로 배치하기 위해서 배치관리자 설정하지 않음. 그래서 null로 지정
		
		bt01 = new JButton("Button #01");
		p.add(bt01);
		bt02 = new JButton("Button #02");
		p.add(bt02);
		bt03 = new JButton("Button #03");
		p.add(bt03);
		
		bt01.setBounds(20, 5, 95, 30); //x: 20, y: 5, 버튼너비: 95, 버튼높이: 30 		크기로 임의의 x,y 좌표 위치에 절대배치
		bt02.setBounds(55, 45, 105, 75);
		bt03.setBounds(180, 15, 105, 90);
		
		add(p); //스윙 프레임 윈도우에 패널 컨테이너(레이아웃) 추가
		setVisible(true); //스윙 프레임 윈도우 항상 보이게 하기
		
	}
}


public class UiTest13 {
	public static void main(String[] args) {
		new MyFrame01();
	}
}
