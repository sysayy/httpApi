package api.test.util;

import net.sf.json.JSONObject;

/** 
 * 将java对象转换为json字符串 
 * @author sys
 * 
 */  
public class JsonToObj {  
      
    public JsonToObj() {  
    }

    /**
     *  将传入的java 对象 转换为 json 对象
     * @param obj
     * @return 返回 json 字符串
     */
    public String Object2Json(Object obj){  
        JSONObject json = JSONObject.fromObject(obj);//将java对象转换为json对象  
        String str = json.toString();//将json对象转换为字符串  
        return str;  
    }  
}  