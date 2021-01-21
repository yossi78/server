package com.example.server.api;
import com.example.server.dto.Human;
import com.example.server.dto.HumansResponse;
import com.example.server.dto.Policeman;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;




@RestController
@RequestMapping(value = "/v1/lab")
public class LabController {



    @GetMapping
    public ResponseEntity  getIncomingEnrichmentRequest() {
        try {

            Human a=new Human("Avi",27);
            Human b=new Human("Beni",37);
            Policeman c=new Policeman("Charlly",47,3000);
            Human d=new Human("Dority",57);
            Policeman e=new Policeman("Eli",67,5000);

            List<Human> humans = new ArrayList<>();
            humans.add(a);
            humans.add(b);
            humans.add(c);
            humans.add(d);
            humans.add(e);


            HumansResponse humanResponse = new HumansResponse();
            humanResponse.setList(humans);

            return new ResponseEntity(humanResponse, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getCause(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
