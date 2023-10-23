package bodhi.technology.backoffice.model.usermodel;


import javax.persistence.*;


@Entity
@Table(name = "roles")
public class RoleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(nullable = false, unique = true,length = 10)
    private String name;
 
    public RoleModel() { }
     
    public RoleModel(String name) {
        this.name = name;
    }
     
    public RoleModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public RoleModel(Integer id) {
        this.id = id;
    }
     
 
    @Override
    public String toString() {
        return this.name;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
    
    
}