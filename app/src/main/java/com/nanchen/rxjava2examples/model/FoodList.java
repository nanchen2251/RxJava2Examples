package com.nanchen.rxjava2examples.model;

import java.util.List;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-03  9:17
 */

public class FoodList {
    /**
     * status : true
     * total : 1597
     * tngou : [{"count":7450,"description":"棕榈油的话你可以尝尝味道有没有酸味，最好是让对方提供一份检验报告之类的东西，还有就是油的色泽，是否澄清透明","disease":"胆固醇脓胸,家族性高胆固醇血症,猝死型冠心病,胆囊胆固醇沉着症,磷脂酰胆碱-胆固醇酰基转移酶缺乏,胆固醇肺炎,小儿细胞外胆固醇沉着综合征,蓝鼓膜与胆固醇肉芽肿,冠心病","fcount":0,"food":"板绞油,油抒,羊油,玉米油,玛琪琳,裹入油,油皮,油面,油豆角,油豆腐,鸭油,鹅油卷,青甘鱼,酱油露,白脱油,芝麻油,牛油汁,炼制猪油,胡麻油,棕榈油,猪网油,猪背油","id":1599,"img":"/food/150804/2ad85610af25a980b5fd6d1828bbade1.jpg","keywords":"棕榈油 体质 食用 就是 饱和 ","name":"棕榈油","rcount":0,"summary":"<p>【性质】平<\/p> \n<p>【五味】辛<\/p> \n<p>【热量】900.00大卡(千焦)/100克 <\/p> \n<p>【功效】抑癌抗瘤<\/p> \n<p>【棕榈油是什么】 棕榈油是从油棕树上的棕果(Elaeis Guineensis)中榨取出来的，果肉压榨出的油称为棕榈油( Palm Oil)，而果仁压榨出的油称为棕榈仁油(Palm Kernel Oil)，两种油的成分大不相同。棕榈油主要含有棕榈酸(C 16)和油酸(C 18)两种最普通的脂肪酸，棕榈油的饱和程度约为50%;棕榈仁油主要含有月桂酸(C 12)，饱和程度达80...<\/p>","symptom":"煤尘或胆固醇结晶的黏痰,近迫性心肌梗塞,痉挛性偏瘫步态,脑血管痉挛,血浆胆固醇水平高,心脑血管意外,脑血管动静脉畸形,对侧肢体偏瘫,偏瘫"}]
     */

    private boolean status;
    private int total;
    private List<TngouBean> tngou;

    @Override
    public String toString() {
        return "FoodList{" +
                "status=" + status +
                ", total=" + total +
                ", tngou=" + tngou +
                '}';
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }

    public static class TngouBean {
        /**
         * count : 7450
         * description : 棕榈油的话你可以尝尝味道有没有酸味，最好是让对方提供一份检验报告之类的东西，还有就是油的色泽，是否澄清透明
         * disease : 胆固醇脓胸,家族性高胆固醇血症,猝死型冠心病,胆囊胆固醇沉着症,磷脂酰胆碱-胆固醇酰基转移酶缺乏,胆固醇肺炎,小儿细胞外胆固醇沉着综合征,蓝鼓膜与胆固醇肉芽肿,冠心病
         * fcount : 0
         * food : 板绞油,油抒,羊油,玉米油,玛琪琳,裹入油,油皮,油面,油豆角,油豆腐,鸭油,鹅油卷,青甘鱼,酱油露,白脱油,芝麻油,牛油汁,炼制猪油,胡麻油,棕榈油,猪网油,猪背油
         * id : 1599
         * img : /food/150804/2ad85610af25a980b5fd6d1828bbade1.jpg
         * keywords : 棕榈油 体质 食用 就是 饱和
         * name : 棕榈油
         * rcount : 0
         * summary : <p>【性质】平</p>
         <p>【五味】辛</p>
         <p>【热量】900.00大卡(千焦)/100克 </p>
         <p>【功效】抑癌抗瘤</p>
         <p>【棕榈油是什么】 棕榈油是从油棕树上的棕果(Elaeis Guineensis)中榨取出来的，果肉压榨出的油称为棕榈油( Palm Oil)，而果仁压榨出的油称为棕榈仁油(Palm Kernel Oil)，两种油的成分大不相同。棕榈油主要含有棕榈酸(C 16)和油酸(C 18)两种最普通的脂肪酸，棕榈油的饱和程度约为50%;棕榈仁油主要含有月桂酸(C 12)，饱和程度达80...</p>
         * symptom : 煤尘或胆固醇结晶的黏痰,近迫性心肌梗塞,痉挛性偏瘫步态,脑血管痉挛,血浆胆固醇水平高,心脑血管意外,脑血管动静脉畸形,对侧肢体偏瘫,偏瘫
         */

        private int count;
        private String description;
        private String disease;
        private int fcount;
        private String food;
        private int id;
        private String img;
        private String keywords;
        private String name;
        private int rcount;
        private String summary;
        private String symptom;

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

        @Override
        public String toString() {
            return "TngouBean{" +
                    "count=" + count +
                    ", description='" + description + '\'' +
                    ", disease='" + disease + '\'' +
                    ", fcount=" + fcount +
                    ", food='" + food + '\'' +
                    ", id=" + id +
                    ", img='" + img + '\'' +
                    ", keywords='" + keywords + '\'' +
                    ", name='" + name + '\'' +
                    ", rcount=" + rcount +
                    ", summary='" + summary + '\'' +
                    ", symptom='" + symptom + '\'' +
                    '}';
        }
    }
}
