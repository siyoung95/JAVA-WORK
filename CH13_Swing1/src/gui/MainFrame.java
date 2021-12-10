package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) { //생성자
		super(title); // 창의 이름을 넣어서 생성

		//먼저 레이아웃 설정
		setLayout(new BorderLayout()); // 창에 컴포넌트를 붙이기 위한 레이아웃 설정
		
//		JPanel panel = new JPanel();   //패널을 생성
//		panel.setBackground(Color.GREEN); //패널의 녹색 설정
		add(new Toolbar(), BorderLayout.NORTH); //위쪽에 툴바 붙이기
		add(new MainPanel(), BorderLayout.CENTER); //위에서 만든 패널을 레이아웃의 가운데 붙이기
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
