package Observer;

import java.util.List;

/**
 * Created by toor on 11.04.17.
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
