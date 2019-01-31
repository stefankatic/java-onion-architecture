package io.skatech.demo.onion.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
  private UUID identity;
  private List<Credential> credentials;
  private Email primaryEmail;

  public Account(UUID identity) {
    this.identity = identity;
    this.credentials = new ArrayList<>();
  }

  public void addCredential(Credential credential) {
    this.credentials.add(credential);
  }
  public void setPrimaryEmail(Email email) {
    primaryEmail = email;
  }

  public UUID getIdentity() {
    return identity;
  }

  public List<Credential> getCredentials() {
    return credentials;
  }

  public Email getPrimaryEmail() {
    return primaryEmail;
  }
}
