package com.ubs.mf.controller;

import java.io.File;
import java.io.IOException;

import org.codehaus.groovy.control.CompilationFailedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

@RestController
@RefreshScope
public class MasterfilesBackgroundProcessController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${limit-service.maximum}")
	Integer val;
	
	private GroovyClassLoader loader;
	
	@GetMapping("/get-sum")
	public Integer getSum() {
		
		Integer x = 0;
		loader = new GroovyClassLoader();
		Binding b;
		MyBean bean = new MyBean();
		bean.setVar1(23);
		bean.setVar2(25);
		
		Class calcClass;
		try {
			calcClass = loader.parseClass(
				      new File("E:\\Workspace\\MasterfilesBackgroundProcess\\src\\main\\java\\com\\ubs\\mf\\controller","CalcMath.groovy"));
			
			 GroovyObject calc = (GroovyObject) calcClass.newInstance();
			    Integer y = (Integer) calc.invokeMethod("calcSum", new Object[] {bean});
			    System.out.println(val);
			    x = y;
		} catch (CompilationFailedException | IllegalAccessException |  InstantiationException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			   
		
		return x;
		
	}
	
}
