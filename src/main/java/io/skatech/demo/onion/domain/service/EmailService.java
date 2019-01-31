package io.skatech.demo.onion.domain.service;

import io.skatech.demo.onion.domain.exceptions.EmailNotSentException;
import io.skatech.demo.onion.domain.model.Email;

public interface EmailService {
  void sendEmail(Email email) throws EmailNotSentException;
}
