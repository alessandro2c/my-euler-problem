/*******************************************************************************
 * Copyright (C) 2019 acipriani
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package it.alex2c.epr1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import it.alex2c.epr1.Calculate;



/**
 * Unit test for simple App.
 */
public class CalulateTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void eulerProblem1()
    {
	    assertTrue(Calculate.eulerProblem1(1000) == 233168);
        
    }
    
    @Test
    public void eulerProblem2()
    {
	    assertTrue(Calculate.eulerProblem2()== 4613732);
        
    }
    
    @Test
    public void eulerProblem3()
    {
	    assertTrue(Calculate.eulerProblem3(13195L)== 29);
        
    }
    
    @Test
    public void eulerProblem3v2()
    {//600851475143L
	    assertTrue(Calculate.eulerProblem3v2(13195)== 29);
        
    }
    
  //  @Test
  //  public void eulerProblem3v3()
  //  {//600851475143L
  //	    assertTrue(Calculate.eulerProblem3v3(13195L)== 29);
    // }
    
    @Test
    public void eulerProblem3v4()
    {//600851475143L
	    assertTrue(Calculate.eulerProblem3v4(600851475143L)== 6857);
        
    }

    @Test
    public void eulerProblem4()
    {//600851475143Lil numero è:906609 993 913
    	
        assertTrue(Calculate.eulerProblem4() == 906609);

    }
    
    @Test
    public void eulerProblem5()
    {//600851475143L
        assertTrue(Calculate.eulerProblem5() == 232792560);

    }
    
    @Test
    public void eulerProblem6()
    {//600851475143L
        assertTrue(Calculate.eulerProblem6(100) == 25164150);

    }
}
