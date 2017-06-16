package com.github.xenteros.service.impl;

import com.github.xenteros.dto.MessageDTO;
import com.github.xenteros.mapper.MessageMapper;
import com.github.xenteros.model.Message;
import com.github.xenteros.model.Student;
import com.github.xenteros.repository.MessageRepository;
import com.github.xenteros.repository.StudentRepository;
import com.github.xenteros.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by agurgul on 14.06.2017.
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public MessageDTO create(MessageDTO messageDTO) {

        Student from = studentRepository.findOneByUuid(messageDTO.getFrom().getUuid());
        Student to = studentRepository.findOneByUuid(messageDTO.getTo().getUuid());
        Message message = messageMapper.toMessage(messageDTO);
        message.setFrom(from);
        message.setTo(to);
        return messageMapper.toMessageDTO(messageRepository.save(message));
    }

    @Override
    public List<MessageDTO> findAll() {
        return messageMapper.toMessageDTOList(messageRepository.findAll());
    }
}
