package com.nanchen.rxjava2examples.model;

import java.util.List;

/**
 * Category 返回model
 *
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  13:23
 */

public class CategoryResult {
    /**
     * error : false
     * results : [{"_id":"58de5542421aa969fd8a3df9","createdAt":"2017-03-31T21:10:26.504Z","desc":"第三方SDK集成库(授权/分享/支付)","publishedAt":"2017-04-13T11:36:04.435Z","source":"web","type":"Android","url":"https://github.com/czy1121/sdk3rd","used":true,"who":"ezy"},{"_id":"58ee4ec5421aa9544ed8892d","createdAt":"2017-04-12T23:59:01.200Z","desc":"震惊！一程序员竟然用这么简单的代码实现了条形码和二维码扫描！","images":["http://img.gank.io/33d64122-d254-47e0-9dda-82760af638e5"],"publishedAt":"2017-04-13T11:36:04.435Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/2bea07e0c1b9","used":true,"who":"黎赵太郎"},{"_id":"58eeed8a421aa9544b773fcd","createdAt":"2017-04-13T11:16:26.242Z","desc":"拥有更好效果的 LineHeight TextView","images":["http://img.gank.io/0b47c973-7107-4a51-9f14-2a4de019dcf2"],"publishedAt":"2017-04-13T11:36:04.435Z","source":"chrome","type":"Android","url":"https://github.com/hanks-zyh/LineHeightEditText","used":true,"who":"代码家"},{"_id":"58ed9624421aa9544825f85b","createdAt":"2017-04-12T10:51:16.759Z","desc":"React-native 实现的 Android BottomSheetBehavior 效果","images":["http://img.gank.io/475bb89a-a9c1-4464-adea-8ce583f7a14a"],"publishedAt":"2017-04-12T12:12:18.213Z","source":"chrome","type":"Android","url":"https://github.com/cesardeazevedo/react-native-bottom-sheet-behavior","used":true,"who":"代码家"},{"_id":"58ed9774421aa954511ebe6a","createdAt":"2017-04-12T10:56:52.788Z","desc":"非官方 B 站客户端，相当良心哦！","images":["http://img.gank.io/d32669f3-41d8-4ada-b0ea-516d7861e6d5"],"publishedAt":"2017-04-12T12:12:18.213Z","source":"chrome","type":"Android","url":"https://github.com/HotBitmapGG/bilibili-android-client","used":true,"who":"带马甲"},{"_id":"58e7aa07421aa90d6bc75adb","createdAt":"2017-04-07T23:02:31.741Z","desc":"长按扫描WebView上的二维码工具。类似微信文章中的长按扫描。","images":["http://img.gank.io/aeecb304-6895-41eb-82e0-65f3e24c6730"],"publishedAt":"2017-04-11T14:43:34.738Z","source":"web","type":"Android","url":"https://github.com/BolexLiu/PressScanCode","used":true,"who":"bolex"},{"_id":"58e8bcbe421aa9544825f835","createdAt":"2017-04-08T18:34:38.298Z","desc":"搭建Maven私有仓库","images":["http://img.gank.io/707bee4f-7b1d-4648-80de-dfa0f6e5c7a9"],"publishedAt":"2017-04-11T14:43:34.738Z","source":"web","type":"Android","url":"https://pcyan.github.io/2017/04/08/use-nexus-to-create-private-maven-repo/","used":true,"who":"pcyan"},{"_id":"58ec6532421aa954511ebe60","createdAt":"2017-04-11T13:10:10.702Z","desc":"使用JNI实现Sobel算子图像边缘检测","images":["http://img.gank.io/b7f4f43e-ed22-4522-b17b-7ccceca77581"],"publishedAt":"2017-04-11T14:43:34.738Z","source":"web","type":"Android","url":"https://github.com/Jomes/sand","used":true,"who":null},{"_id":"58ec6621421aa9544ed8891b","createdAt":"2017-04-11T13:14:09.620Z","desc":"苹果音乐动画","images":["http://img.gank.io/18114aa5-fece-443f-adc8-24bbb6668d99"],"publishedAt":"2017-04-11T14:43:34.738Z","source":"web","type":"Android","url":"https://github.com/rahulrj/Apple-Music-Animation","used":true,"who":null},{"_id":"58e74685421aa90d6bc75ad9","createdAt":"2017-04-07T15:57:57.940Z","desc":"RemoteViews详细解释","publishedAt":"2017-04-10T12:11:14.794Z","source":"web","type":"Android","url":"http://www.haotianyi.win/2017/04/07/view/RemoteViews%E8%AF%A6%E7%BB%86%E8%A7%A3%E9%87%8A/","used":true,"who":"HaoTianYi"}]
     */

    public boolean error;
    public List<ResultsBean> results;

    public static class ResultsBean {
        /**
         * _id : 58de5542421aa969fd8a3df9
         * createdAt : 2017-03-31T21:10:26.504Z
         * desc : 第三方SDK集成库(授权/分享/支付)
         * publishedAt : 2017-04-13T11:36:04.435Z
         * source : web
         * type : Android
         * url : https://github.com/czy1121/sdk3rd
         * used : true
         * who : ezy
         * images : ["http://img.gank.io/33d64122-d254-47e0-9dda-82760af638e5"]
         */

        public String _id;
        public String createdAt;
        public String desc;
        public String publishedAt;
        public String source;
        public String type;
        public String url;
        public boolean used;
        public String who;
        public List<String> images;
    }
}
