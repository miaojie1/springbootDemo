package com.example.demo.entity;


/**
 * Created by miaojie on 2019/3/19.
 */

public class Result {

    private Integer state;
    private String msg;
    private Object data;

    public Result() {
        this.state=200;
        this.msg="成功";
    }

    public Result(Integer state,String msg){
        this.state=state;
        this.msg=msg;
    }

    public Result(Integer state,String msg,Object data){
        this.msg=msg;
        this.state=state;
        this.data=data;
    }
    public Integer getState(){
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
