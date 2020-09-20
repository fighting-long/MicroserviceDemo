package com.lxh.service.impl;

import com.lxh.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author lxh
 * @date 2020-09-19 15:33
 */
@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "一张票";
    }
}
