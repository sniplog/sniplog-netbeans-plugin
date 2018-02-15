/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sniplog.test;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sniplog.sniplogtoolbar.SniplogReader;

/**
 *
 * @author zieteada
 */
public class SniplogUnitTest {
    
    public SniplogUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void sniplogReader() throws JSONException, IOException {
     
        SniplogReader reader = new SniplogReader();
        
        JSONObject msg = reader.readData("get_entry_by_id", 62);

        JSONObject result = msg.getJSONArray("data").getJSONObject(0);
        String access = (String) result.get("access");
        String description = (String) result.get("description");
        
        assertEquals("0", access);
        assertFalse(description.isEmpty());
        
        System.out.println(access);
        System.out.println(description);
     }
}
