package za.ac.nwu.ac.web.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

//import oracle.jdbc.OracleDriver;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@ComponentScan({"za.ac.nwu.ac.translator.AccountTypeTranslator"})

public class RestServiceApplication
{
    public static void main(String [] args)
    {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
