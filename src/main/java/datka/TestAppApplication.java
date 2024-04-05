package datka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class TestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAppApplication.class, args);
        System.out.println("Project is running...");

        Random random= new Random();
        int num1= random.nextInt(10,40);
        int num2= random.nextInt(8);
        System.out.println("Рандом сандар:"+num1+","+num2+"\n"+
                "Эки бутун сандын ортосундагы айырмачылык=" +(num1-num2)+"\n"+
                "Максималдуу бутун сан="+((num1-num2)+num2)+"\n"+
                "Минималдуу бутун сан="+((num1-num2)+num2-(num1-num2)));
    }

}
