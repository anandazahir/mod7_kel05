// TrackerBean.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package tracker.ejb;
import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author usser
 */
@Stateful
public class TrackerBean implements TrackerBeanLocal {
    private double total = 0;
    private int count = 0;
    private List<Double> evenNumbers = new ArrayList<>();
    private List<Double> oddNumbers = new ArrayList<>();
    
    @Override
    public double add(double value) {
        total += value;
        count += 1;
        if (value % 2 == 0) {
            evenNumbers.add(value);
        } else {
            oddNumbers.add(value);
        }
        return total;
    }
    @Override
    public double average() {
        return total / count;
    }
    @Override
    public int getCount() {
        return count;
    }
    @Override
    public double getTotal() {
        return total;
    }
    @Override
    public List<Double> getEvenNumbers() {
        return evenNumbers;
    }

    @Override
    public List<Double> getOddNumbers() {
        return oddNumbers;
    }
    
}