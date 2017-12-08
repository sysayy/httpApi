package api.test.obj.Account;
/**
 * [https]用户登陆 登录
 * @author sys
 *
 */
public class LoginJsonObj {

	private String userName; //用户名
	private String password;//密码
	private String areaCode; //地区代码
	private boolean onlyExtra; //

	public LoginJsonObj() {

	}

	public LoginJsonObj(String userName, String password, String areaCode, boolean onlyExtra) {
		super();
		this.userName = userName;
		this.password = password;
		this.areaCode = areaCode;
		this.onlyExtra = onlyExtra;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public boolean isOnlyExtra() {
		return onlyExtra;
	}

	public void setOnlyExtra(boolean onlyExtra) {
		this.onlyExtra = onlyExtra;
	}
}
