//: innerclasses/controller/Event.java
// The common methods for any control event.
package innerclasses.controller;

public abstract class Eventt {
  private long eventTime;
  protected final long delayTime;
  public Eventt(long delayTime) {
    this.delayTime = delayTime;
    start();
  }
  public void start() { // Allows restarting
    eventTime = System.nanoTime() + delayTime;
  }
  public boolean ready() {
    return System.nanoTime() >= eventTime;
  }
  public abstract void action();
} ///:~
