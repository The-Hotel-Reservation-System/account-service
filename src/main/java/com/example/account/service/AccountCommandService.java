package com.example.account.service;

import com.example.account.dto.AccountCreateDTO;
import com.example.account.dto.MoneyCreditDTO;
import com.example.account.dto.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

  public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
  public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
  public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}