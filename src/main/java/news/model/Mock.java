package news.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * Created by Lenovo on 8/25/2021.
 */
@EntityScan
@Entity
public class Mock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    @Column(columnDefinition = "NUMBER")
    private int priority;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String headline;

    public long getId() {
        return id;
    }

    public Mock setId(long id) {
        this.id = id;
        return this;
    }

    public int getPriority() {
        return priority;
    }

    public Mock setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public String getHeadline() {
        return headline;
    }

    public Mock setHeadline(String headline) {
        this.headline = headline;
        return this;
    }

}
