package CoreJava.collections;
import java.util.*;

public class colQ1 {
    public static void main(String[] args) {
        Contact obj = new Contact((long)912121311, "Aryan", "aryan@gmail.com", "male");
        Contact obj1 = new Contact((long)912121312, "Aryan1", "aryan1@gmail.com", "male");
        Contact obj2 = new Contact((long)912121313, "Aryan2", "aryan2@gmail.com", "male");
        Contact obj3 = new Contact((long)912121314, "Aryan3", "aryan3@gmail.com", "male");
        Map<Long,Contact> map = new TreeMap<>();
        map.put(obj.phNum, obj);
        map.put(obj1.phNum, obj1);
        map.put(obj2.phNum, obj2);
        map.put(obj3.phNum, obj3);
        
        System.out.println(map);
        
        
         for(Map.Entry<Long,Contact> m:map.entrySet()){
                 Contact objNew = m.getValue();
                 System.out.println(m.getKey()+" "+objNew.email+" "+objNew.gender+" "+objNew.name);
             }

      
         for(Map.Entry<Long,Contact> m:map.entrySet()){
             System.out.println(m.getKey());
         }

      
         for(Map.Entry<Long,Contact> m:map.entrySet()){
             Contact objNew = m.getValue();
             System.out.println(objNew.email+" "+objNew.gender+" "+objNew.name);
        System.out.println(m.getValue());
         }
    }
}
class Contact{
    Long phNum;
    String name,email,gender;
    public Contact(Long phNum,
    String name,String email,String gender){
        this.phNum=phNum;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    
    
}