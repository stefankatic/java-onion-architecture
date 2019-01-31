package io.skatech.demo.onion.infrastructure.configuration;

import io.skatech.demo.onion.domain.AccountRepository;
import io.skatech.demo.onion.domain.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
  public AccountService accountService(AccountRepository repository) {
    return new AccountService(repository);
  }
}
