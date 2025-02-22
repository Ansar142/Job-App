package com.example.JobSeekingApp.service;

import com.example.JobSeekingApp.model.JobPost;
import com.example.JobSeekingApp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo ;
    public void addjob(JobPost jp){
        repo.save(jp);
    }
    public List<JobPost> viewJobs(){
        return repo.viewall();
    }




}
