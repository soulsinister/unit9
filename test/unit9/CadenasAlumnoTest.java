/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

import java.nio.BufferOverflowException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Miguel
 */
public class CadenasAlumnoTest{
    
    public CadenasAlumno ca;

    String cadena1;
    String cadena2;
    boolean expecteds;
    
    public CadenasAlumnoTest() {
        ca = new CadenasAlumno();
        cadena1 = "bla";
        cadena2 = "bla2";
        expecteds  = false;
    }

    
    @Test()
    public void testSonIguales() {

        assertEquals(expecteds, ca.sonIguales(cadena1, cadena2));
        
        cadena2 = "bla";
        expecteds = true;
        assertEquals(expecteds, ca.sonIguales(cadena1, cadena2));

    }
        

    @Test
    public void testEsMayor() {
        
        assertEquals(expecteds, ca.esMayor(cadena1, cadena2));
        
        cadena1 = "blabla";
        expecteds = true;
        assertEquals(expecteds, ca.esMayor(cadena1, cadena2));
        
        cadena2 = "blablabla";
        expecteds = false;
        assertEquals(expecteds, ca.esMayor(cadena1, cadena2));
    }

    @Test
    public void testEsMenor() {
        
        assertEquals(expecteds, ca.esMenor(cadena2, cadena1));
        
        cadena1 = "blablabla";
        expecteds = true;
        assertEquals(expecteds, ca.esMenor(cadena2, cadena1));
    }

    @Test
    public void testComparaIgnorandoMayusculas() {
        assertEquals(expecteds, ca.comparaIgnorandoMayusculas(cadena2, cadena1));
        
        cadena2 = "blablabla";
        expecteds = false;
        assertEquals(expecteds, ca.comparaIgnorandoMayusculas(cadena2, cadena1));
    }

    @Test
    public void testReemplazaTodos() {
        cadena1 = "blablablabla";
        cadena2 = "mam";
        
        String expected = "mamamamamamamama";
        assertEquals(expected, ca.reemplazaTodos(cadena1, "bl", cadena2));
        
    }

    @Test
    public void testReemplazaPrimero() {
        cadena1 = "blablablabla";
        cadena2 = "mam";
        
        String expected = "mamablablabla";
        assertEquals(expected, ca.reemplazaPrimero(cadena1, "bl", cadena2));

    }

    @Test
    public void testQuitaEspacios() {
        cadena1 = "   bla ";
        
        String expected = "bla";
        assertEquals(expected, ca.quitaEspacios(cadena1));
    }

    @Test
    public void testConvertirMayusculas() {
        cadena1 = "bLAaa";
        
        String expected = "BLAAA";
        assertEquals(expected, ca.convertirMayusculas(cadena1));
    }

    @Test
    public void testConvertirMinusculas() {
        cadena1 = "bLAaa";
        
        String expected = "blaaa";
        assertEquals(expected, ca.convertirMinusculas(cadena1));
    }

    @Test
    public void testLongitudCadena() {
        long expected = 3;
        assertEquals(expected, ca.longitudCadena(cadena1));
    }

    @Test
    public void testEmpiezaCon() {
        assertEquals(expecteds, ca.empiezaCon(cadena1, cadena2));
        cadena2 = "bl";
        expecteds = true;
        assertEquals(expecteds, ca.empiezaCon(cadena1, cadena2));
    }

    @Test
    public void testAcabaEn() {
        assertEquals(expecteds, ca.acabaEn(cadena1, cadena2));
        cadena2 = "la";
        expecteds = true;
        assertEquals(expecteds, ca.acabaEn(cadena1, cadena2));
    }

    @Test
    public void testPosicionPrimeraCadena() {
        
        long expected = 3;
        cadena1 = "bloblabla";
        cadena2 = "bla";
        assertEquals(expected, ca.posicionPrimeraCadena(cadena1, cadena2));
        
    }

    

    @Test
    public void testExtraerSubstring_String_int() {
        String expected = "bla";
        assertEquals(expected, ca.extraerSubstring(cadena1, 0));
        
        cadena1 = "bloblabla";
        expected = "oblabla";
        assertEquals(expected, ca.extraerSubstring(cadena1, 2));
        expected = "";
        assertEquals(expected, ca.extraerSubstring(cadena1, 9,0));
        
    }

    @Test
    public void testExtraerSubstring_3args() {
        String expected = "bla";
        assertEquals(expected, ca.extraerSubstring(cadena1, 0,3));
        
        cadena1 = "bloblabla";
        expected = "obla";
        assertEquals(expected, ca.extraerSubstring(cadena1, 2,5));
        expected = "";
        assertEquals(expected, ca.extraerSubstring(cadena1, 9));
    }

    @Test
    public void testConcatenaCadenas() {
        String expected = "blabla2";
        assertEquals(expected, ca.concatenaCadenas(cadena1, cadena2));
    }

}
