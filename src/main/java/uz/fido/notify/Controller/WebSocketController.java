package uz.fido.notify.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.fido.notify.Model.Message;
import java.util.HashMap;

@Slf4j
@RestController
public class WebSocketController {


    @MessageMapping("/notification")
    @SendTo("/topic/notification")
    public Message greeting(Message message) throws Exception {
        log.info("message info: {}", message);
        return message;
    }

}
