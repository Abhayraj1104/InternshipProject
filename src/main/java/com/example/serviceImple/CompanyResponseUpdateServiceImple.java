package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyResponse;
import com.example.entity.CustomerQuery;
import com.example.entity.Employee;
import com.example.repository.CompanyResponseRepository;
import com.example.repository.CustomerQueryRepository;
import com.example.repository.EmployeeRepository;
import com.example.service.CompanyResponseUpdateService;

@Service
public class CompanyResponseUpdateServiceImple implements CompanyResponseUpdateService {

    @Autowired
    private CompanyResponseRepository companyResponseRepository;

    @Autowired
    private CustomerQueryRepository customerQueryRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public CompanyResponse updateData(CompanyResponse companyResponse, Long id) {
        CompanyResponse existingResponse = companyResponseRepository.findById(id).orElse(null);
        if (existingResponse != null) {
            existingResponse.setResponseText(companyResponse.getResponseText());

            if (companyResponse.getCustomerQuery() != null && companyResponse.getCustomerQuery().getQueryId() != null) {
                CustomerQuery query = customerQueryRepository.findById(companyResponse.getCustomerQuery().getQueryId()).orElse(null);
                existingResponse.setCustomerQuery(query);
            }

            if (companyResponse.getEmployee() != null)  {
            	Employee employee =
            	        employeeRepository.findById(
            	                companyResponse.getEmployee().getId())
            	        .orElse(null);

            	existingResponse.setEmployee(employee);
            }

            return companyResponseRepository.save(existingResponse);
        }
        return null;
    }
}
