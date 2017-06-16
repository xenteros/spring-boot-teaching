package com.github.xenteros.controller;

import com.github.xenteros.dto.MessageDTO;
import com.github.xenteros.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by agurgul on 14.06.2017.
 */
@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/create", method = POST)
    public MessageDTO create(@RequestBody MessageDTO messageDTO) {
        return messageService.create(messageDTO);
    }

    @RequestMapping(value = "/all", method = GET)
    public List<MessageDTO> findAll() {
        return messageService.findAll();
    }
}
