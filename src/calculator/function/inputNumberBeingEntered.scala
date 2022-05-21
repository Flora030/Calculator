package calculator.function

import calculator.function.calculatorFunction

class inputNumberBeingEntered(calculator:calculatorFunction) extends State(calculator){
  def numberButtonPressed(number:Int): Unit={
    this.calculator.display = this.calculator.display+number.toString
    this.calculator.numberString = this.calculator.numberString+number.toString
  }

  def addButtonPressed():Unit={
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.addButtonPressed()
  }

  def subtractButtonPressed():Unit={
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.subtractButtonPressed()
  }

  def multiplyButtonPressed():Unit={
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.multiplyButtonPressed()
  }

  def divideButtonPressed():Unit={
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.divideButtonPressed()
  }

  def decimalButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"."
    this.calculator.numberString = this.calculator.numberString+"."
  }

  def backspaceButtonPressed():Unit={
    this.calculator.numberString=this.calculator.numberString.dropRight(1)
    this.calculator.display=this.calculator.display.dropRight(1)
  }

  def clearButtonPressed():Unit={
    this.calculator.listOfInput=List()
    this.calculator.display=""
  }

  def enterButtonPressed():Unit={
    calculator.state=new enterPress(calculator)
    this.calculator.state.enterButtonPressed()
  }

  def displayToUser():String= {
    this.calculator.display
  }
}
