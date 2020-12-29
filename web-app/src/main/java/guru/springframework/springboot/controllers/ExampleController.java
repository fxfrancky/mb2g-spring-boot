package guru.springframework.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fx on 27/12/2020
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String,Object> getIndex(){
        Map<String,Object> returnval = new HashMap<>();
        returnval.put("Hello","world");
        return returnval;
    }
}
