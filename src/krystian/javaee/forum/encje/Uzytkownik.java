package krystian.javaee.forum.encje;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="uzytkownik")
public class Uzytkownik{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String login;
private String haslo;
public String getHaslo() {
	return haslo;
}
public void setHaslo(String haslo) {
	this.haslo = haslo;
}
private Timestamp data;

@OneToMany(mappedBy="uzytkownik", fetch=FetchType.EAGER)
private Set<Temat> tematy;

@OneToMany(mappedBy="uzytkownik",fetch=FetchType.EAGER)
private Set<Wpis> wpisy;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public Timestamp getData() {
	return data;
}
public void setData(Timestamp data) {
	this.data = data;
}
public Set<Temat> getTematy() {
	return tematy;
}
public void setTematy(Set<Temat> tematy) {
	this.tematy = tematy;
}
public Set<Wpis> getWpisy() {
	return wpisy;
}
public void setWpisy(Set<Wpis> wpisy) {
	this.wpisy = wpisy;
}
}
