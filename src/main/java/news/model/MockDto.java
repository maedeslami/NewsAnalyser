package news.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lenovo on 8/26/2021.
 */
public class MockDto implements Serializable {
    private int priority;
    private List<String> headline;

    public int getPriority() {
        return priority;
    }

    public MockDto setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public List<String> getHeadline() {
        return headline;
    }

    public MockDto setHeadline(List<String> headline) {
        this.headline = headline;
        return this;
    }
}
