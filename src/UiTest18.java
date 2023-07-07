import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 마우스를 클릭했을 때 x,y 좌표를 구해서 해당 자동차 이미지를 이동시키는 예제

class MyPanel18 extends JPanel{
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	
	public MyPanel18() {
		try {
			img = ImageIO.read(new File("./images/car.jpg"));
		}catch(IOException ie) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				img_x = e.getX(); // x좌표 를 구함
				img_y = e.getY(); // y좌표 를 구함
				repaint(); // 다시 그리기 위한 그리기 메소드 호출
				
			}// 마우스를 아래로 눌렀을 떄 호출 
		}); //익명 클래스 문법으로 마우스 이벤트 등록
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,img_x,img_y,null);
	}// 무엇을 그리고자 호출되는 메소드 
}//스윙 패널

public class UiTest18 extends JFrame{
	public UiTest18() {
		add(new MyPanel18()); //스윙 프레임 윈도우에 패널 추가
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new UiTest18(); //생성자 호출
	}
}



















