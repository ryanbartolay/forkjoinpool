package com.ryan.concurrency.forkjoinpool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class App 
{
	public static void main( String[] args ) {    	
		/*	ForkJoinPool forkJoinPool = new ForkJoinPool(4);
    	MyRecursiveAction myRecursiveAction = new MyRecursiveAction(24);

    	forkJoinPool.invoke(myRecursiveAction);*/		

		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream(new File("jndi.properties")));
		
	
			Context initCtx = new InitialContext(properties);
			Context envCtx = (Context) initCtx.lookup("java:jboss/datasources/ExampleDS");


			System.out.println(envCtx);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
