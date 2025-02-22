package com.example.JobSeekingApp;

import com.example.JobSeekingApp.model.JobPost;
import com.example.JobSeekingApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService js ;

    @GetMapping({"/","home"})
    public String Home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleform(JobPost jobPost ){
        js.addjob(jobPost);
        return "success" ;
    }

    @GetMapping("viewalljobs")
    public ModelAndView viewalljobs(ModelAndView mv){

        List<JobPost> jp = js.viewJobs();
        mv.addObject("jobPosts",jp);
        mv.setViewName("viewalljobs");
        return mv ;
    }



}
