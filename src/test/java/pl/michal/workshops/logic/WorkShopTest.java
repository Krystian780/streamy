package pl.michal.workshops.logic;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorkShopTest {

    private WorkShop workShop;

    @Before
    public void setUp() {
        workShop = new WorkShop();
    }

    /**
     * 1.
     */
    @Test
    public void shouldReturnAmountOfHoldingsWhichHasAtLeastOneCompany() {
        final long amountOfCompanies = workShop.getHoldingsWhereAreCompanies();
        assertEquals(3, amountOfCompanies);
    }

    /**
     * 2.
     */
    @Test
    public void shouldReturnAllHoldingNamesInSmallLetters() {
        final List<String> holdings = workShop.getHoldingNames();
        List<String> holdings2 = Arrays.asList("nestle", "coca-cola", "pepsico");
        assertEquals(holdings2, holdings);
    }

    /**
     * 3.
     */
    @Test
    public void shouldReturnAllHoldingNamesAsOneString() {
        final String holdingsConcatenated = workShop.getHoldingNamesAsString();
        String holdings = "(Coca-Cola, Nestle, Pepsico)";
        assertEquals(holdingsConcatenated, holdings);
    }

    /**
     * 4.
     */
    @Test
    public void shouldReturnAllHoldingNamesAsOneString() {
        final String holdingsConcatenated = workShop.getHoldingNamesAsString();
        String holdings = "(Coca-Cola, Nestle, Pepsico)";
        assertEquals(holdingsConcatenated, holdings);
    }


}
