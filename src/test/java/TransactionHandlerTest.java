package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import coordinator.TransactionHandler;

import javax.transaction.Transaction;

/**
 * Created with IntelliJ IDEA.
 * User: guru
 * Date: 11/4/13
 * Time: 6:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionHandlerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetInstance() throws Exception {
        TransactionHandler transactionHandler = TransactionHandler.getInstance();
        assertTrue(transactionHandler instanceof TransactionHandler);
    }

    @Test
    public void testCreateTransactionIsString() throws Exception {
        TransactionHandler transactionHandler = TransactionHandler.getInstance();
        String tid = transactionHandler.createTransaction();
        assertTrue(tid instanceof String);
    }

    @Test
    public void testCreateTransactionIsTransactionObj() throws Exception {
        TransactionHandler transactionHandler = TransactionHandler.getInstance();
        String tid = transactionHandler.createTransaction();
        Transaction transaction = transactionHandler.getTransaction(tid);
        assertTrue(transaction instanceof Transaction);
    }

    @Test
    public void testGetTransaction() throws Exception {
        TransactionHandler transactionHandler = TransactionHandler.getInstance();
        String tid = transactionHandler.createTransaction();
        Transaction transaction = transactionHandler.getTransaction(tid);
        assertTrue(transaction instanceof Transaction);
    }
}
