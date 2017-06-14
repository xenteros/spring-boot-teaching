package com.github.xenteros.mapper;

import com.github.xenteros.dto.MessageDTO;
import com.github.xenteros.model.Message;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Created by agurgul on 14.06.2017.
 */
@Mapper(componentModel = "spring", uses = {StudentMapper.class})
public interface MessageMapper {

    @Mapping(target = "from", ignore = true)
    @Mapping(target = "to", ignore = true)
    Message toMessage(MessageDTO messageDTO);

    @Mapping(target = "from", ignore = true)
    @Mapping(target = "to", ignore = true)
    MessageDTO toMessageDTO(Message message);

    List<Message> toMessageList(List<MessageDTO> list);
    List<MessageDTO> toMessageDTOList(List<Message> list);
}
