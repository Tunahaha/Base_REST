package org.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.example.constants.ApiConstants.BASE_URL;

@RestController
@RequestMapping(value = BASE_URL,produces = MediaType.APPLICATION_JSON_VALUE)
public class BaseController {

}
