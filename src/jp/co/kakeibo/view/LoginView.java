package jp.co.kakeibo.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;

import jp.co.frw.swing.frame.BaseFrame;
import jp.co.frw.swing.frame.control.ControlButton;
import jp.co.frw.swing.frame.control.DicisionButton;
import jp.co.frw.swing.layout.GridBagHelper;
import jp.co.frw.swing.panel.ClientPanel;
import jp.co.frw.swing.parts.FrwTextField;
import jp.co.frw.swing.parts.label.FrwRichLabel;
import jp.co.frw.swing.parts.text.HankakuTextField;
import jp.co.frw.swing.parts.text.PasswordTextField;

public class LoginView extends ClientPanel {
	/** TopLabel */
	private FrwRichLabel topLbl;
	/** userNameLbl */
	private FrwRichLabel nameLbl;
	/** userTextField */
	private FrwTextField userTxt;
	/** passwordLbl */
	private FrwRichLabel passwordLbl;
	/** passwordTxt */
	private PasswordTextField passwdTxt;

	public LoginView(BaseFrame frame) {
		super(frame);
		WINDOW_ID= "login";
		setName(WINDOW_ID);

		// GridBagLayout attend left to right
		// set GridBagLatout
		GridBagHelper grid = new GridBagHelper();
		GridBagConstraints cons = null;

		// Panel Creation
		setLayout(grid);
		cons = grid.setBackGridWidth_REMAINSER();
		cons = grid.setBackWeight(2.1);

		topLbl = new FrwRichLabel("##WelCome!! & Please Login here!!##", -1);
		topLbl.setFont(new Font("SJIS", Font.BOLD, 26));
		topLbl.setLeftShadow(2, 2, Color.red);
		topLbl.setRightShadow(2, 2, Color.yellow);
		topLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(grid.setComponent(topLbl, grid, cons));

		// default FontSize
		Font font = new Font("SJIS", Font.ITALIC, 24);

		/// panel components ///
		cons = grid.reSetToDefault();
		cons = grid.setBackFill_BOTH();
		cons = grid.setBackWeight(1.0);
		nameLbl = new FrwRichLabel("UserName", -2);
		nameLbl.setBackground(Color.green);
		nameLbl.setFont(font);
		nameLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(grid.setComponent(nameLbl, grid, cons));

		// attends last in this line
		cons = grid.setBackGridWidth_REMAINSER();
		userTxt = new HankakuTextField("userName", 8);
		userTxt.setAlignmentX(Component.CENTER_ALIGNMENT);
		userTxt.setSize(new Dimension(50, 20));
		add(grid.setComponent(userTxt, grid, cons));

		// attends next line
		cons = grid.setBackWeight(1.0);
		cons = grid.setBackFill_BOTH();
		passwordLbl = new FrwRichLabel("Password", -2);
		passwordLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordLbl.setBackground(Color.green);
		passwordLbl.setFont(font);
		add(grid.setComponent(passwordLbl, grid, cons));

		passwdTxt = new PasswordTextField("password", 8);
		passwdTxt.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwdTxt.setBackground(Color.green);
		add(grid.setComponent(passwdTxt, grid, cons));

}

	@Override
	public List<ControlButton> getButtonList() {
		buttonList = new ArrayList<ControlButton>();

		DicisionButton dic = new DicisionButton();
		buttonList.add(dic);
		return buttonList;
	}

	@Override
	public String getWindowId() {
		return WINDOW_ID;
	}
	
}
