import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


//VS4E -- DO NOT REMOVE THIS LINE!
public class JankenFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel0;
	private JToggleButton jToggleButton0;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JToggleButton jToggleButton1;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JToggleButton jToggleButton2;
	private JToggleButton jToggleButton3;
	private JToggleButton jToggleButton4;

	public JankenFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel2(), new Constraints(new Leading(113, 12, 12), new Leading(44, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(119, 10, 10), new Leading(67, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(119, 10, 10), new Leading(17, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(161, 38, 10, 10), new Leading(18, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(161, 38, 10, 10), new Leading(44, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(161, 38, 10, 10), new Leading(67, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(211, 10, 10), new Leading(21, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(211, 10, 10), new Leading(50, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(211, 10, 10), new Leading(71, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(14, 95, 10, 10), new Leading(41, 26, 12, 12)));
		add(getJLabel7(), new Constraints(new Leading(16, 12, 12), new Leading(120, 12, 12)));
		add(getJToggleButton0(), new Constraints(new Leading(242, 12, 12), new Leading(45, 12, 12)));
		add(getJLabel8(), new Constraints(new Leading(106, 190, 10, 10), new Leading(120, 12, 12)));
		add(getJToggleButton1(), new Constraints(new Leading(27, 12, 12), new Leading(168, 10, 10)));
		add(getJLabel9(), new Constraints(new Leading(179, 10, 10), new Leading(173, 12, 12)));
		add(getJLabel10(), new Constraints(new Leading(29, 10, 10), new Leading(233, 10, 10)));
		add(getJToggleButton2(), new Constraints(new Leading(76, 12, 12), new Leading(228, 12, 12)));
		add(getJToggleButton3(), new Constraints(new Leading(142, 12, 12), new Leading(228, 12, 12)));
		add(getJToggleButton4(), new Constraints(new Leading(208, 12, 12), new Leading(228, 12, 12)));
		setSize(350, 300);
	}

	private JToggleButton getJToggleButton4() {
		if (jToggleButton4 == null) {
			jToggleButton4 = new JToggleButton();
			jToggleButton4.setText("あいこ");
		}
		return jToggleButton4;
	}

	private JToggleButton getJToggleButton3() {
		if (jToggleButton3 == null) {
			jToggleButton3 = new JToggleButton();
			jToggleButton3.setText("負け");
		}
		return jToggleButton3;
	}

	private JToggleButton getJToggleButton2() {
		if (jToggleButton2 == null) {
			jToggleButton2 = new JToggleButton();
			jToggleButton2.setText("勝ち");
		}
		return jToggleButton2;
	}

	private JLabel getJLabel10() {
		if (jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("結果:");
		}
		return jLabel10;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("・・・自分の手");
		}
		return jLabel9;
	}

	private JToggleButton getJToggleButton1() {
		if (jToggleButton1 == null) {
			jToggleButton1 = new JToggleButton();
			jToggleButton1.setText("じゃんけんぽん");
			jToggleButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jToggleButton1MouseMouseClicked(event);
				}
			});
		}
		return jToggleButton1;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("グー:0枚, チョキ:0枚, パー:0枚");
		}
		return jLabel8;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("現在の手札");
		}
		return jLabel7;
	}

	private JToggleButton getJToggleButton0() {
		if (jToggleButton0 == null) {
			jToggleButton0 = new JToggleButton();
			jToggleButton0.setText("登録");
			jToggleButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jToggleButton0MouseMouseClicked(event);
				}
			});
		}
		return jToggleButton0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("配られたカード");
		}
		return jLabel0;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("枚");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("枚");
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("枚");
		}
		return jLabel4;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("パー");
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("チョキ");
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("グー");
		}
		return jTextField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("グー");
		}
		return jLabel1;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("パー");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("チョキ");
		}
		return jLabel2;
	}

	private void jToggleButton0MouseMouseClicked(MouseEvent event) {
		Card.Tefuda.gu = (int)Integer.valueOf(getJTextField0().getText());
		Card.Tefuda.choki = (int)Integer.valueOf(getJTextField1().getText());
		Card.Tefuda.pa = (int)Integer.valueOf(getJTextField2().getText());
		
		getJLabel8().setText("グー:" + Card.Tefuda.gu + "枚, " +
								"チョキ:" + Card.Tefuda.choki + "枚, "	+
								"パー:" + Card.Tefuda.pa + "枚");
	}

	private void jToggleButton1MouseMouseClicked(MouseEvent event) {
		String myAttackTe = Card.attack();
		getJLabel8().setText("グー:" + Card.Tefuda.gu + "枚, " +
								"チョキ:" + Card.Tefuda.choki + "枚, " +
								"パー:" + Card.Tefuda.pa + "枚");
		getJLabel9().setText("・・・" + myAttackTe);
	}

}
