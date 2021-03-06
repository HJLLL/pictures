package com.pic.utils;

public class FastJsonResult {
    //返回信息
    private String msg;
    //返回状态
    private Integer status;
    //返回数据
    private Object data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public FastJsonResult(int status,String msg,Object data){
        this.status=status;
        this.msg=msg;
        this.data=data;
    }

    public FastJsonResult(int status,String msg){
        this.status=status;
        this.msg=msg;
    }
    public FastJsonResult(Object data){
        this.status=0;
        this.msg="请求成功";
        this.data=data;
    }
    //传枚举状态
    public static FastJsonResult build(Constants enums, Object data) {
        return new FastJsonResult(enums.getIndex(), enums.getMsg(), data);
    }
    //传枚举状态
    public static FastJsonResult build(Constants enums) {
        return new FastJsonResult(enums.getIndex(), enums.getMsg());
    }
    
    public static FastJsonResult build(Integer status, String msg, Object data) {
    	return new FastJsonResult(status, msg, data);
    }
    public static FastJsonResult build(Integer status, String msg) {
    	return new FastJsonResult(status, msg);
    }
    public static FastJsonResult build(Object data) {
        return new FastJsonResult(data);
    }
    public static FastJsonResult build() {
        return new FastJsonResult(500,"系统内部错误,请稍后再试",null);
    }

}
