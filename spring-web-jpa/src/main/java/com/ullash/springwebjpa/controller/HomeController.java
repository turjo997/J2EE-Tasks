package com.ullash.springwebjpa.controller;

import com.ullash.springwebjpa.model.Programmer;
import com.ullash.springwebjpa.repository.ProgrammerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@ControllerAdvice
public class HomeController {

    @Autowired
    ProgrammerRepo pr;
    @ModelAttribute
    public void welcome(Model m){
        m.addAttribute("msg" , "welcome to programmers world");
    }
    @RequestMapping("/home")
    public String HomePage(){
        return "Home.html";
    }

//    @RequestMapping("/addProgrammer")
//    public String addProgrammer(@RequestParam int pId , @RequestParam String pName ,
//                                @RequestParam String pLang , Model model){
//
//        model.addAttribute("pId" , pId);
//        model.addAttribute("pName" , pName);
//        model.addAttribute("pLang" , pLang);
//        return "ProgrammerInfo.html";
//    }


//    @RequestMapping("/addProgrammer")
//    public ModelAndView addProgrammer(@RequestParam int pId , @RequestParam String pName ,
//                                      @RequestParam String pLang){
//
//        ModelAndView mb = new ModelAndView();
//        mb.setViewName("ProgrammerInfo.html");
//        mb.addObject("pId" , pId);
//        mb.addObject("pName" , pName);
//        mb.addObject("pLang" , pLang);
//
//        return mb;
//    }


//    @RequestMapping("/addProgrammer")
//    public ModelAndView addProgrammer(@ModelAttribute Programmer Programmer){
//        ModelAndView mb = new ModelAndView();
//        mb.setViewName("ProgrammerInfo.html");
//        return mb;
//    }



  //  @RequestMapping(value = "/addProgrammer" , method = RequestMethod.POST)
    @PostMapping(value = "/addProgrammer")
    public String addProgrammer(@ModelAttribute Programmer Programmer){
        pr.save(Programmer);
        //return "ProgrammerInfo.html";
        return "redirect:/home";
    }


    @GetMapping("/allProgrammer")
    public String allProgrammer(Model m){
        List<Programmer> p = new ArrayList<>();
        p.add(new Programmer(1 , "Khalid" , "Java"));
        p.add(new Programmer(2 , "Farhan" , "JavaScript"));
        p.add(new Programmer(3 , "Raju" , "C++"));

        m.addAttribute("programmers" , p);
        return "allProgrammer.html";
    }






}
