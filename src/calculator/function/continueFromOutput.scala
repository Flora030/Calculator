package calculator.function
import calculator.function.calculatorFunction

class continueFromOutput(calculator:calculatorFunction) extends State(calculator){
  def numberButtonPressed(number:Int): Unit={
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.numberButtonPressed(number)
  }

  //Add,subtract,divide,and multiply button method list of input does not have numberString added to listOfInput
  //because when enter is press, it sets numberString to ""
  def addButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"+"
    this.calculator.listOfInput=this.calculator.listOfInput:+"+"
    this.calculator.numberString=""
  }

  def subtractButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"-"
    this.calculator.listOfInput=this.calculator.listOfInput:+"-"
    this.calculator.numberString=""
  }

  def multiplyButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"*"
    this.calculator.listOfInput=this.calculator.listOfInput:+"*"
    this.calculator.numberString=""
  }

  def divideButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"/"
    this.calculator.listOfInput=this.calculator.listOfInput:+"/"
    this.calculator.numberString=""
  }

  def decimalButtonPressed(): Unit={
    this.calculator.display=this.calculator.display+"."
    this.calculator.listOfInput=this.calculator.listOfInput:+"."
  }

  def backspaceButtonPressed():Unit={
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.backspaceButtonPressed()
  }

  def clearButtonPressed():Unit={
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.clearButtonPressed()
  }

  def enterButtonPressed():Unit={
    calculator.state=new enterPress(calculator)
    this.calculator.enterButtonPressed()
  }

  def displayToUser():String={
    this.calculator.display
  }

}
