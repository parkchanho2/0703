import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 그리드 레이아웃 배치관리자에서 3개의 열과 필요한 만큼의 행(정해지지 않은 행 개수) 을 가지는 경우

class FrameEvent12 extends JFrame{
	public FrameEvent12() {
		setTitle("그리드 레이아웃 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3)); //3개의 열과 필요한 만큼의 행을 가지는 그리드 레이아웃 설정
		
		add(new JButton("Button 01")); //프레임에 버튼 추가
		add(new JButton("Button 02"));
		add(new JButton("Button 03"));
		add(new JButton("Button 04"));
		add(new JButton("Long Button 05"));
		add(new JButton("Button 06"));
		add(new JButton("Button 07"));
		
		pack(); // 프레임에 소속된 각 컴포넌트들의 크기를 맞게 조정
		setVisible(true);
	}
}
public class UiTest12 {
	public static void main(String[] args) {
		new FrameEvent12();
	}
}
