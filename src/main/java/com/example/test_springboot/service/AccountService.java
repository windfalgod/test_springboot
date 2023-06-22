package com.example.test_springboot.service;

import com.example.test_springboot.dto.AccountDto;
import java.util.List;

public interface AccountService {
    List<AccountDto> getAllAccount();
    AccountDto getAccountByName(String name);
}
