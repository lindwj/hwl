package com.hwl.service.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.json.JSONObject;

import com.alibaba.fastjson.JSON;
import com.hwl.service.util.SMSUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Common {

	public static final String salt="Hg97sKd3";
	 /** 
     * 获得一个UUID 
     * @return String UUID 
     */ 
    public static String getUUID(){ 
        String s = UUID.randomUUID().toString(); 
        //去掉“-”符号 
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24); 
    }
    
    
    
    
  //下载用户头像到本地、download(headimgurl,fileName,request,"headImg");
  	public static String download(String urlString, String openId,HttpServletRequest request,String pathName) throws Exception {  
          // 构造URL  
  		
          URL url = new URL(urlString);  
          // 打开连接  
          URLConnection con = url.openConnection(); 
          //设置请求超时为5s  
          con.setConnectTimeout(5*1000);  
          String type = con.getContentType();
          int imgType = type.indexOf("/") +1;
          String houZui = "."+type.substring(imgType, type.length());
          // 输入流  
          InputStream is = con.getInputStream();  
       
          // 1K的数据缓冲  
          byte[] bs = new byte[1024];  
          // 读取到的数据长度  
          int len;  
          
          String fileSeparator = System.getProperty("file.separator");
          String path = request.getSession().getServletContext().getRealPath(fileSeparator);
          String imgPath = path +"resource"+fileSeparator+ "upload" + fileSeparator + pathName;
          // 输出的文件流  
         File sf=new File(imgPath);  
         if(!sf.exists()){  
             sf.mkdirs();  
         }  
         OutputStream os = new FileOutputStream(sf.getPath()+fileSeparator+openId+houZui);  
          // 开始读取  
          while ((len = is.read(bs)) != -1) {  
            os.write(bs, 0, len);  
          }  
          // 完毕，关闭所有链接  
          os.close();  
          is.close();  
          
          return houZui;
      }  
    
    
    
    /**
    * 获取访问者IP
    * 
    * 在一般情况下使用Request.getRemoteAddr()即可，但是经过nginx等反向代理软件后，这个方法会失效。
    * 
    * 本方法先从Header中获取X-Real-IP，如果不存在再从X-Forwarded-For获得第一个IP(用,分割)，
    * 如果还不存在则调用Request .getRemoteAddr()。
    * 
    * @param request
    * @return
    */
    public static String getIpAddr(HttpServletRequest request) throws Exception{
    String ip = request.getHeader("X-Real-IP");
    if (ip != null && ip.length()>0 && !"unknown".equalsIgnoreCase(ip)) {
    return ip;
    }
    ip = request.getHeader("X-Forwarded-For");
    if (ip != null && ip.length()>0  && !"unknown".equalsIgnoreCase(ip)) {
    // 多次反向代理后会有多个IP值，第一个为真实IP。
    int index = ip.indexOf(',');
    if (index != -1) {
    return ip.substring(0, index);
    } else {
    return ip;
    }
    } else {
    return request.getRemoteAddr();
    }
    }
    
    
    
    public static String getJsonString(String urlPath) throws Exception {  
        URL url = new URL(urlPath);  
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();  
        connection.connect();  
        InputStream inputStream = connection.getInputStream();  
        //对应的字符编码转换  
        Reader reader = new InputStreamReader(inputStream, "UTF-8");  
        BufferedReader bufferedReader = new BufferedReader(reader);  
        String str = null;  
        StringBuffer sb = new StringBuffer();  
        while ((str = bufferedReader.readLine()) != null) {  
            sb.append(str);  
        }  
        reader.close();  
        connection.disconnect();  
        return sb.toString();  
    }  
    
    
    
    public static String Md5(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte[] b = md.digest();

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				int i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}

			return buf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return "null";
	}
    
    public static String sendMess(String mobile,String content){
		
    	String msgRes = null;
		try {
//			String content = "【】您的验证码：" +   "。请勿将此验证码泄露给其他人。";
			content="【】"+content;
			msgRes=SMSUtils.sendSingleMessageZhuWangDirect(mobile, content);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return msgRes;
	}
    
    
    
    public static String getMobileCaptcha(String mobile){
    	//判断是否在一分钟之内多次发生
    	String msgRes = null;
    	SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date nowTime=new Date(); 
    	List<String> sList=null;
    	Subject subject = SecurityUtils.getSubject();
    	Object ob=subject.getSession().getAttribute("captcha");
    	if(ob!=null){
    		sList=(List<String>)ob;
    		//转换 之前一次发烧短信的时间
    		try {
				long oldtimes= time.parse(sList.get(2)).getTime();
				long nowtimes = nowTime.getTime();
				//计算相差的秒数
				int c = (int)((nowtimes - oldtimes) / 1000);
				//60秒内不允许重复发
				if(c<=60){
					msgRes = "1";
					return msgRes;
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    	
		SecureRandom random = new SecureRandom();
		String captcha = "";
		while(captcha.length() != 4){
			captcha = String.valueOf(Math.abs(random.nextInt()) % 10000);
		}
		
		
		try {
			String content = "【】您的验证码：" + captcha + "。请勿将此验证码泄露给其他人。";
			msgRes=SMSUtils.sendSingleMessageZhuWangDirect(mobile, content);
			
		} catch (Exception e) {
			e.printStackTrace();
			msgRes = "1";
		}
		
		//存储验证码 及 发送间隔时间
		sList=new ArrayList<String>();
		sList.add(mobile);
		sList.add(captcha);
		
		
//		System.out.println(nowTime); 
		 
//		System.out.println(time.format(nowTime));
		sList.add(time.format(nowTime));
		
		subject.getSession().setAttribute("captcha", sList);
		
		return msgRes;
	}
    
    
    
    /**
     * 根据名字获取cookie
     * @param request
     * @param name cookie名字
     * @return
     */
    public static Cookie getCookieByName(HttpServletRequest request,String name){
        Map<String,Cookie> cookieMap = ReadCookieMap(request);
        if(cookieMap.containsKey(name)){
            Cookie cookie = (Cookie)cookieMap.get(name);
            return cookie;
        }else{
            return null;
        }   
    }
      
      
      
    /**
     * 将cookie封装到Map里面
     * @param request
     * @return
     */
    private static Map<String,Cookie> ReadCookieMap(HttpServletRequest request){  
        Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
        Cookie[] cookies = request.getCookies();
        if(null!=cookies){
            for(Cookie cookie : cookies){
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }
    
    /**
     * 读取所有cookie
     * 注意二、从客户端读取Cookie时，包括maxAge在内的其他属性都是不可读的，也不会被提交。浏览器提交Cookie时只会提交name与value属性。maxAge属性只被浏览器用来判断Cookie是否过期
     * @param request
     * @param response
     */
    public static void showCookies(HttpServletRequest request,HttpServletResponse response ){
         
        Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
        if (null==cookies) {
            System.out.println("没有cookie=========");
        } else {
            for(Cookie cookie : cookies){
                System.out.println("name:"+cookie.getName()+",value:"+ cookie.getValue());
            }
        }
         
    }
    /**
     * 添加cookie
     * @param response
     * @param name
     * @param value
     */
    public static void addCookie(HttpServletResponse response,String name,String value){
        Cookie cookie = new Cookie(name.trim(), value.trim());
        cookie.setMaxAge(7*24*60*60);// 设置为30min
        cookie.setPath("/");
//        System.out.println("已添加===============");
//        System.out.println("被修改的cookie名字为:"+cookie.getName()+",新值为:"+cookie.getValue());
        response.addCookie(cookie);
    }
    /**
     * 修改cookie
     * @param request
     * @param response
     * @param name
     * @param value
     * 注意一、修改、删除Cookie时，新建的Cookie除value、maxAge之外的所有属性，例如name、path、domain等，都要与原Cookie完全一样。否则，浏览器将视为两个不同的Cookie不予覆盖，导致修改、删除失败。
     */
    public static void editCookie(HttpServletResponse response,Cookie cookie,String value){
                    cookie.setValue(value);
                    cookie.setPath("/");
                    cookie.setMaxAge(30 * 60);// 设置为30min
                    System.out.println("被修改的cookie名字为:"+cookie.getName()+",新值为:"+cookie.getValue());
                    response.addCookie(cookie);
         
    }
    /**
     * 删除cookie
     * @param request
     * @param response
     * @param name
     */
    public static void delCookie(HttpServletRequest request,HttpServletResponse response,String name){
        Cookie[] cookies = request.getCookies();
        if (null==cookies) {
            System.out.println("没有cookie==============");
        } else {
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(name)){
                    cookie.setValue(null);
                    cookie.setMaxAge(0);// 立即销毁cookie
                    cookie.setPath("/");
                    System.out.println("被删除的cookie名字为:"+cookie.getName());
                    response.addCookie(cookie);
                    break;
                }
            }
        }
    }
    
 // 对象转JSON串  
   
    
    public static String objectToJsonStr(Object obj) {  
    	 String jsonString = JSON.toJSONString(obj);  
//    	    System.out.println("jsonString:" + jsonString);  
        return jsonString;  
    }
    
    //zip解压
    public static Boolean unZip(String fileSourcePath ,String fileTargetPath , String fileName) {  
    	try {
    	// get a zip file instance
        File file = new File ( fileSourcePath+fileName ) ;

        // get a ZipFile instance
        ZipFile zipFile = new ZipFile ( file ) ;

        // create a ZipInputStream instance
        ZipInputStream zis = new ZipInputStream ( new FileInputStream (
                file ) ) ;

        // create a ZipEntry instance , lay the every file from
        // decompress file temporarily
        ZipEntry entry = null ;

        // a circle to get every file
        while ( ( entry = zis.getNextEntry ( ) ) != null )
        {
            System.out.println ( "decompress file :"
                    + entry.getName ( ) ) ;

            // define the path to set the file
            File outFile = new File ( fileTargetPath
                    + entry.getName ( ) ) ;

            // if the file's parent directory wasn't exits ,than
            // create the directory
            if ( ! outFile.getParentFile ( ).exists ( ) )
            {
                outFile.getParentFile ( ).mkdir ( ) ;
            }

            // if the file not exits ,than create the file
            if ( ! outFile.exists ( ) )
            {
                outFile.createNewFile ( ) ;
            }

            // create an input stream
            BufferedInputStream bis = new BufferedInputStream (
                    zipFile.getInputStream ( entry ) ) ;

            // create an output stream
            BufferedOutputStream bos = new BufferedOutputStream (
                    new FileOutputStream ( outFile ) ) ;
            byte [ ] b = new byte [ 1024 ] ;
            while ( true )
            {
                int len = bis.read ( b ) ;
                if ( len == - 1 )
                    break ;
                bos.write ( b , 0 , len ) ;
            }
            // close stream
            bis.close ( ) ;
            bos.close ( ) ;
        }
        zis.close ( ) ;
        
    	}catch(Exception e) {
    	
    		e.printStackTrace();
    		return false;
    		
    	}
    	
       return true;  
   }
    
    
    public static String fileRead(String filePath) throws Exception {
        File file = new File(filePath);//定义一个file对象，用来初始化FileReader
        FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
        BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
        StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
        String s = "";
        while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
//            System.out.println(s);
        }
        bReader.close();
        reader.close();
        return sb.toString();
    }
	
}

