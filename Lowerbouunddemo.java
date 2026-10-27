
import java.util.LinkedList;
import java.util.List;
import lowerbouunddemo.NumberDemo;
import lowerbouunddemo.Pinter;
public class Lowerbouunddemo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Pinter p = new Pinter(); 
        p.show("Hello Java"); p.show(100); 
         NumberDemo   n = new  NumberDemo(); 
        List<Number> numbers = new LinkedList<>();
        n.showNumbers(numbers); }
    }
    

