package com.woslx.springbootvaild;

import com.alibaba.fastjson.JSON;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.Test;

/**
 * @author hy
 * @create 2019-03-12 16:41
 **/
public class TestLogin {
    public static final String url = "http://127.0.0.1:8080/";

    @Test
    public void test2() throws Exception{
        String urlTemp = url+"login";

        User user = new User();
        user.setPhone("13609876543");
        user.setName("Tom");
        user.setAge(10);
        System.out.println(JSON.toJSONString(user));
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(user));
        Request request = new Request.Builder()
                .url(urlTemp)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Cache-Control", "no-cache")
                .build();

        Response response = client.newCall(request).execute();
        String respMessage = response.body().string();
        System.out.println(respMessage);
    }
}
