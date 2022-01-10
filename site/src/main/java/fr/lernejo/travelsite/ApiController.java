package fr.lernejo.travelsite;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {


    public final  ArrayList<Users> inscriptions;
    private final ArrayList<voyages> destinations;




    public ApiController(ArrayList<Users> inscriptions, ArrayList<voyages> travels) {
        this.inscriptions = inscriptions;
        this.destinations = travels;
    }


    @PostMapping("/api/inscription")
    public void postInscription(@RequestBody Users inscription) {
        inscriptions.add(inscription);
    }

    @GetMapping("/api/inscription")
    public List<Users> getInscriptions() {
        return inscriptions;
    }

    @GetMapping("/api/travels")
    public Iterable<voyages> getTravels(@RequestParam String userName) {
        destinations.add(new voyages("France", 23));
        destinations.add(new voyages("Australia", 32));
        return destinations;
    }

}
