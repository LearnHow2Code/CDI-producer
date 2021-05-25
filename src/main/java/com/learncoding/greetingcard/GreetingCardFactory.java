/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learncoding.greetingcard;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
//import javax.ws.rs.Produces;

/**
 *
 * @author Alem
 */

@SessionScoped
public class GreetingCardFactory implements Serializable {
    
    private static final long serialVersionUID = -44416514616012281L;
 
    private GreetingType greetingType;
    
    @Produces
    @Greetings(GreetingType.HELLO)
    public GreetingCard getGreetingCard() {
        return new GreetingCardImpl();
    }
     
    @Produces
    @Greetings(GreetingType.HI)
    public GreetingCard getAnotherGreetingCard() {
        return new AnotherGreetingCardImpl();
    }
    
    
    /*
    @Produces
    public GreetingCard getGreetingCard() {
 
        switch (greetingType) {
        case HELLO:
            return new GreetingCardImpl();
        case HI:
            return new AnotherGreetingCardImpl();
        default:
            return null;
        }
    }
    
    @Produces
    public GreetingCard getAnotherGreetingCard() {
 
        switch (greetingType) {
        case HELLO:
            return new GreetingCardImpl();
        case HI:
            return new AnotherGreetingCardImpl();
        default:
            return null;
        }
    }*/
    
    /*
    @Produces
    public GreetingCardImpl getGreetingCard(@New GreetingCardImpl greetingCard) {
        return greetingCard;
    }*/
}
