package com.sunglowsys.configuration;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {
    @Bean
    public Employee getEmployee() {
        return new Employee();
    }

    @Bean
    public Address getAddress() {
        return new Address();
    }
}
