package controller;

import domain.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.ResultsService;

import java.util.List;

@RestController
public class Controllers {

    @Autowired
    private ResultsService resultsService;

//    @RequestMapping (method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping ("/results")
    public List<Results> findAll(){
        return resultsService.findAll();
    }

}
