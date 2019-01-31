package io.skatech.demo.onion.infrastructure.sql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSpringAccountRepository extends JpaRepository<AccountDBO, String> {

}
