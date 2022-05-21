package calculator.function

class enterPress(calculator:calculatorFunction) extends State(calculator){
  def numberButtonPressed(number:Int): Unit={
    this.calculator.display=""
    this.calculator.listOfInput=List()
    calculator.state=new operatorPressed(calculator)
    this.calculator.state.numberButtonPressed(number)
  }

  def addButtonPressed():Unit={
    calculator.state=new continueFromOutput(calculator)
    this.calculator.state.addButtonPressed()
  }

  def subtractButtonPressed():Unit={
    calculator.state=new continueFromOutput(calculator)
    this.calculator.state.subtractButtonPressed()
  }

  def multiplyButtonPressed():Unit={
    calculator.state=new continueFromOutput(calculator)
    this.calculator.state.multiplyButtonPressed()
  }

  def divideButtonPressed():Unit={
    calculator.state=new continueFromOutput(calculator)
    this.calculator.state.divideButtonPressed()
  }

  def decimalButtonPressed():Unit={
    calculator.state=new continueFromOutput(calculator)
    this.calculator.state.decimalButtonPressed()
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
    this.calculator.listOfInput=this.calculator.listOfInput:+this.calculator.numberString
    this.calculator.numberString=""
    println("list of input is "+ this.calculator.listOfInput)
    while (calculator.listOfInput.contains("/")==true){
      var locationOfDivideSign=this.calculator.listOfInput.indexOf("/")
      var number1=this.calculator.listOfInput(locationOfDivideSign-1).toDouble
      var number2=this.calculator.listOfInput(locationOfDivideSign+1).toDouble
      var resultFromDividing:Double=number1/number2
      var (left,leftover)=this.calculator.listOfInput.splitAt(locationOfDivideSign-1)
      left=left:+resultFromDividing.toString
      var right=leftover.drop(3)
      this.calculator.listOfInput=left++right
      println(this.calculator.listOfInput)
    }
    while (calculator.listOfInput.contains("*")==true){
      var locationOfMultiplySign=this.calculator.listOfInput.indexOf("*")
      var number1=this.calculator.listOfInput(locationOfMultiplySign-1).toDouble
      var number2=this.calculator.listOfInput(locationOfMultiplySign+1).toDouble
      var resultFromMultiplying:Double=number1*number2
      var (left,leftover)=this.calculator.listOfInput.splitAt(locationOfMultiplySign-1)
      left=left:+resultFromMultiplying.toString
      var right=leftover.drop(3)
      this.calculator.listOfInput=left++right
      println(this.calculator.listOfInput)
    }
    while (calculator.listOfInput.contains("+")==true){
      var locationOfAddSign=this.calculator.listOfInput.indexOf("+")
      var number1=this.calculator.listOfInput(locationOfAddSign-1).toDouble
      var number2=this.calculator.listOfInput(locationOfAddSign+1).toDouble
      var resultFromAdding:Double=number1+number2
      var (left,leftover)=this.calculator.listOfInput.splitAt(locationOfAddSign-1)
      left=left:+resultFromAdding.toString
      var right=leftover.drop(3)
      this.calculator.listOfInput=left++right
      println(this.calculator.listOfInput)
    }
    while (calculator.listOfInput.contains("-")==true){
      var locationOfSubtractSign=this.calculator.listOfInput.indexOf("-")
      var number1=this.calculator.listOfInput(locationOfSubtractSign-1).toDouble
      var number2=this.calculator.listOfInput(locationOfSubtractSign+1).toDouble
      var resultFromSubtracting:Double=number1-number2
      var (left,leftover)=this.calculator.listOfInput.splitAt(locationOfSubtractSign-1)
      left=left:+resultFromSubtracting.toString
      var right=leftover.drop(3)
      this.calculator.listOfInput=left++right
      println(this.calculator.listOfInput)
    }
    this.calculator.display=this.calculator.listOfInput(0)
    displayToUser()
  }

  def displayToUser():String={
    this.calculator.display
  }

}
