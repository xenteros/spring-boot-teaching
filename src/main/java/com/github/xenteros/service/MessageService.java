package com.github.xenteros.service;

import com.github.xenteros.dto.MessageDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by agurgul on 14.06.2017.
 */
@Service
public interface MessageService {

    MessageDTO create(MessageDTO messageDTO);
    List<MessageDTO> findAll();
}
