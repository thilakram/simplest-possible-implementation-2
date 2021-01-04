import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

    public List<Integer> of(int number) {

        if(number == 1) {
            return emptyList();
        }
        else{
            ArrayList primeFactors =  new ArrayList<Integer>();
            primeFactors.add(number);
            return primeFactors;
        }
    }
}
