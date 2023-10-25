package cz.inventi.kpj.chat.mapper;

import cz.inventi.kpj.chat.model.MessageEvent;
import cz.inventi.kpj.openapi.model.Message;
import cz.inventi.kpj.openapi.model.MessageRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    Message eventToDTO(MessageEvent event);

    MessageEvent requestToEvent(MessageRequest message);


}
