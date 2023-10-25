package cz.inventi.kpj.chat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * MessageEvent represents a message that was sent to the chat.
 */
@Data
@NoArgsConstructor
public class MessageEvent {


    public MessageEvent(String name, String message){
        this.id = UUID.randomUUID();
        this.type = MessageType.MESSAGE;
        this.created = OffsetDateTime.now();
        this.name = name;
        this.message = message;
    }

    /**
     * Id of the message; this is a unique identifier of the message.
     */
    private UUID id;

    /**
     * Type of the message.
     * Possible values are:
     * <ul>
     *     <li>message - a message sent by a user</li>
     *     <li>presence - a message that is sent when a user joins or leaves the chat</li>
     * </ul>
     * @see MessageType
     */
    private MessageType type;

    /**
     * Name of the user that sent the message.
     */
    private String name;

    /**
     * Message text.
     */
    private String message;

    /**
     * Time when the message was created.
     */
    private OffsetDateTime created;
}
