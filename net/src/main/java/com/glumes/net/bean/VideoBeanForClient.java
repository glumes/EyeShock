package com.glumes.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhaoying on 2017/9/15.
 */

public class VideoBeanForClient extends BaseHomeModel {


    /**
     * data : {"dataType":"VideoBeanForClient","id":51011,"title":"特条丨SpaceX 火箭回收失败自黑集锦","slogan":"大声回答我！失败是成功的谁？","description":"SpaceX 官方发布的这条「回收火箭推进器的各种失败方法」视频，汇总这些年回收火箭实验失败的画面，配上欢脱的音乐，自嘲的同时轻松回顾了他们一路以来的艰辛历程 \u2014\u2014 想做成任何事都不易，更何况有着改变世界的宏愿呢？From SpaceX","provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"集锦","author":null,"cover":{"feed":"http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/0bd3a951c1dad9ceaa8ba829061c283a.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":128,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=51011","forWeibo":"http://www.eyepetizer.net/detail.html?vid=51011"},"releaseTime":1505449069000,"library":"DAILY","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=qcloud","size":12777294},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=ucloud","size":12777294}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=high&source=qcloud","size":24393961},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=high&source=ucloud","size":24393961}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=high&source=qcloud"}],"consumption":{"collectionCount":469,"shareCount":485,"replyCount":31},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":556,"name":"科技","actionUrl":"eyepetizer://tag/556/?title=%E7%A7%91%E6%8A%80","adTrack":null},{"id":36,"name":"集锦","actionUrl":"eyepetizer://tag/36/?title=%E9%9B%86%E9%94%A6","adTrack":null},{"id":510,"name":"励志","actionUrl":"eyepetizer://tag/510/?title=%E5%8A%B1%E5%BF%97","adTrack":null},{"id":48,"name":"盘点","actionUrl":"eyepetizer://tag/48/?title=%E7%9B%98%E7%82%B9","adTrack":null},{"id":546,"name":"宇宙","actionUrl":"eyepetizer://tag/546/?title=%E5%AE%87%E5%AE%99","adTrack":null}],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1505437200000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"SpaceX 官方发布的这条「回收火箭推进器的各种失败方法」视频，汇总这些年回收火箭实验失败的画面，配上欢脱的音乐，自嘲的同时轻松回顾了他们一路以来的艰辛历程 \u2014\u2014 想做成任何事都不易，更何况有着改变世界的宏愿呢？From SpaceX","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null}
     * tag : 0
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
         * dataType : VideoBeanForClient
         * id : 51011
         * title : 特条丨SpaceX 火箭回收失败自黑集锦
         * slogan : 大声回答我！失败是成功的谁？
         * description : SpaceX 官方发布的这条「回收火箭推进器的各种失败方法」视频，汇总这些年回收火箭实验失败的画面，配上欢脱的音乐，自嘲的同时轻松回顾了他们一路以来的艰辛历程 —— 想做成任何事都不易，更何况有着改变世界的宏愿呢？From SpaceX
         * provider : {"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"}
         * category : 集锦
         * author : null
         * cover : {"feed":"http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/0bd3a951c1dad9ceaa8ba829061c283a.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"}
         * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=default&source=qcloud
         * thumbPlayUrl : null
         * duration : 128
         * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=51011","forWeibo":"http://www.eyepetizer.net/detail.html?vid=51011"}
         * releaseTime : 1505449069000
         * library : DAILY
         * playInfo : [{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=qcloud","size":12777294},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=ucloud","size":12777294}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=high&source=qcloud","size":24393961},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=high&source=ucloud","size":24393961}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=high&source=qcloud"}]
         * consumption : {"collectionCount":469,"shareCount":485,"replyCount":31}
         * campaign : null
         * waterMarks : null
         * adTrack : null
         * tags : [{"id":556,"name":"科技","actionUrl":"eyepetizer://tag/556/?title=%E7%A7%91%E6%8A%80","adTrack":null},{"id":36,"name":"集锦","actionUrl":"eyepetizer://tag/36/?title=%E9%9B%86%E9%94%A6","adTrack":null},{"id":510,"name":"励志","actionUrl":"eyepetizer://tag/510/?title=%E5%8A%B1%E5%BF%97","adTrack":null},{"id":48,"name":"盘点","actionUrl":"eyepetizer://tag/48/?title=%E7%9B%98%E7%82%B9","adTrack":null},{"id":546,"name":"宇宙","actionUrl":"eyepetizer://tag/546/?title=%E5%AE%87%E5%AE%99","adTrack":null}]
         * type : NORMAL
         * titlePgc : null
         * descriptionPgc : null
         * remark : null
         * idx : 0
         * shareAdTrack : null
         * favoriteAdTrack : null
         * webAdTrack : null
         * date : 1505437200000
         * promotion : null
         * label : null
         * labelList : []
         * descriptionEditor : SpaceX 官方发布的这条「回收火箭推进器的各种失败方法」视频，汇总这些年回收火箭实验失败的画面，配上欢脱的音乐，自嘲的同时轻松回顾了他们一路以来的艰辛历程 —— 想做成任何事都不易，更何况有着改变世界的宏愿呢？From SpaceX
         * collected : false
         * played : false
         * subtitles : []
         * lastViewTime : null
         * playlists : null
         */

        private String dataType;
        private int id;
        private String title;
        private String slogan;
        private String description;
        private ProviderBean provider;
        private String category;
        private Object author;
        private CoverBean cover;
        private String playUrl;
        private Object thumbPlayUrl;
        private int duration;
        private WebUrlBean webUrl;
        private long releaseTime;
        private String library;
        private ConsumptionBean consumption;
        private Object campaign;
        private Object waterMarks;
        private Object adTrack;
        @SerializedName("type")
        private String typeX;
        private Object titlePgc;
        private Object descriptionPgc;
        private Object remark;
        private int idx;
        private Object shareAdTrack;
        private Object favoriteAdTrack;
        private Object webAdTrack;
        private long date;
        private Object promotion;
        private Object label;
        private String descriptionEditor;
        private boolean collected;
        private boolean played;
        private Object lastViewTime;
        private Object playlists;
        private List<PlayInfoBean> playInfo;
        private List<TagsBean> tags;
        private List<?> labelList;
        private List<?> subtitles;

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSlogan() {
            return slogan;
        }

        public void setSlogan(String slogan) {
            this.slogan = slogan;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public ProviderBean getProvider() {
            return provider;
        }

        public void setProvider(ProviderBean provider) {
            this.provider = provider;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Object getAuthor() {
            return author;
        }

        public void setAuthor(Object author) {
            this.author = author;
        }

        public CoverBean getCover() {
            return cover;
        }

        public void setCover(CoverBean cover) {
            this.cover = cover;
        }

        public String getPlayUrl() {
            return playUrl;
        }

        public void setPlayUrl(String playUrl) {
            this.playUrl = playUrl;
        }

        public Object getThumbPlayUrl() {
            return thumbPlayUrl;
        }

        public void setThumbPlayUrl(Object thumbPlayUrl) {
            this.thumbPlayUrl = thumbPlayUrl;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public WebUrlBean getWebUrl() {
            return webUrl;
        }

        public void setWebUrl(WebUrlBean webUrl) {
            this.webUrl = webUrl;
        }

        public long getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(long releaseTime) {
            this.releaseTime = releaseTime;
        }

        public String getLibrary() {
            return library;
        }

        public void setLibrary(String library) {
            this.library = library;
        }

        public ConsumptionBean getConsumption() {
            return consumption;
        }

        public void setConsumption(ConsumptionBean consumption) {
            this.consumption = consumption;
        }

        public Object getCampaign() {
            return campaign;
        }

        public void setCampaign(Object campaign) {
            this.campaign = campaign;
        }

        public Object getWaterMarks() {
            return waterMarks;
        }

        public void setWaterMarks(Object waterMarks) {
            this.waterMarks = waterMarks;
        }

        public Object getAdTrack() {
            return adTrack;
        }

        public void setAdTrack(Object adTrack) {
            this.adTrack = adTrack;
        }

        public String getTypeX() {
            return typeX;
        }

        public void setTypeX(String typeX) {
            this.typeX = typeX;
        }

        public Object getTitlePgc() {
            return titlePgc;
        }

        public void setTitlePgc(Object titlePgc) {
            this.titlePgc = titlePgc;
        }

        public Object getDescriptionPgc() {
            return descriptionPgc;
        }

        public void setDescriptionPgc(Object descriptionPgc) {
            this.descriptionPgc = descriptionPgc;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        public Object getShareAdTrack() {
            return shareAdTrack;
        }

        public void setShareAdTrack(Object shareAdTrack) {
            this.shareAdTrack = shareAdTrack;
        }

        public Object getFavoriteAdTrack() {
            return favoriteAdTrack;
        }

        public void setFavoriteAdTrack(Object favoriteAdTrack) {
            this.favoriteAdTrack = favoriteAdTrack;
        }

        public Object getWebAdTrack() {
            return webAdTrack;
        }

        public void setWebAdTrack(Object webAdTrack) {
            this.webAdTrack = webAdTrack;
        }

        public long getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }

        public Object getPromotion() {
            return promotion;
        }

        public void setPromotion(Object promotion) {
            this.promotion = promotion;
        }

        public Object getLabel() {
            return label;
        }

        public void setLabel(Object label) {
            this.label = label;
        }

        public String getDescriptionEditor() {
            return descriptionEditor;
        }

        public void setDescriptionEditor(String descriptionEditor) {
            this.descriptionEditor = descriptionEditor;
        }

        public boolean isCollected() {
            return collected;
        }

        public void setCollected(boolean collected) {
            this.collected = collected;
        }

        public boolean isPlayed() {
            return played;
        }

        public void setPlayed(boolean played) {
            this.played = played;
        }

        public Object getLastViewTime() {
            return lastViewTime;
        }

        public void setLastViewTime(Object lastViewTime) {
            this.lastViewTime = lastViewTime;
        }

        public Object getPlaylists() {
            return playlists;
        }

        public void setPlaylists(Object playlists) {
            this.playlists = playlists;
        }

        public List<PlayInfoBean> getPlayInfo() {
            return playInfo;
        }

        public void setPlayInfo(List<PlayInfoBean> playInfo) {
            this.playInfo = playInfo;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getLabelList() {
            return labelList;
        }

        public void setLabelList(List<?> labelList) {
            this.labelList = labelList;
        }

        public List<?> getSubtitles() {
            return subtitles;
        }

        public void setSubtitles(List<?> subtitles) {
            this.subtitles = subtitles;
        }

        public static class ProviderBean {
            /**
             * name : YouTube
             * alias : youtube
             * icon : http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png
             */

            private String name;
            private String alias;
            private String icon;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }

        public static class CoverBean {
            /**
             * feed : http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageMogr2/quality/60/format/jpg
             * detail : http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageMogr2/quality/60/format/jpg
             * blurred : http://img.kaiyanapp.com/0bd3a951c1dad9ceaa8ba829061c283a.jpeg?imageMogr2/quality/60/format/jpg
             * sharing : null
             * homepage : http://img.kaiyanapp.com/e3130deb762fced25d6be8807ae8c33c.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim
             */

            private String feed;
            private String detail;
            private String blurred;
            private Object sharing;
            private String homepage;

            public String getFeed() {
                return feed;
            }

            public void setFeed(String feed) {
                this.feed = feed;
            }

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getBlurred() {
                return blurred;
            }

            public void setBlurred(String blurred) {
                this.blurred = blurred;
            }

            public Object getSharing() {
                return sharing;
            }

            public void setSharing(Object sharing) {
                this.sharing = sharing;
            }

            public String getHomepage() {
                return homepage;
            }

            public void setHomepage(String homepage) {
                this.homepage = homepage;
            }
        }

        public static class WebUrlBean {
            /**
             * raw : http://www.eyepetizer.net/detail.html?vid=51011
             * forWeibo : http://www.eyepetizer.net/detail.html?vid=51011
             */

            private String raw;
            private String forWeibo;

            public String getRaw() {
                return raw;
            }

            public void setRaw(String raw) {
                this.raw = raw;
            }

            public String getForWeibo() {
                return forWeibo;
            }

            public void setForWeibo(String forWeibo) {
                this.forWeibo = forWeibo;
            }
        }

        public static class ConsumptionBean {
            /**
             * collectionCount : 469
             * shareCount : 485
             * replyCount : 31
             */

            private int collectionCount;
            private int shareCount;
            private int replyCount;

            public int getCollectionCount() {
                return collectionCount;
            }

            public void setCollectionCount(int collectionCount) {
                this.collectionCount = collectionCount;
            }

            public int getShareCount() {
                return shareCount;
            }

            public void setShareCount(int shareCount) {
                this.shareCount = shareCount;
            }

            public int getReplyCount() {
                return replyCount;
            }

            public void setReplyCount(int replyCount) {
                this.replyCount = replyCount;
            }
        }

        public static class PlayInfoBean {
            /**
             * height : 480
             * width : 854
             * urlList : [{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=qcloud","size":12777294},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=ucloud","size":12777294}]
             * name : 标清
             * type : normal
             * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=qcloud
             */

            private int height;
            private int width;
            private String name;
            @SerializedName("type")
            private String typeX;
            private String url;
            private List<UrlListBean> urlList;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTypeX() {
                return typeX;
            }

            public void setTypeX(String typeX) {
                this.typeX = typeX;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<UrlListBean> getUrlList() {
                return urlList;
            }

            public void setUrlList(List<UrlListBean> urlList) {
                this.urlList = urlList;
            }

            public static class UrlListBean {
                /**
                 * name : qcloud
                 * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=51011&editionType=normal&source=qcloud
                 * size : 12777294
                 */

                private String name;
                private String url;
                private int size;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }
            }
        }

        public static class TagsBean {
            /**
             * id : 556
             * name : 科技
             * actionUrl : eyepetizer://tag/556/?title=%E7%A7%91%E6%8A%80
             * adTrack : null
             */

            private int id;
            private String name;
            private String actionUrl;
            private Object adTrack;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getActionUrl() {
                return actionUrl;
            }

            public void setActionUrl(String actionUrl) {
                this.actionUrl = actionUrl;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }
        }
    }
}
