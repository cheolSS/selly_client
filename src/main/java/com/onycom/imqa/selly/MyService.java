package com.onycom.imqa.selly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyService {

    @Autowired RunFileVo runFileVo;

    @Async
    public void doAsyncWork(WebSocketMessagingService webSocketMessagingService) {

        try {
            int maxCnt = 10;
//            webSocketMessagingService.sendMessageToAll("/topic/greetings", maxCnt + "[]");

            Thread.sleep(5000);

            System.out.println(maxCnt);
            for(int i=1 ; i <= maxCnt; i++) {
                // 비동기 작업을 수행할 코드
                Thread.sleep(1000);
                Map message = new HashMap();
                message.put("maxCnt" , maxCnt);
                message.put("index", i);
                webSocketMessagingService.sendMessageToAll("/topic/greetings",
                        message
                );

            }

        } catch (Exception e) {
            // 예외 처리
        }
    }
}
