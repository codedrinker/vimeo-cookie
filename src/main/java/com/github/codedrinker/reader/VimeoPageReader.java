package com.github.codedrinker.reader;

import com.github.codedrinker.entity.VimeoResult;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by codedrinker on 09/06/2017.
 */
public class VimeoPageReader {
    private String endpoint = "https://vimeo.com/%s";

    public VimeoResult read(String id) {
        VimeoResult vimeoResult = new VimeoResult();

        HttpResponse res;
        CloseableHttpClient httpClient;
        try {
            httpClient = HttpClients.createDefault();
            String url = String.format(endpoint, id);
            HttpGet get = new HttpGet(url);

            res = httpClient.execute(get);
            if (res.getStatusLine().getStatusCode() == 200) {
                String data = EntityUtils.toString(res.getEntity(), "UTF-8");
                //player.vimeo.com\\\/video\\\/\d+\\\/config([\w|\d|\/|\\|?|_|=|%|\.|&]+)"
                Pattern pattern = Pattern.compile("player.vimeo.com\\\\\\/video\\\\\\/\\d+\\\\\\/config([\\w|\\d|\\/|\\\\|?|_|=|%|\\.|&]+)\"");
                Matcher matcher = pattern.matcher(data);
                if (matcher.find()) {
                    vimeoResult.setSuccess(true);
                    vimeoResult.setSuffix(matcher.group(1));
                } else {
                    return vimeoResult;
                }
                return vimeoResult;
            }
            return vimeoResult;
        } catch (Exception e) {
            vimeoResult.setMessage(e.getMessage());
            return vimeoResult;
        }
    }

}
