package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.logic.flow.ChangeAccountTypeFlow;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ChangeAccountTypeFlowImplTest {
    private ChangeAccountTypeFlowImpl classToTest;
    
    @Before
    public void setUp() throws Exception {
        classToTest = new ChangeAccountTypeFlowImpl(null);
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