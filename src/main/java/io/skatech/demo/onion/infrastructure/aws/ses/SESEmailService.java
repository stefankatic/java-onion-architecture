package io.skatech.demo.onion.infrastructure.aws.ses;

import io.skatech.demo.onion.domain.exceptions.EmailNotSentException;
import io.skatech.demo.onion.domain.model.Email;
import io.skatech.demo.onion.domain.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class SESEmailService implements EmailService {

  @Override
  public void sendEmail(Email email) throws EmailNotSentException {

  }
}
