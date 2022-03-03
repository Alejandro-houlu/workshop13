package sg.edu.nus.iss.workshop13.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.utility.RandomString;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userID;

    private String name;

    private String email;

    private String phoneNumber;

    private String uniqueId;

    public Long getUserID() {
		return userID;
	}


	public void setUserID(Long userID) {
		this.userID = userID;
	}

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String email){
        return this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber){
        return this.phoneNumber = phoneNumber;
    }

    public String getUniqueId(){
        return uniqueId;
    }

    public String setUniqueId(){
        
        String uniqueId = UUID.randomUUID().toString();
        return uniqueId.substring(0,8);
    }

    public User(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

        this.uniqueId = setUniqueId();

    }

    public User(){}

    


    


}
