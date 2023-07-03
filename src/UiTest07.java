import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent07 extends Frame{
	
	Button redbtn, bluebtn;
	
	public FrameEvent07() {
		setLayout(new FlowLayout());
		
		redbtn = new Button("Red");
		bluebtn = new Button("Blue");
		add(redbtn); add(bluebtn);
		
		ButtonListener07 handler = new ButtonListener07(this);
		redbtn.addActionListener(handler);
		bluebtn.addActionListener(handler);
		
		
		setSize(600,400); setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
}

class ButtonListener07 implements ActionListener{
	Frame frm;
	
	public ButtonListener07() {}
	
	public ButtonListener07(Frame frm) {
		this.frm = frm;
			}
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(Color.red)) {
			frm.setBackground(Color.red);
		}else {
			frm.setBackground(Color.blue);
		}
		
	}
}


public class UiTest07 {
	public static void main(String[] args) {
		new FrameEvent07();
	}
}
