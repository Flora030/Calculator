package calculator.function
import scala.collection.mutable.ListBuffer

class calculatorFunction (val width:Int,val height:Int){
  var numberString=""
  var display:String=""
  var listOfInput:List[String]=List()

  var state:State=new operatorPressed(this)

  def numberButtonPressed(number:Int): Unit ={
    this.state.numberButtonPressed(number)
  }

  def addButtonPressed():Unit={
    this.state.addButtonPressed()
  }

  def subtractButtonPressed():Unit={
    this.state.subtractButtonPressed()
  }

  def multiplyButtonPressed():Unit={
   this.state.multiplyButtonPressed()
  }

  def divideButtonPressed():Unit={
    this.state.divideButtonPressed()
  }

  def decimalButtonPressed():Unit={
    this.state.decimalButtonPressed()
  }

  def backspaceButtonPressed():Unit={
    this.state.backspaceButtonPressed()
  }

  def clearButtonPressed():Unit={
    this.state.clearButtonPressed()
  }

  def enterButtonPressed():Unit={
    this.state.enterButtonPressed()
  }

  def displayToUser():String={
    this.state.displayToUser()
  }
}
