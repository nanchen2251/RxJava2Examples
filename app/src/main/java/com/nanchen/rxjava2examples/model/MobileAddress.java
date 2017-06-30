package com.nanchen.rxjava2examples.model;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  15:38
 */

public class MobileAddress {

    /**
     * error_code : 0
     * reason : Succes
     * result : {"mobilenumber":"1302167","mobilearea":"山东 青岛市","mobiletype":"联通如意通卡","areacode":"0532","postcode":"266000"}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MobileAddress{" +
                "error_code=" + error_code +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }

    public static class ResultBean {
        /**
         * mobilenumber : 1302167
         * mobilearea : 山东 青岛市
         * mobiletype : 联通如意通卡
         * areacode : 0532
         * postcode : 266000
         */

        private String mobilenumber;
        private String mobilearea;
        private String mobiletype;
        private String areacode;
        private String postcode;

        public String getMobilenumber() {
            return mobilenumber;
        }

        public void setMobilenumber(String mobilenumber) {
            this.mobilenumber = mobilenumber;
        }

        public String getMobilearea() {
            return mobilearea;
        }

        public void setMobilearea(String mobilearea) {
            this.mobilearea = mobilearea;
        }

        public String getMobiletype() {
            return mobiletype;
        }

        public void setMobiletype(String mobiletype) {
            this.mobiletype = mobiletype;
        }

        public String getAreacode() {
            return areacode;
        }

        public void setAreacode(String areacode) {
            this.areacode = areacode;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "mobilenumber='" + mobilenumber + '\'' +
                    ", mobilearea='" + mobilearea + '\'' +
                    ", mobiletype='" + mobiletype + '\'' +
                    ", areacode='" + areacode + '\'' +
                    ", postcode='" + postcode + '\'' +
                    '}';
        }
    }
}

