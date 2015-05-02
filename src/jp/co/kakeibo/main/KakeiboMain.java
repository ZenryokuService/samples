package jp.co.kakeibo.main;

import jp.co.frw.swing.ComponentException;
import jp.co.frw.swing.frame.BaseFrame;
import jp.co.kakeibo.view.LoginView;

public class KakeiboMain {
	public static void main(String[] args) {
		BaseFrame frame = BaseFrame.getInstance("家計簿");

		LoginView login = new LoginView(frame);
		try {
			
			frame.addClientPanel(login);
			frame.setVisiblePanel(login.getName());
		} catch (ComponentException e) {
			e.printStackTrace();
		}
		frame.setVisible(true);
	}
}
