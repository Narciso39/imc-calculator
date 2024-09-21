package com.example.imc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class App implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Código que será executado na inicialização da aplicação
        System.out.println("Aplicação IMC iniciada.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Código que será executado na destruição da aplicação
        System.out.println("Aplicação IMC encerrada.");
    }
}