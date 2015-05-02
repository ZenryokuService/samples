package jp.co.kakeibo.context;

import jp.co.frw.swing.InputDataIF;
import jp.co.frw.swing.ResultDataIF;
import jp.co.frw.swing.context.Context;

public class UserContext extends Context {

	private static UserContext context;

	private UserContext(String userName, String password) {
		
	}

	public static UserContext getInstance(String userName, String password) {
		if (context == null) {
			context = new UserContext(userName, password);
		}
		return context;
	}
	@Override
	public InputDataIF getInputData() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public ResultDataIF getResultData() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setInputData(InputDataIF input) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void setResultData(ResultDataIF result) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
