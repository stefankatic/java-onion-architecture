package io.skatech.demo.onion.rest;

import io.skatech.demo.onion.domain.service.AccountService;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
  private final AccountService accountService;

  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @GetMapping(value = "/accounts/{id}")
  public AccountDTO getById(@PathVariable String id){
    return AccountDTO.of(accountService.getById(UUID.fromString(id)));
  }
}
