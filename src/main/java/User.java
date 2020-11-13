import javax.persistence.OneToMany;
import java.util.List;

public class User {
    String id;
    String username;
    private String password;
    private String email;

    //In your User and Post classes, define the post - user relationship.
    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
