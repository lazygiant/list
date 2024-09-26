package com.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class Scen2_Complex
{
	@Test
	public void execute() throws JsonProcessingException
	{
		HashMap list = new HashMap();
		
        HashMap emp = new HashMap();
        emp.put("id", "TYP1190");
        emp.put("name", "Bikash");
        emp.put("place", "Kolkata");
        
        List skills = Arrays.asList("Java","MT","UI");
        
        HashMap company = new HashMap();
        company.put("id", "TYP");
        company.put("name", "TY");
        
        HashMap company1 = new HashMap();
        company1.put("id1", "TYP1");
        company1.put("name1", "TY1");

        List list11 = new ArrayList();
        list11.add(company);
        list11.add(company1);
        
        list.put("Employee",emp);
        list.put("Skills", skills);
        list.put("companyLoc", "Banglore");
        list.put("company", list11);
        
        ObjectMapper obj = new ObjectMapper();
        String json =  obj.writeValueAsString(list);
        System.out.println(json);   
	}
} 
