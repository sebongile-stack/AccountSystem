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

    @Mock
    private ChangeAccountTypeFlow change;

    @InjectMocks
    private ChangeAccountTypeFlowImpl flow;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void deleteAccountType() {
        when(change.deleteAccountType(any(String.class))).thenReturn(null);
        AccountTypeDto results = flow.deleteAccountType(new String());
        assertNull(results);

    }
    private void assertNull(AccountTypeDto results) {
    }
}