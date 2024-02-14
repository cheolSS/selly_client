package com.onycom.imqa.selly;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WebSocketMessagingService {

    private final SimpMessagingTemplate messagingTemplate;

    public WebSocketMessagingService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendMessageToAll(String destination, Map message) {
        messagingTemplate.convertAndSend(destination, message);
    }

    @MessageMapping("/updateProgressBar")
    public void updateProgressBar(@Payload ProgressBarVo progressBarVo) {
        // WebSocket을 통해 클라이언트에게 보낼 메시지를 작성합니다.
        // 여기서는 progressBarVo를 그대로 보내는 것으로 가정합니다.
        messagingTemplate.convertAndSend("/topic/progressBar", progressBarVo);
    }
}