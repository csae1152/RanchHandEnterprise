/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmhand.ranchhandenterprise;

import javax.websocket.MessageHandler;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Helmut
 */
@ServerEndpoint("/eye")
public class AbstractWebsocketConnector {

    /**
     *
     * @param session
     */
    @OnOpen
    public void onOpen(Session session) {
        MessageHandler handler = null;
        session.addMessageHandler(handler);
    }

    @OnClose
    public void onClose() {
    }

    @OnError
    public void onError(Throwable t) {
    }

    @OnMessage
    public void onMessage() {
    }
    
}
