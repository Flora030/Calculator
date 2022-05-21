package calculator.function

import jdk.internal.org.jline.utils.Display

abstract class State(currentState:calculatorFunction) {
  //All the methods that the classes shares
  //Each class implements the methods below differently

  def numberButtonPressed(number:Int): Unit

  def addButtonPressed():Unit

  def subtractButtonPressed():Unit

  def multiplyButtonPressed():Unit

  def divideButtonPressed():Unit

  def decimalButtonPressed():Unit

  def backspaceButtonPressed():Unit

  def clearButtonPressed():Unit

  def enterButtonPressed():Unit

  def displayToUser():String

}
