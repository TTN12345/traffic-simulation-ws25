// src/main/java/de/uni/traffic/sim/TestTraaS.java
package de.uni.traffic.sim;

import de.tudresden.ws.TrafficSimulation;

public class TestTraaS {
    public static void main(String[] args) {
        TrafficSimulation ts = new TrafficSimulation();
        
        // Start SUMO with a simple config (you'll create this later)
        ts.start("sumo", "-c", "src/main/resources/simple.sumocfg");
        
        // Run 100 steps
        for (int i = 0; i < 100; i++) {
            ts.doTimestep();
            System.out.println("Simulation step: " + i);
        }
        
        ts.stop();
        System.out.println("SUMO stopped.");
    }
}