package es.codeurjc.test.complex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ComplexTest {

    @Test
    void partesTest(){
        //Given
        Complex complex = new Complex(0,0);
        //When
        double realPart = complex.getRealPart();
        double imaginaryPart = complex.getImaginaryPart();
        //Then
        assertEquals(realPart,0,"Real part should be zero");
        assertEquals(imaginaryPart,0,"Imaginary part should be zero");
    }

    @Test
    void sumaNeutraTest(){
        Complex complex1 = new Complex(0,0);
        Complex complex2 = complex1.add(complex1);
        assertEquals(complex2.getImaginaryPart(),0);
        assertEquals(complex2.getRealPart(),0);
    }


	
}
