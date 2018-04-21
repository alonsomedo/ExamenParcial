package edu.progra2.loanMedinaDonayre.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.progra2.loanMedinaDonayre.model.Loan;
import edu.progra2.loanMedinaDonayre.repository.LoanRepository;

@Controller
public class LoanController {
	
	@Autowired
	private LoanRepository loanRepository;
	
	@GetMapping("/loan/new")
	public String initCreationForm(Model model)
	{
		model.addAttribute("loan",new Loan());
		return "loanForm";
	}
	@PostMapping("/loan/new")
	public String submitForm(@Valid Loan loan,
			BindingResult bindingResult)
	{
		if(bindingResult.hasFieldErrors())
		{
			return "loanForm";
		}
		
		Double _rate = loan.getRate();
		Double _amount = loan.getOriginal_amount();
		
		Double _totalamount = (_rate+1) * _amount;
		
		loan.setStatus("Open");
		
		loan.setTotal_amount(_totalamount);
		
		loanRepository.save(loan);
		return "resultForm";
	}
	
	
	@GetMapping("/loan/list")
	public String list(Map<String, Object> model) {
		List<Loan> loans =loanRepository.findAll();
		model.put("loans", loans);
		return "listForm";
	}
	
	
}
