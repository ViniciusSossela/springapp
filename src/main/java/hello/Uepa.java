package hello;

/**
 * Created by vsossella on 22/05/17.
 */
public class Uepa {

    private final long id;
    private final String content;

    public Uepa(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
