package za.ac.nwu.ac.web.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.repo.persistence.AccountTypeRepository;

import java.util.List;

//import oracle.jdbc.OracleDriver;

@SpringBootApplication/*(exclude=DataSourceAutoConfiguration.class)*/
//@ComponentScan({"za.ac.nwu.ac.translator.AccountTypeTranslator"})

public class RestServiceApplication
{
    /*@Autowired
    private AccountTypeRepository repository;*/
    public static void main(String [] args)
    {
        SpringApplication.run(RestServiceApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM DEMO_ACCOUNT_TYPE";

        List<AccountType> accountType = repository.query(sql, BeanPropertyRowMapper.newInstance(AccountType.class));
        accountType.forEach(System.out :: println);
    }*/
}
