import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 3번째 이벤트 처리

class FrameEvent08 extends Frame implements ActionListener{
	Button orangebtn,yellowbtn;
	
	public FrameEvent08() {
		setLayout(new FlowLayout());
		
		orangebtn = new Button("Orange");
		yellowbtn = new Button("Yellow");
		
		add(orangebtn); add(yellowbtn);
		
		orangebtn.addActionListener(this); //각 버튼 이벤트 등록
		yellowbtn.addActionListener(this);
		
		setSize(700,500); setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == orangebtn) {// getSource() 메서드는 이벤트 소스 객체를 구함
			this.setBackground(Color.ORANGE);
		}else {
			setBackground(Color.YELLOW);
		}
			
	}
	
}
public class UiTest08 {
	public static void main(String[] args) {
		new FrameEvent08();
	}
}
