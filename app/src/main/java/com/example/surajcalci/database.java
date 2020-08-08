package com.example.surajcalci;

public class database {
    String id;
    double v1,v2,re;
    public database(String id,double v1,double v2,double re){
        this.id=id;
        this.v1=v1;
        this.v2=v2;
        this.re=re;
    }
    public  String getId(){
        return id;
    }
    public double getV1(){
        return v1;
    }
    public double getV2(){
        return v2;
    }
    public double getRe(){
        return re;
    }
}
