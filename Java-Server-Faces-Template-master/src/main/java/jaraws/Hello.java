package jaraws;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Hello {
  private String name;
  
  public Hello() {}
  
  public String getName() { 
    return name; 
  }
  
  public void setName(String value) { 
    this.name = value; 
  }
}
