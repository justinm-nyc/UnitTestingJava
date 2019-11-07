package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    private Creditor creditor;

    @Before
    public void setUp() throws Exception {
        creditor = new Creditor();
    }

    @Test
    public void addingFundsIncrementsAvailableFunds() {

        creditor.addFunds(25);
        creditor.addFunds(25);

        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds() {
        creditor.addFunds(10);

        int refund = creditor.refund();

        assertEquals(10, refund);
    }

    @Test
    public void refundingResetsAvailableFundsToZero() {
        creditor.addFunds(10);

        creditor.refund();

        assertEquals(0, creditor.getAvailableFunds());
    }

    @Test
    public void enoughFundsAvailable() throws Exception{
        creditor.addFunds(50);
        creditor.deduct(20);

        assertEquals(30,creditor.getAvailableFunds());
    }

    @Test(expected = NotEnoughFundsException.class)
    public void notEnoughFundsAvailableTest() throws Exception {
        creditor.deduct(20);
    }
}


