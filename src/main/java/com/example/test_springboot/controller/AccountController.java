package com.example.test_springboot.controller;

import com.example.test_springboot.dto.AccountDto;
import com.example.test_springboot.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public List<AccountDto> getAllUsers() {
        return accountService.getAllAccount();
    }

}
