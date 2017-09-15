package com.glumes.net.module;

import com.glumes.comlib.LogUtil;
import com.glumes.net.bean.BaseHomeModel;
import com.glumes.net.bean.TextFooter;
import com.glumes.net.bean.TextHeader;
import com.glumes.net.bean.VideoBeanForClient;
import com.glumes.net.bean.VideoCollectionOfFollow;
import com.glumes.net.bean.VideoCollectionWithCover;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by zhaoying on 2017/9/15.
 */

public class BaseHomeModelAdapter implements JsonDeserializer<BaseHomeModel> {


    @Override
    public BaseHomeModel deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        String type = jsonObject.get("type").getAsString();

        if (type.equals("video")) {
            LogUtil.d("video");
            return new Gson().fromJson(json, VideoBeanForClient.class);
        } else if (type.equals("textHeader")) {
            LogUtil.d("textHeader");
            return new Gson().fromJson(json, TextHeader.class);
        } else if (type.equals("textFooter")) {
            LogUtil.d("textFooter");
            return new Gson().fromJson(json, TextFooter.class);
        } else if (type.equals("videoCollectionWithCover")) {
            LogUtil.d("videoCollectionWithCover");
            return new Gson().fromJson(json, VideoCollectionWithCover.class);
        } else if (type.equals("videoCollectionOfFollow")) {
            LogUtil.d("videoCollectionOfFollow");
            return new Gson().fromJson(json, VideoCollectionOfFollow.class);
        }

        return null;
    }
}
