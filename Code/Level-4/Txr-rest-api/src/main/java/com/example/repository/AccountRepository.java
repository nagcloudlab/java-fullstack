package  com.example.repository;

import com.example.entity.Account;

public interface AccountRepository {
    Account findById(String number);
    Account update(Account account);
}
