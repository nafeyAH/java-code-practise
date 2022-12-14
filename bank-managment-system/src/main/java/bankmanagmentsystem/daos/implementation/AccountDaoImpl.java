package bankmanagmentsystem.daos.implementation;

import bankmanagmentsystem.daos.AccountDao;
import bankmanagmentsystem.models.Account;
import bankmanagmentsystem.repositories.AccountRepository;
import bankmanagmentsystem.repositories.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class AccountDaoImpl implements AccountDao {
    AccountRepository accountRepository;
    CustomerRepository customerRepository;

    public AccountDaoImpl(AccountRepository accountRepository, CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public String create(Account account) {
        Account myaccount=accountRepository.save(account);
        return myaccount.getNumber();
    }

    @Override
    public Account read(String  accNumber) {
        Account account=accountRepository.findByNumber(accNumber);
        return account;
    }

    @Override
    public List<Account> readAll() {
        List<Account> accountslist=new ArrayList<>();
        accountRepository.findAll().forEach(customer -> accountslist.add(customer));
        return accountslist;
    }

    @Override
    public void update(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void deleteByNumber(String accNumber) {
        accountRepository.deleteByNumber(accNumber);
    }
}
