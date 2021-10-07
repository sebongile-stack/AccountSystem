package za.ac.nwu.ac.translator.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class AccountTypeTranslatorImplTest {
    private AccountTypeTranslatorImpl classToTest;

    @Before
    public void setUp() throws Exception {
        classToTest = new AccountTypeTranslatorImpl(null);
    }

    @After
    public void tearDown() throws Exception {
        classToTest = null;
    }


    @Test
    public void methodToTest() {
        assertTrue(classToTest.methodToTest());
    }

    private void assertTrue(boolean methodToTest) {
    }


}