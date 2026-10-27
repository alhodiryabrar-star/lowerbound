
package lowerbouunddemo;

import java.util.List;


public class NumberDemo {
    


public void showNumbers(List<? super Number> numbers) {
    numbers.add(10);
    numbers.add(5.5);
    System.out.println(numbers);
}


} 


