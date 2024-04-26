package org.nonenane.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {
        //SpringApplication.run(DemoApplication.class, args);
        String signature  = "";
        CrptApi.Document document = new CrptApi.Document();
        CrptApi crptApi = new CrptApi(TimeUnit.SECONDS, 1);
        crptApi.createDocument(document, signature);
        crptApi.shutdown();
    }

}
