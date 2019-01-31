package io.skatech.demo.onion.domain.service;

import io.skatech.demo.onion.domain.AccountRepository;
import io.skatech.demo.onion.domain.exceptions.EntityNotFoundException;
import io.skatech.demo.onion.domain.model.Account;
import java.util.UUID;

public class AccountService {

  private final AccountRepository repository;

  public AccountService(AccountRepository repository) {
    this.repository = repository;
  }

  void create(Account account) {
    repository.create(account);
  }
  void update(Account account) {
    repository.update(account);
  }
  void delete(UUID identity) {
    repository.delete(identity);
  }

  public Account getById(UUID identity) {
    return repository.findById(identity).orElseThrow(EntityNotFoundException::new);
  }
}
