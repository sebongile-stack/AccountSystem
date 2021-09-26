package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.logic.flow.ChangeAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component
public class ChangeAccountTypeFlowImpl implements ChangeAccountTypeFlow{

    private final AccountTypeTranslator accountTypeTranslator;

    public ChangeAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }
    @Override
    public AccountTypeDto deleteAccountType(String mnemonic){
        return null;
    }
    @Override
    public AccountTypeDto updateAccountType(String anyString, String anyString1, LocalDate any){
        return null;
    }
}
