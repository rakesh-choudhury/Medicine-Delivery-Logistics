/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
/**
 *
 * @author quanpeng
 */
public class FlightSchedule {
    private Airliner airliner;
    private int flightRevenue;
    private ArrayList<Flight> fS;

    public FlightSchedule() {
        fS = new ArrayList<Flight>();
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
    
    public int getFlightRevenue() {
        return flightRevenue;
    }

    public void setFlightRevenue(int flightRevenue) {
        this.flightRevenue = flightRevenue;
    }

    public ArrayList<Flight> getFlightSchedule() {
        return fS;
    }

    public void setFlightSchedule(ArrayList<Flight> flightSchedule) {
        this.fS = flightSchedule;
    }
    
    public Flight addFlight() {
        Flight flight = new Flight();
        fS.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flight flight) {
        fS.remove(flight);
    }
}
