package fr.lernejo.travelsite;


import java.util.ArrayList;

public class UserRegistry<inscriptions> {

    private final ArrayList<Users> inscriptions;

    public UserRegistry() {
        inscriptions = new ArrayList<>();
    }

    public UserRegistry(ArrayList<Users> inscriptions) {
        this.inscriptions = inscriptions;
    }


}
