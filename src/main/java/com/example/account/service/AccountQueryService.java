package com.example.account.service;

import java.util.List;

public interface AccountQueryService {
  public List<Object> listEventsForAccount(String accountNumber);
}