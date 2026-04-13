package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class EvenTest{
    Prime e=new Prime();
    @Test
    public void even(){
        assertEquals("Prime",e.check(2));
    }
    @Test
    public void odd(){
        assertEquals("Not Prime",e.check(7));
    }
}