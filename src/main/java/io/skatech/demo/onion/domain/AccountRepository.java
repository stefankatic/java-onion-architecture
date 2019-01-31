package io.skatech.demo.onion.domain;

import io.skatech.demo.onion.domain.model.Account;
import java.util.Optional;
import java.util.UUID;

public interface AccountRepository {

  void create(Account account);
  void delete(UUID identity);
  void update(Account account);
  Optional<Account> findById(UUID identity);
  UUID nextIdentity();

}
