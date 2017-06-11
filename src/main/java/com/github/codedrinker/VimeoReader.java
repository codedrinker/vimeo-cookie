package com.github.codedrinker;

import com.github.codedrinker.entity.VimeoData;
import com.github.codedrinker.entity.VimeoResult;
import com.github.codedrinker.reader.VimeoConfigReader;
import com.github.codedrinker.reader.VimeoPageReader;

/**
 * Created by codedrinker on 09/06/2017.
 */
public class VimeoReader {
    public VimeoData read(String id) {
        VimeoResult<VimeoData> vimeoResult = new VimeoConfigReader().read(id, VimeoData.class);
        if (vimeoResult.isSuccess()) {
            return vimeoResult.getData();
        } else {
            VimeoResult read = new VimeoPageReader().read(id);
            if (read.isSuccess()) {
                vimeoResult = new VimeoConfigReader().read(id, VimeoData.class, read.getSuffix());
                if (vimeoResult.isSuccess()) {
                    return vimeoResult.getData();
                }
            }
        }
        return null;
    }

    public <T> T read(String id, Class<T> clazz) {
        VimeoResult<T> vimeoResult = new VimeoConfigReader().read(id, clazz);
        if (vimeoResult.isSuccess()) {
            return vimeoResult.getData();
        } else {
            VimeoResult read = new VimeoPageReader().read(id);
            if (read.isSuccess()) {
                vimeoResult = new VimeoConfigReader().read(id, clazz, read.getSuffix());
                if (vimeoResult.isSuccess()) {
                    return vimeoResult.getData();
                }
            }
        }
        return null;
    }
}
