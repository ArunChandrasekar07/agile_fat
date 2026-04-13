package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class PrimeTest{
    @Test
    public void prime(){
        Prime p=new Prime();
        assertEquals("Prime",p.check(7));
    }
}