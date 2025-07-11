package com.example.JobSeekingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
public class JobPost {
        @Id
        public int postId ;
        public String postDesc;
        public String postProfile;
        public int reqExperience ;
        public List<String> postTechStack;
}
