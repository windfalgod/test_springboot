package com.example.test_springboot.service.impl;

import com.example.test_springboot.dto.AccountDto;
import com.example.test_springboot.entity.Account;
import com.example.test_springboot.repository.AccountRepository;
import com.example.test_springboot.service.AccountService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    private ModelMapper modelMapper;

    public AccountImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<AccountDto> getAllAccount() {
        List<Account> listAccount = accountRepository.findAll();

        return listAccount.stream()
                .map(account -> modelMapper.map(account,AccountDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public AccountDto getAccountByName(String name) {
        return null;
    }
}
