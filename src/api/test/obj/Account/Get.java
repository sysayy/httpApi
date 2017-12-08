package api.test.obj.Account;
/**
 * 查询用户信息 接口
 * @author sys
 *
 */
public class Get {

    private	String phone ;
    private int userId;
    private int type;
    
	public Get() {
	}
	
   public Get(int userId,String phone,int type)	{
	   super();
	   this.userId = userId;
	   this.type =type;
	   this.phone = phone;
   }

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public int getType() {
	return type;
}

public void setType(int type) {
	this.type = type;
}
}
