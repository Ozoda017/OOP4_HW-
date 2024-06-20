package less4.Service;

import java.util.List;

public interface UserService<T>  {
    public List<T> getAll();
    public void initData(List<T> list);
    public void create(String name, String lastname);
}
