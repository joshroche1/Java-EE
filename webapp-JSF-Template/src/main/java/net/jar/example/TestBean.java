package net.jar.example;


import javax.faces.bean.ManagedBean;

@ManagedBean(name = "testbean", eager = true)
public class TestBean {

  private String testString = "";

  public TestBean() {
    this.testString = "TEST Test test";
  }

  public String getString() { return this.testString; }
}
