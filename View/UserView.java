package less4.View;

import java.util.List;

import less4.Model.User;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}
