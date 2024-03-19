package Mapper;

import domain.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> findAll() ;
    int deleteByPrimaryKey(String id);
    int insert(Account record);
    Account selectByPrimaryKey(String id);
    int updateByPrimaryKey(Account account);
}
