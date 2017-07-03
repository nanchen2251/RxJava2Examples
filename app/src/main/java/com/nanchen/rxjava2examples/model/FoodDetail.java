package com.nanchen.rxjava2examples.model;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-03  9:18
 */

public class FoodDetail {
    /**
     * count : 3636
     * description : 尾鳍分叉颇深，下叶较长
     * disease :
     * fcount : 0
     * food :
     * id : 10
     * img : /food/150804/285158e45d996bbd47046ee2af2c7370.jpg
     * keywords : 青灰色 银白色 甲壳类 成鱼 菱形
     * message : 鲳鱼属于鲈形目，鲳科。体短而高，极侧扁，略呈菱形。头较小，吻圆，口小，牙细。成鱼腹鳍消失。尾鳍分叉颇深，下叶较长。体银白色，上部微呈青灰色。以甲壳类等为食。
     * name : 白鲳鱼
     * rcount : 0
     * status : true
     * summary :
     * symptom :
     * url : http://www.tngou.net/food/show/10
     */

    private int count;
    private String description;
    private String disease;
    private int fcount;
    private String food;
    private int id;
    private String img;
    private String keywords;
    private String message;
    private String name;
    private int rcount;
    private boolean status;
    private String summary;
    private String symptom;
    private String url;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FoodDetail{" +
                "count=" + count +
                ", description='" + description + '\'' +
                ", disease='" + disease + '\'' +
                ", fcount=" + fcount +
                ", food='" + food + '\'' +
                ", id=" + id +
                ", img='" + img + '\'' +
                ", keywords='" + keywords + '\'' +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", rcount=" + rcount +
                ", status=" + status +
                ", summary='" + summary + '\'' +
                ", symptom='" + symptom + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
