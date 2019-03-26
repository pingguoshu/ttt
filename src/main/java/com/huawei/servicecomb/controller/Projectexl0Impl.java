package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-03-26T12:50:51.888Z")

@RestSchema(schemaId = "projectexl0")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectexl0Impl {

    @Autowired
    private Projectexl0Delegate userProjectexl0Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectexl0Delegate.helloworld(name);
    }

}
