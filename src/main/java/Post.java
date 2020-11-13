import javax.persistence.*;

@Entity
@Table(name="posts")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 240)
    private String title;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    private User user;

    //private String title;
    //private String body;

    public String getTitle(){
        return title;
    }
    public String getBody(){
        return body;
    };

    public void setTitle(String title){
        this.title=title;
    };
    public void setBody(String body){
        this.body=body;
    };
}
