package bj.ifri.tpbank.repositories;

import bj.ifri.tpbank.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
