package com.teamtreehouse.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    @Test
    public void addingFundsIncrementsAvailableFunds() {
        Creditor creditor = new Creditor();

        creditor.addFunds(25);
        creditor.addFunds(25);

        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds() {
    }
}