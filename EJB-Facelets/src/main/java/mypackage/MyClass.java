package mypackage;


import javax.faces.bean.ManagedBean;

@ManagedBean(name = "testbean", eager = true)
public class MyClass {
  private String testString = "";
  
  public MyClass() {
    this.testString = "Testing test TEST";
  }
  
  public String getString() {
    return this.testString;
  }
}
