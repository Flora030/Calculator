package calculator.function

class operatorPressed(calculator:calculatorFunction) extends State(calculator){
  def numberButtonPressed(number:Int): Unit={
    calculator.state=new inputNumberBeingEntered(calculator)
    this.calculator.state.numberButtonPressed(number)
  }

  def addButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"+"
    this.calculator.listOfInput=this.calculator.listOfInput:+this.calculator.numberString:+"+"
    this.calculator.numberString=""
  }

  def subtractButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"-"
    this.calculator.listOfInput=this.calculator.listOfInput:+this.calculator.numberString:+"-"
    this.calculator.numberString=""
  }

  def multiplyButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"*"
    this.calculator.listOfInput=this.calculator.listOfInput:+this.calculator.numberString:+"*"
    this.calculator.numberString=""
  }

  def divideButtonPressed():Unit={
    this.calculator.display=this.calculator.display+"/"
    this.calculator.listOfInput=this.calculator.listOfInput:+this.calculator.numberString:+"/"
    this.calculator.numberString=""
  }

  def decimalButtonPressed():Unit={
    calculator.state=new inputNumberBeingEntered(calculator)
    this.calculator.state.decimalButtonPressed()
  }

  def backspaceButtonPressed():Unit={

    if(this.calculator.listOfInput.last.length==1){
      this.calculator.listOfInput=this.calculator.listOfInput.dropRight(1)
      this.calculator.display=this.calculator.display.dropRight(1)
    }
    else{
      var newLastElement=this.calculator.listOfInput.last.dropRight(1)
      this.calculator.listOfInput=this.calculator.listOfInput.dropRight(1):+newLastElement
      this.calculator.display=this.calculator.display.dropRight(1)
    }
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
