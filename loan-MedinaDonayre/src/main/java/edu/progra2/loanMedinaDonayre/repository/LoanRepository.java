package edu.progra2.loanMedinaDonayre.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import edu.progra2.loanMedinaDonayre.model.Loan;

public interface LoanRepository
extends Repository<Loan,Integer>{
	
	void save(Loan loan);
	
	List<Loan> findAll();
}
