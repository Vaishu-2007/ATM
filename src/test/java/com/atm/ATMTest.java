
package com.atm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATMTest {

    // Test 1: Balance Enquiry
    @Test
    public void testBalanceEnquiry() {

        ATM atm = new ATM(10000);

        assertEquals(10000, atm.checkBalance());
    }

    // Test 2: Cash Deposit
    @Test
    public void testDeposit() {

        ATM atm = new ATM(10000);

        atm.deposit(5000);

        assertEquals(15000, atm.checkBalance());
    }

    // Test 3: Cash Withdrawal
    @Test
    public void testWithdrawal() {

        ATM atm = new ATM(10000);

        atm.withdraw(3000);

        assertEquals(7000, atm.checkBalance());
    }

    // Test 4: Insufficient Balance
    @Test
    public void testInsufficientBalance() {

        ATM atm = new ATM(1000);

        assertThrows(
            IllegalArgumentException.class,
            () -> atm.withdraw(2000)
        );

        assertEquals(1000, atm.checkBalance());
    }

    // Test 5: Negative Deposit
    @Test
    public void testInvalidDeposit() {

        ATM atm = new ATM(10000);

        assertThrows(
            IllegalArgumentException.class,
            () -> atm.deposit(-500)
        );
    }

    // Test 6: Zero Withdrawal
    @Test
    public void testInvalidWithdrawal() {

        ATM atm = new ATM(10000);

        assertThrows(
            IllegalArgumentException.class,
            () -> atm.withdraw(0)
        );
    }

    // Test 7: Zero Deposit
    @Test
    public void testZeroDeposit() {

        ATM atm = new ATM(10000);

        assertThrows(
            IllegalArgumentException.class,
            () -> atm.deposit(0)
        );
    }
}
