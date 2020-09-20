package com.lxh.service.impl;

import com.lxh.service.TicketService;
import com.lxh.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author lxh
 * @date 2020-09-19 15:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Reference
    TicketService ticketService;

    @Override
    public void buyTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("获取到了什么东西？=》"+ticket);
    }
}
