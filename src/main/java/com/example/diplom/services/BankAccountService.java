package com.example.diplom.services;

import com.example.diplom.entity.Application;
import com.example.diplom.entity.BankAccount;
import com.example.diplom.repositories.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    public void createBankAccount (BankAccount bankAccount) {
        bankAccountRepository.save(bankAccount);
    }

}
