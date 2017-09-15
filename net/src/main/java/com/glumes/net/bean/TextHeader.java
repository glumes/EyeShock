package com.glumes.net.bean;

/**
 * Created by zhaoying on 2017/9/15.
 */

public class TextHeader extends BaseHomeModel {

    /**
     * data : {"dataType":"TextHeader","text":"- Sep. 14, Brunch -","font":"lobster","adTrack":null}
     * tag : 1
     */

    private DataBean data;
    private String tag;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public static class DataBean {
        /**
         * dataType : TextHeader
         * text : - Sep. 14, Brunch -
         * font : lobster
         * adTrack : null
         */

        private String dataType;
        private String text;
        private String font;
        private Object adTrack;

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getFont() {
            return font;
        }

        public void setFont(String font) {
            this.font = font;
        }

        public Object getAdTrack() {
            return adTrack;
        }

        public void setAdTrack(Object adTrack) {
            this.adTrack = adTrack;
        }
    }
}
