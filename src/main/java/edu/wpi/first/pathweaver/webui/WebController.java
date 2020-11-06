package edu.wpi.first.pathweaver.webui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * this class is for controlling the Data passed Via Path html to java backend
 * @author Nicholas Blackburn
 */
@Controller
@RequestMapping("/")
public class WebController {
        
    // Index Webpage
    @GetMapping("index")
    public String index(){
        return "index";
    }

    // Path weaver Path editor page 
    @GetMapping("pw")
    public String pathcreator(){
        return "pw";
    }

    // Download generated path page
    @GetMapping("output")
    public String pathDisplay(){
        return "output";
    }
}
