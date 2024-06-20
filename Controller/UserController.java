package less4.Controller;

import less4.Model.User;

public interface UserController<T extends User> {
	void create(String name, String lastname);
}
