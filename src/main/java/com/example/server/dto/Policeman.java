package com.example.server.dto;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
public class Policeman extends Human{

    private int rankNum;


    public Policeman(String name, int age, int rankNum) {
        super(name, age);
        this.rankNum = rankNum;
    }

}
