package com.example.account.events;

import com.example.account.constant.Status;

public class AccountHeldEvent extends BaseEvent<String> {

  public final Status status;

  public AccountHeldEvent(String id, Status status) {
    super(id);
    this.status = status;
  }
}
