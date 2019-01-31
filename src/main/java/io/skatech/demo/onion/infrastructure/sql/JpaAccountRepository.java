package io.skatech.demo.onion.infrastructure.sql;

import io.skatech.demo.onion.domain.AccountRepository;
import io.skatech.demo.onion.domain.exceptions.EntityNotFoundException;
import io.skatech.demo.onion.domain.model.Account;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAccountRepository implements AccountRepository {

  private final JpaSpringAccountRepository springAccountRepo;

  public JpaAccountRepository(
      JpaSpringAccountRepository springOnionRepository) {
    this.springAccountRepo = springOnionRepository;
  }

  @Override
  public void create(Account account) {
    springAccountRepo.save(AccountDBO.of(account));
  }

  @Override
  public void delete(UUID identity) {
    AccountDBO dbo = springAccountRepo.findById(identity.toString())
        .orElseThrow(EntityNotFoundException::new);
    springAccountRepo.delete(dbo);
  }

  @Override
  public void update(Account account) {
    AccountDBO dbo = springAccountRepo.findById(account.getIdentity().toString()).orElseThrow(EntityNotFoundException::new);
    dbo.apply(account);
    springAccountRepo.save(dbo);
  }

  @Override
  public Optional<Account> findById(UUID identity) {
    return springAccountRepo.findById(identity.toString()).map(AccountDBO::toEntity);
  }

  @Override
  public UUID nextIdentity() {
    return UUID.randomUUID();
  }
}
