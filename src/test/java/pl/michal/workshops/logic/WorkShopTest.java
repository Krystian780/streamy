package pl.michal.workshops.logic;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

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
    public void shouldReturnAmountOfHoldingWhereIsAtLeastOneCompany() {
        final long amountOfCompanies = workShop.getHoldingsWhereAreCompanies();
        assertEquals(3, amountOfCompanies);
    }

    /**
     * 2.
     */
    @Test
    public void shouldReturnLowerCaseNameOfAllHoldings() {
        final List<String> holdingNames = workShop.getHoldingNames();
        assertEquals("[nestle, coca-cola, pepsico]", holdingNames.toString());
    }


    /**
     * 3.
     */
    @Test
    public void shouldReturnHoldingsAsOneString() {
        final String holdingAsOneString = workShop.getHoldingNamesAsString();
        assertEquals("(Coca-Cola, Nestle, Pepsico)", holdingAsOneString);
    }


}
