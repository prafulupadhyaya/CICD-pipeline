/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author prafulupadhyaya
 */

@RestController
public class ControllerLayer {
    @GetMapping("/hello")
    public String greeta(){
        return "Hi From CICD Pipeline";
    }
}
