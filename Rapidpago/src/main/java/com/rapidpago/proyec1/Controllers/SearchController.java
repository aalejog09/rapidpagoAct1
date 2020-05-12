package com.rapidpago.proyec1.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rapidpago.proyec1.Models.AjaxResponseBody;
import com.rapidpago.proyec1.Models.Employee;
import com.rapidpago.proyec1.Models.SearchCriteria;
import com.rapidpago.proyect1.Services.EmployeeService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SearchController {

    EmployeeService employeeServices;

    @Autowired
    public void setUserService(EmployeeService employeeServices) {
        this.employeeServices = employeeServices;
    }

    @PostMapping("/api/search")
    public ResponseEntity<?> getSearchResultViaAjax(
            @Valid @RequestBody SearchCriteria search, Errors errors) {

        AjaxResponseBody result = new AjaxResponseBody();

        //If error, just return a 400 bad request, along with the error message
        if (errors.hasErrors()) {

            result.setMsg(errors.getAllErrors()
                        .stream().map(x -> x.getDefaultMessage())
                        .collect(Collectors.joining(",")));

            return ResponseEntity.badRequest().body(result);

        }

        List<Employee> employees = employeeServices.getAll();
        if (employees.isEmpty()) {
            result.setMsg("no user found!");
        } else {
            result.setMsg("success");
        }
        result.setResult(employees);

        return ResponseEntity.ok(result);

    }

}