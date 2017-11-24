package com.icinfo.frk.common.utils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.tools.utils.DateUtils;
//import com.icinfo.ndrc.util.HxDesUtil;


public class HttpUtil {

    private static final String TAG = "HttpUtil";

    private static String sendHttpClientPOSTRequest(String path,String param,String encoding) throws IOException{
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        try {
            StringEntity entity = new StringEntity (param,encoding);
            HttpPost httpPost = new HttpPost (path);
            RequestConfig requestConfig = RequestConfig.custom ().setConnectTimeout (5000).setConnectionRequestTimeout (5000).setSocketTimeout (5000).build ();
            httpPost.setHeader ("Connection", "Keep-Alive");
            httpPost.setConfig (requestConfig);
            httpPost.setEntity (entity);

            client = HttpClients.createDefault ();
            response = client.execute (httpPost);

            int statusCode = response.getStatusLine ().getStatusCode ();
            /* 若状态码为200 ok */
            if (statusCode == 200) {
                InputStream inputStream = response.getEntity ().getContent ();
                byte[] dateStream = readStream (inputStream);
                return new String (dateStream);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
            if (null != response) {
                response.close ();
            }
            if (null != client) {
                client.close ();
            }
        }
        return null;
    }

    /**
     *@Description: 发送Post请求-编码格式默认 UTF-8
     *@Author:杨攀
     *@Since: 2014年8月4日下午12:24:34
     *@param path 请求路径
     *@param params 请求参数
     *@return InputStream
     */
    public static String sendPOSTRequest(String path,Map<String, String> params){
        return sendPOSTRequest (path, params, "UTF-8");
    }

    /**
     *@Description: 发送Post请求
     *@Author:杨攀
     *@Since: 2014年8月4日下午12:25:22
     *@param path 请求路径
     *@param params 请求参数
     *@param encoding 编码
     *@return String  null 请求失败
     */
    public static String sendPOSTRequest(String path,Map<String, String> params,String encoding){
        InputStream inputStream = null;
        HttpURLConnection conn = null;
        try {
            // 组装 name=yangpan&age=28
            StringBuilder data = new StringBuilder ();
            if (params != null && !params.isEmpty ()) {
                for ( Map.Entry<String, String> entry : params.entrySet () ) {
                    data.append (entry.getKey ()).append ("=");
                    data.append (URLEncoder.encode (entry.getValue (), encoding));
                    data.append ("&");
                }
                data.deleteCharAt (data.length () - 1);
            }
            byte[] entity = data.toString ().getBytes ();// 生成实体数据
            conn = (HttpURLConnection) new URL (path).openConnection ();
            conn.setConnectTimeout (5000);// 设置超时
            conn.setRequestMethod ("POST");
            // 允许对外输出数据
            conn.setDoOutput (true);
            // 设定传送的内容类型是可序列化的java对象
            // (如果不设此项,在传送序列化对象时,当WEB服务默认的不是这种类型时可能抛java.io.EOFException)
            conn.setRequestProperty ("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty ("Content-Length", String.valueOf (entity.length));
            // conn.setRequestProperty ("User-Agent", AppContext.getHandSetInfo ());
            conn.setRequestProperty ("AppKey", "3");
            conn.setRequestProperty ("Connection", "Keep-Alive");
            OutputStream outStream = conn.getOutputStream ();
            outStream.write (entity);
            if (conn.getResponseCode () == 200) {
                inputStream = conn.getInputStream ();
                byte[] dateStream = readStream (inputStream);
                return new String (dateStream);
            } else {}
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
            if (conn != null) {
                conn.disconnect ();
            }
        }
        return null;
    }

    /**
     * 发送GET请求
     * @param path 请求路径
     * @param params 请求参数
     * @param encoding 编码
     * @return String  null 请求失败
     */
    public static String sendGETRequest(String path,Map<String, String> params,String ecoding){
        InputStream inputStream = null;
        // http://192.168.1.100:8080/web/ManageServlet?name=yangpan&age=28
        HttpURLConnection conn = null;
        try {
            StringBuilder url = new StringBuilder (path);
            url.append ("?");
            for ( Map.Entry<String, String> entry : params.entrySet () ) {
                url.append (entry.getKey ()).append ("=");
                url.append (URLEncoder.encode (entry.getValue (), ecoding));
                url.append ("&");
            }
            url.deleteCharAt (url.length () - 1);
            conn = (HttpURLConnection) new URL (url.toString ()).openConnection ();
            conn.setConnectTimeout (5000);
            conn.setRequestMethod ("GET");
            // conn.setRequestProperty ("User-Agent", AppContext.getHandSetInfo ());
            conn.setRequestProperty ("AppKey", "3");
            conn.setRequestProperty ("Connection", "Keep-Alive");
            if (conn.getResponseCode () == 200) {
                inputStream = conn.getInputStream ();
                byte[] dateStream = readStream (inputStream);
                return new String (dateStream);
            } else {}
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
            if (conn != null) {
                conn.disconnect ();
            }
        }
        return null;
    }

    /**
     * 读取流
     * @param inStream
     * @return 字节数组
     * @throws Exception
     */
    public static byte[] readStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream ();
        byte[] buffer = new byte[2048];
        int len = -1;
        while ((len = inStream.read (buffer)) != -1) {
            outSteam.write (buffer, 0, len);
        }
        outSteam.close ();
        inStream.close ();
        return outSteam.toByteArray ();
    }

    public static String sendGet(String url,String param){
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL (urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection ();
            // 设置通用的请求属性
            connection.setRequestProperty ("accept", "*/*");
            connection.setRequestProperty ("connection", "Keep-Alive");
            connection.setRequestProperty ("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect ();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields ();
            // 遍历所有的响应头字段
            for ( String key : map.keySet () ) {
                System.out.println (key + "--->" + map.get (key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader (new InputStreamReader (connection.getInputStream ()));
            String line;
            while ((line = in.readLine ()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println ("发送GET请求出现异常！" + e);
            e.printStackTrace ();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close ();
                }
            } catch (Exception e2) {
                e2.printStackTrace ();
            }
        }
        return result;
    }

    private static String sendHttpClientPOSTRequest2(String path,String param,String encoding) throws IOException{
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        try {
            StringEntity entity = new StringEntity (param,encoding);
            HttpPost httpPost = new HttpPost (path);
            RequestConfig requestConfig = RequestConfig.custom ().setConnectTimeout (60000).setConnectionRequestTimeout (60000).setSocketTimeout (60000).build ();
            httpPost.setHeader ("Connection", "Keep-Alive");
            httpPost.setConfig (requestConfig);
            httpPost.setEntity (entity);

            client = HttpClients.createDefault ();
            response = client.execute (httpPost);

            int statusCode = response.getStatusLine ().getStatusCode ();
            /* 若状态码为200 ok */
            if (statusCode == 200) {
                InputStream inputStream = response.getEntity ().getContent ();
                byte[] dateStream = readStream (inputStream);
                return new String (dateStream);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
            if (null != response) {
                response.close ();
            }
            if (null != client) {
                client.close ();
            }
        }
        return null;
    }

    public static String postStream(String strUrl,String content,String encode){
        HttpURLConnection urlCon = null;

        try {
            URL url = new URL (strUrl);
            urlCon = (HttpURLConnection) url.openConnection ();
            urlCon.setRequestMethod ("POST");
            urlCon.setRequestProperty ("content-type", "application/json");
            urlCon.setConnectTimeout (5 * 1000);
            urlCon.setDoOutput (true);
            urlCon.getOutputStream ().write (content.getBytes (encode));
            urlCon.getOutputStream ().flush ();
            urlCon.getOutputStream ().close ();
            if (urlCon.getResponseCode () == 200) {
                BufferedReader in = new BufferedReader (new InputStreamReader (urlCon.getInputStream (),encode));
                String line;
                String respXML = "";
                while ((line = in.readLine ()) != null) {
                    respXML += line;
                }
                in.close ();
                return respXML;
            }
        } catch (IOException i) {
            i.printStackTrace ();
            return null;
        } finally {
            if (urlCon != null) {
                urlCon.disconnect ();
            }
        }
        return null;
    }

    public static String httpUrlConnection(String pathUrl,String requestString,String encode){
        try {
            // 建立连接
            URL url = new URL (pathUrl);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection ();

            // //设置连接属性
            httpConn.setDoOutput (true);// 使用 URL 连接进行输出
            httpConn.setDoInput (true);// 使用 URL 连接进行输入
            httpConn.setUseCaches (false);// 忽略缓存
            httpConn.setRequestMethod ("POST");// 设置URL请求方法
            httpConn.setReadTimeout (30000);

            // 设置请求属性
            // 获得数据字节数据，请求数据流的编码，必须和下面服务器端处理请求流的编码一致
            byte[] requestStringBytes = requestString.getBytes (encode);
            httpConn.setRequestProperty ("Content-length", "" + requestStringBytes.length);
            httpConn.setRequestProperty ("Content-Type", "application/octet-stream");
            httpConn.setRequestProperty ("Connection", "Keep-Alive");// 维持长连接
            httpConn.setRequestProperty ("Charset", encode);

            // 建立输出流，并写入数据
            OutputStream outputStream = httpConn.getOutputStream ();
            outputStream.write (requestStringBytes);
            outputStream.close ();
            // 获得响应状态
            int responseCode = httpConn.getResponseCode ();
            // 当正确响应时处理数据
            StringBuffer sb = new StringBuffer ();
            if (HttpURLConnection.HTTP_OK == responseCode) {// 连接成功
                String readLine;
                BufferedReader responseReader;
                // 处理响应流，必须与服务器响应流输出的编码一致
                responseReader = new BufferedReader (new InputStreamReader (httpConn.getInputStream (),encode));
                while ((readLine = responseReader.readLine ()) != null) {
                    sb.append (readLine).append ("\n");
                }
                responseReader.close ();
                return sb.toString ();
            }
        } catch (Exception ex) {
            ex.printStackTrace ();
        }
        return null;
    }

    public static void main(String[] args) throws IOException{
    	Map<String,String> map = new HashMap<String,String>();
    	map.put("start", "1,2,3");
    	System.out.println(sendPOSTRequest("http://192.168.1.224:8090/shortestPathGroup", map));
    	
        /*
         * InterfaceServerRequest request = new InterfaceServerRequest ();
         * request.setBizDept (null);
         * request.setBizType (null);
         * request.setCertCode ("");
         * request.setPersonName ("");
         * request.setPersonType ("");
         * String requestJson = JSONObject.toJSONString (request);
         * String encryptRequestJson = HxDesUtil.encDES (requestJson);
         * Map<String, String> map = new HashMap<String,String>();
         * map.put ("message", encryptRequestJson);
         * String str = sendPOSTRequest ("http://192.168.5.30:8082/interfaceServer/getData.json", map);
         * System.out.println (str);
         */

        
      /*  Map<String, Object> params = new HashMap<String, Object> ();
        params.put ("entName", "郑秋堂");
        params.put ("listType", "b");
        PageRequest r = new PageRequest ();
        r.setLength (10);
        r.setPageNum (1);
        r.setParams (params);
        String requestJson = JSONObject.toJSONString (r);
        System.out.println (requestJson);
        Map<String, String> map = new HashMap<String, String> ();
        map.put ("json", HxDesUtil.encDES (""));
        String str = sendHttpClientPOSTRequest2 ("http://192.168.5.30:8082/app/redblack/getRedBlackList", HxDesUtil.encDES
        ("{\"length\":10,\"pageNum\":1,\"params\":{\"entName\":\"郑秋堂\",\"listType\":\"b\"}}"),"UTF-8");
        System.out.println (str);*/
        

      /* 
       String encStr = HxDesUtil.encDES ("{\"length\":10,\"pageNum\":1,\"params\":{\"entName\":\"郑秋堂\",\"listType\":\"b\"}}");
       System.out.println (encStr);
       String str = postStream ("http://192.168.5.30:8082/app/redblack/getRedBlackList",encStr , "UTF-8");
       System.out.println (str);*/
    	 /*
    	Map<String, Object> params = new HashMap<String, Object> ();
    	params.put("userImage",ss+"|");
    	params.put("uid","fde34d305fbc11e7b29400188b839ae8");
    	String json = JSONObject.toJSONString(params);
    	System.out.println(json);
        String str =httpUrlConnection("http://192.168.5.116:8082/app/tzuser/upload", HxDesUtil.encDES (json), "utf-8");
        */
        //String str = HttpUtil.postStream ("http://192.168.5.30:8082/app/redblack/getRedBlackList", HxDesUtil.encDES ("{\"length\":10,\"pageNum\":1,\"params\":{\"entName\":\"郑秋堂\",\"listType\":\"b\"}}"), "utf-8");
      
//       
//    	Map<String, Object> params = new HashMap<String, Object> ();
//        Map<String, Object> qryMap = new HashMap<String, Object> ();
//    	params.put("uid","13221065605");
//    	params.put("userImage","data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFAAAABQCAYAAACOEfKtAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3ZpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDo2M2VjYzdmZC00ODE1LWNjNGMtYmM2Ni0wNDdhODNhNjQ5ZGYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6MkQ4RTUyOUU1RkM5MTFFNzg1NjVBODRBMDEyMjRFRkUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6MkQ4RTUyOUQ1RkM5MTFFNzg1NjVBODRBMDEyMjRFRkUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTcgKFdpbmRvd3MpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6ZDBhOTlhMTUtODk1YS0zMjRjLWI1NTAtZDM5OTE0Yjg0ZmYwIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjYzZWNjN2ZkLTQ4MTUtY2M0Yy1iYzY2LTA0N2E4M2E2NDlkZiIv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|");
//        params.put("sfzh","33262519711478963x");
//        params.put("type", "c");
//        qryMap.put("params",params);
    	//params.put("checkCode","871306");
    	//params.put("uid","ee268ce0609311e7b29400188b839ae8");
    	//params.put("userEmail","16568598@139.com");
//    	String json = JSONObject.toJSONString(qryMap);
//    	System.out.println(json);
//    	String str =httpUrlConnection("http://192.168.5.38:8082/app/tzJyjTeacher/doGetDetail", HxDesUtil.encDES (json), "utf-8");
//    	
//    	 System.out.println (str);
    	
    	
    	 
    }
}
