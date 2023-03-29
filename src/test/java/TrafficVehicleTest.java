import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrafficVehicleTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        TrafficVehicle trafficVehicle = new TrafficVehicle("Supra", "Toyota", "vermelho");

        TrafficVehicle trafficVehicleClone = trafficVehicle.clone();
        trafficVehicleClone.setColor("azul");
        trafficVehicleClone.setManufacturer("Mazda");
        trafficVehicleClone.setModel("rx-7");

        assertEquals("Toyota, modelo Supra, na cor vermelho", trafficVehicle.toString());
        assertEquals("Mazda, modelo rx-7, na cor azul", trafficVehicleClone.toString());
    }
}
