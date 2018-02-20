package com.example.android.chickme.Model;

/**
 * Created by Rahul on 15-02-2018.
 */

public class SimsimiModel
{
    public String response;
    public String id;
    public String msg;
    public int result;

    public SimsimiModel(String response, String id, String msg, int result) {
        this.response = response;
        this.id = id;
        this.msg = msg;
        this.result = result;
    }

    public SimsimiModel() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
