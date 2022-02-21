package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ShellCli {
    @ShellMethod("just a test")
    public void testMe(@ShellOption(help = "Text for the test") String text) {

        System.out.println("<<" + text);
    }
}
