package com.ubs.mf.controller;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstFunctionInterface {
	
	/*@Bean
	public Function<String,String> organise() {
		return 
	}*/
	
	 /*@Bean
	  public Function<Flux<String>, Flux<String>> uppercase() {
	    return flux -> flux.map(value -> value.toUpperCase());
	  }*/
	
	@Bean
    public Function<String, String> function() {
        return input -> input;
    }

    @Bean
    public Consumer<String> consume() {
        return input -> {
            System.err.println("Input-" + input);
        };
    }

    @Bean
    public Supplier<String> supply() {
        return () -> "Hello from Supplier";
    }

}
