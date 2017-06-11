package com.github.codedrinker.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.codedrinker.entity.VimeoResult;
import com.github.codedrinker.util.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Created by codedrinker on 09/06/2017.
 */
public class VimeoConfigReader {
    private String endpoint = "https://player.vimeo.com/video/%s/config";

    private <T> VimeoResult<T> remoteRead(String url, Class<T> cls) {
        VimeoResult vimeoResult = new VimeoResult();

        HttpResponse res;
        CloseableHttpClient httpClient;
        try {
            httpClient = HttpClients.createDefault();
            HttpGet get = new HttpGet(url);

            res = httpClient.execute(get);
            if (res.getStatusLine().getStatusCode() == 200) {
                vimeoResult.setSuccess(true);
                vimeoResult.setData(JSON.parseObject(EntityUtils.toString(res.getEntity(), "UTF-8"), cls));
            } else {
                JSONObject jsonObject = JSON.parseObject(EntityUtils.toString(res.getEntity(), "UTF-8"));
                vimeoResult.setMessage(jsonObject.getString("message"));
            }
            return vimeoResult;
        } catch (Exception e) {
            vimeoResult.setMessage(e.getMessage());
            return vimeoResult;
        }
    }

    public <T> VimeoResult<T> read(String id, Class<T> cls) {
        String url = String.format(endpoint, id);
        return new VimeoConfigReader().remoteRead(url, cls);
    }

    public <T> VimeoResult read(String id, Class<T> cls, String suffix) {
        if (StringUtils.isNotBlank(suffix)) {
            return new VimeoConfigReader().remoteRead(String.format(endpoint, id) + suffix, cls);
        } else {
            return new VimeoConfigReader().remoteRead(String.format(endpoint, id), cls);
        }
    }

}
