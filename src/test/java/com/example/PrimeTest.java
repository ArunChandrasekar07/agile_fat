package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class PrimeTest{
    Prime e=new Prime();
    @Test
    public void prime(){
        assertEquals("Prime",e.check(2));
    }
    @Test
    public void notprime(){
        assertEquals("Not Prime",e.check(7));
    }
}