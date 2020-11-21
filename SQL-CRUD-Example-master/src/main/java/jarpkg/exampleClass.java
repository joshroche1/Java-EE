package jarpkg;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class exampleClass {

  private String message = "Hello user";
  
  public String getMessage() {
    return this.message;
  }
}
