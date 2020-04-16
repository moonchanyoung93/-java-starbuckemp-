package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuExam2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuExam2 frame = new MenuExam2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("파일(F)");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("새로 만들기");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("열기");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("저장");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("다른 이름으로 저장");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("페이지 설정");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("인쇄");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("끝내기(x)");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MenuExam2.this, "진심으로 종료할까요?");
				if(result==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(MenuExam2.this, "프로그램을 종료합니다.");
					System.exit(0);			
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("편집(E)");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("실행 취소");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1.add(separator_2);
		
		JMenuItem menuItem = new JMenuItem("잘라내기");
		mnNewMenu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("복사");
		mnNewMenu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("붙여넣기");
		mnNewMenu_1.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("삭제");
		mnNewMenu_1.add(menuItem_3);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_1.add(separator_3);
		
		JMenuItem menuItem_4 = new JMenuItem("찾기");
		mnNewMenu_1.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("다음 찾기");
		mnNewMenu_1.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("바꾸기");
		mnNewMenu_1.add(menuItem_6);
		
		JMenuItem menuItem_8 = new JMenuItem("이동");
		mnNewMenu_1.add(menuItem_8);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_1.add(separator_4);
		
		JMenuItem menuItem_7 = new JMenuItem("모두 선택");
		mnNewMenu_1.add(menuItem_7);
		
		JMenuItem menuItem_10 = new JMenuItem("시간/날짜");
		mnNewMenu_1.add(menuItem_10);
		
		JMenu mnNewMenu_2 = new JMenu("서식(O)");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("자동 줄 바꿈");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("글꼴");
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_4 = new JMenu("보기(V)");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("상태 표시줄");
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_3 = new JMenu("도움말(H)");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("도움말 보기");
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_3.add(separator_5);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("메모장 정보");
		mnNewMenu_3.add(mntmNewMenuItem_12);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
