package com.toby;

import org.w3c.dom.Text;

public class Main {

  public static void main(String[] args) {
    var textbox = new TextBox();
//    textbox.setText("Hello World");
//    System.out.println(textbox.toString());
//    System.out.println(textbox);

    var control = new UIControl(true);
    show(control); // downcasting: UIControl -> TextBox

    show(textbox); // upcasting: TextBox -> UIControl
  }

  public static void show(UIControl control){
    // downcasting: you need to check instanceof
    // when you are casting a more general object
    // to a more specific object.
    // i.e. without this check, show(control) will fail.
    if (control instanceof TextBox){
      var textbox = (TextBox) control;
      textbox.setText("Hello World");
    }
    System.out.println(control);
  }
}
