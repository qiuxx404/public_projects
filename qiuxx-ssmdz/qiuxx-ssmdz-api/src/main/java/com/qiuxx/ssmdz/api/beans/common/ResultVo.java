package com.qiuxx.ssmdz.api.beans.common;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:  用于返回
 * @Author: qiuxx
 * @Date: 11:24 2017/12/6
 */
public class ResultVo implements Serializable{
    private String kind;       //类型
    private boolean result;  //正常与否
    private String msg;     //异常信息
    private Object data;    //结果数据
    private Date nowtime = new Date(); //当前时间

    public ResultVo(){
        this.result = false;
    }

    public ResultVo(boolean result,String kind){
        this.result = result;
        this.kind = kind;
    }

    public  ResultVo(String kind, String msg){
        this.result = false;
        this.kind = kind;
        this.msg = msg;
    }

    public ResultVo(boolean result, String kind, String msg) {
        this.result = result;
        this.kind = kind;
        this.msg = msg;
    }

    public ResultVo(boolean result, Object data, String kind, String msg) {
        this.kind = kind;
        this.result = result;
        this.msg = msg;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
