package example

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo

class ChatController {
	def index() {}

	@MessageMapping("/hello")
	@SendTo("/queue/hello")
	protected String hello(String world) {
		return "hello from controller, ${world}!"
	}
}
