package com.example.account.events;

import com.example.account.constant.Status;

public class AccountActivatedEvent extends BaseEvent<String> {

  public final Status status;

  public AccountActivatedEvent(String id, Status status) {
    super(id);
    this.status = status;
  }
}