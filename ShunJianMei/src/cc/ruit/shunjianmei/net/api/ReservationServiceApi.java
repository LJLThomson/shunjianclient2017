package cc.ruit.shunjianmei.net.api;

import java.io.UnsupportedEncodingException;

import cc.ruit.shunjianmei.constants.Constant;
import cc.ruit.shunjianmei.net.request.ReservationServiceAgainRequest;
import cc.ruit.shunjianmei.net.request.ReservationServiceRequest;
import cc.ruit.utils.sdk.http.HttpHelper;

import com.lidroid.xutils.http.callback.RequestCallBack;
/**
 * @ClassName: ReservationServiceApi
 * @Description: 用户预约服务
 * @author: Johnny
 * @date: 2015年9月5日 下午5:35:27
 */
public class ReservationServiceApi {
	/**
	 * @Title: ReservationService
	 * @Description: 用户预约服务
	 * @author: Johnny
	 * @param request
	 * @param callBack
	 * @return: void
	 */
	public static void reservationService(ReservationServiceRequest request,
			RequestCallBack<String> callBack) {
		try {
			String json = request.toJsonString(request);
			HttpHelper.postJSON(Constant.HOSTURL, json, callBack);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @Title: ReservationService
	 * @Description: 用户预约服务
	 * @author: Johnny
	 * @param request
	 * @param callBack
	 * @return: void
	 */
	public static void ReservationServiceAgain(ReservationServiceAgainRequest request,
			RequestCallBack<String> callBack) {
		try {
			String json = request.toJsonString(request);
			HttpHelper.postJSON(Constant.HOSTURL, json, callBack);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
