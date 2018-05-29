package com.hwl.service.util;

import java.io.PrintWriter;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class SMSUtils {
	
	
	/**
	 * # SMS Service
sms.operid=ceshi05
sms.operpass=plxj
sms.url=http://221.179.180.158:9007/QxtSms/QxtFirewall

#zhuwang SMS Service
sms.zhuwang.userid=332
sms.zhuwang.account=jscelaixjhy6
sms.zhuwang.passwd=Plxj1501
sms.zhuwang.url=http://hy6.nbark.com:7602
	 * 
	 * 向号码desMobile的手机发送短信，内容为content
	 * @param desMobile
	 * 接收手机号集合:发送单条消息时，此字段填写11位的手机号码(必填)
	 * @param content
	 * 发送消息内容:该方法会进行URL转码，最长不要超过500个字(必填)
	 * @return
	 * @throws Exception 
	 */
	
	/**
	 * 
	 * @param desMobile
	 * @param captcha
	 * @return
	 * @throws Exception
	 */
	public static final String sendSingleMessageZhuWangDirect(String desMobile,String content) throws Exception{
		String result = null;
		String s =null;
//		Map<String, String> params = new HashMap<String, String>();
//		params.put("userid", "332");
//		params.put("account", "jscelaixjhy6");
//		params.put("password", "Plxj1501");
//		params.put("mobile", desMobile);
////		params.put("content", content);
//		params.put("sendTime", "");
//		params.put("action", "send");
//		params.put("extno", "");
		s="userid=332&account=jscelaixjhy6&password=Plxj1501&sendTime=&action=send&extno=&mobile="+desMobile+"&content=";
//		System.out.println(s);
		content =URLEncoder.encode(content,"utf8");
		s=s+content;
		System.out.println(s);
		
//		params.put("content", URLEncoder.encode(content,"utf8"));
//		System.out.println( URLEncoder.encode(stringBuilder.toString(),"utf8"));
		
		try {
			result = sendGet("http://hy6.nbark.com:7602/sms.aspx",s);
			// 解析来自网页的返回值，看看是否发送成功
		} catch (Exception e) {
			e.printStackTrace();
			result = "1";
			throw new Exception("单条短信发送失败！");
			
		}
		
		return result;
	}
	
	 public static String sendGet(String url, String param) {
	        String result = "";
	        BufferedReader in = null;
	        try {
	            String urlNameString = url + "?" + param;
	            URL realUrl = new URL(urlNameString);
	            // 打开和URL之间的连接
	            URLConnection connection = realUrl.openConnection();
	            // 设置通用的请求属性
	            connection.setRequestProperty("accept", "*/*");
	            connection.setRequestProperty("connection", "Keep-Alive");
	            connection.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            // 建立实际的连接
	            connection.connect();
	            // 获取所有响应头字段
//	            Map<String, List<String>> map = connection.getHeaderFields();
	            // 遍历所有的响应头字段
//	            for (String key : map.keySet()) {
//	                System.out.println(key + "--->" + map.get(key));
//	            }
	            // 定义 BufferedReader输入流来读取URL的响应
	            in = new BufferedReader(new InputStreamReader(
	                    connection.getInputStream()));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	        } catch (Exception e) {
	            System.out.println("发送GET请求出现异常！" + e);
	            e.printStackTrace();
	            result="1";
	        }
	        // 使用finally块来关闭输入流
	        finally {
	            try {
	                if (in != null) {
	                    in.close();
	                }
	            } catch (Exception e2) {
	                e2.printStackTrace();
	                result="1";
	            }
	        }
	        return result;
	    }

	public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
            result="1";
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
                result="1";
            }
        }
        return result;
    }

	public static void main(String[] args) {
		try {
//			Map<String, String> model = com.google.common.collect.Maps.newHashMap();
//			model.put("tradeNo", "2016011734973248");
//			String msgContent = "【】恭喜您购买商品成功，订单编号：${tradeNo}。请注意保管，勿将此编号告知其他人。";
//			msgContent = FreeMarkers.renderString(msgContent, model);
//			SMSUtils.sendSingleMessageZhuWangDirect("13691134390", msgContent);
			
//			String content = "【】您的验证码：" + 1234 + "。请勿将此验证码泄露给其他人。";
//			SMSUtils.sendSingleMessageZhuWangDirect("13901515406", content);
			
			try {
			String	result = sendGet("http://hy6.nbark.com:7602/sms.aspx","userid=332&account=jscelaixjhy6&password=Plxj1501&sendTime=&action=send&extno=&mobile=13901515406&content=%E5%B7%B2%E4%BB%98%E6%AC%BE%3A%E7%B2%AE%E5%AE%9D%E5%AE%9D+%E7%A8%BB%E8%8A%B1%E9%A6%99%E5%A4%A7%E7%B1%B38kg+*+1%2C%E9%99%88%E4%B8%AD%E7%BE%8E%2C15161595729%2C%E6%B1%9F%E8%8B%8F%E7%9C%81%E6%97%A0%E9%94%A1%E5%B8%82%E5%8D%97%E9%95%BF%E5%8C%BA%E7%BA%A2%E6%98%9F%E8%8B%9163%E5%8F%B7901%E6%88%96902");
			System.out.println(result);
			// 解析来自网页的返回值，看看是否发送成功
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("单条短信发送失败！");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

