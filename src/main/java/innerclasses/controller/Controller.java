//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {
  // A class from java.util to hold Event objects:
  private List<Eventt> eventList = new ArrayList<Eventt>();
  public void addEvent(Eventt c) { eventList.add(c); }
  public void run() {
    while(eventList.size() > 0)
      // Make a copy so you're not modifying the list
      // while you're selecting the elements in it:
      for(Eventt e : new ArrayList<Eventt>(eventList))
        if(e.ready()) {
          System.out.println(e);
          e.action();
          eventList.remove(e);
        }
  }
} ///:~
