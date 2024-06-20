package less4.Comparator;

import java.util.Comparator;

import less4.Model.User;

public class UserComparator<T extends User> implements Comparator<T>{

    @Override
    public int compare(T arg0, T arg1) {
        String name0 = arg0.getname() + arg0.getLastname();
        String name1 = arg1.getname() + arg1.getLastname();
        return name0.compareToIgnoreCase(name1);        
    }
    
}
