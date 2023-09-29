package com.deudvalgte.miniproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

@SpringBootApplication
@EnableAsync
public class MiniProject1Application {



    public static void main(String[] args) throws RemoteException, ServiceException {
        SpringApplication.run(MiniProject1Application.class, args);
    }
}
