package com.websocket.demo;

import com.websocket.demo.controller.WebSocket;
import net.sf.json.JSONObject;

import java.io.IOException;

public class backrun {
    public static void main(String[] args) throws IOException {
        WebSocket ws = new WebSocket();
        JSONObject jo = new JSONObject();

        jo.put("message", "这是后台返回的消息！");

        jo.put("To","invIO.getIoEmployeeUid()");

        ws.onMessage(jo.toString());
    }
}
