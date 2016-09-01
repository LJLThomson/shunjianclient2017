package cc.ruit.shunjianmei.net.request;

import cc.ruit.shunjianmei.base.BaseRequest;

import com.google.gson.GsonBuilder;
import com.lidroid.xutils.util.LogUtils;
import com.oruit.oruitkey.OruitKey;

/**
 * @ClassName: WithdrawalsInfoRequest
 * @Description: 登录
 * @author: lee
 * @date: 2015年8月31日 下午11:00:48
 */
public class WithdrawalsInfoRequest extends BaseRequest {
	// 用户id
	private String UserId;

	/**
	 * @Title:UserLoginRequest
	 * @Description:TODO
	 * @param Mobile 手机号
	 * @param VCode 验证码
	 */
	public WithdrawalsInfoRequest(String UserId) {
		super("WithdrawalsInfo", "1.0");
		this.UserId = UserId;
		String uid = System.currentTimeMillis() + "";
		setUid(uid, OruitKey.encrypt(uid, "WithdrawalsInfo"));
	}

	/**
	 * @Title: toJsonString
	 * @Description:  把对象转成json格式的字符串
	 * @author: lee
	 * @param obj
	 * @return: String
	 */
	public String toJsonString(WithdrawalsInfoRequest obj) {
		GsonBuilder gson = new GsonBuilder();
		gson.disableHtmlEscaping();
		String json = gson.create().toJson(obj);
		LogUtils.i("cord==" + json);
		return json;
	}

	@Override
	public String toString() {
		return "WithdrawalsInfoRequest [UserId=" + UserId + ", Method="
				+ Method + ", Infversion=" + Infversion + ", Key=" + Key
				+ ", UID=" + UID + "]";
	}

}
