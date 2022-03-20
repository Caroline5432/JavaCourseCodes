package io.github.caroline.gateway.okHttp;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author zhangliujie
 * @Description
 * @date 2022/3/20.
 */
public class OkHttpUtils {

    // 缓存客户端实例
    public static OkHttpClient client = new OkHttpClient();

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    // GET 调用
    public static String getAsString(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    // POST 调用
    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }


    public static void main(String[] args) throws Exception {

        String getUrl = "https://square.github.io/okhttp/";
        String text = OkHttpUtils.getAsString(getUrl);
        System.out.println("getUrl: " + getUrl + " ; response: \n" + text);

        String postUrl = "http://127.0.0.1:8088";
        String post = OkHttpUtils.post(postUrl, "");
        System.out.println("postUrl: " + postUrl + " ; response: \n" + post);

        // 清理资源
        OkHttpUtils.client = null;
    }

}
