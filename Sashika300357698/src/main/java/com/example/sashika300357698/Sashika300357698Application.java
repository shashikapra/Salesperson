package com.example.sashika300357698;

import com.example.sashika300357698.entities.Salesman;
import com.example.sashika300357698.repositories.SalesmanRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Sashika300357698Application {

    public static void main(String[] args) {
        SpringApplication.run(Sashika300357698Application.class, args);
    }
    //@Bean
//    CommandLineRunner commandLineRunner(SalesmanRepository studentRepository){
//
////        return args -> {
////            studentRepository.save(new Salesman(null, "Jam", new Date(), false, 1.2));
////            studentRepository.save(new Salesman(null, "Jen", new Date(), true, 3.2));
////            studentRepository.findAll().forEach(p->{
////                System.out.println(p.getName());
////            });
////        };
//  //  }
}
