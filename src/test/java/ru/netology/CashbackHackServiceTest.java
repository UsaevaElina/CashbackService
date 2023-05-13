package ru.netology;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testShouldAmount500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void testShouldAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void testShouldAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void testShouldAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }
}