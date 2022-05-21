package calculator

import org.scalatest.FunSuite
import calculator.function.calculatorFunction

class Test extends FunSuite{
  test("Check numberButtonPressed()"){
    var testcalculatorFunction=new calculatorFunction(10,12)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.addButtonPressed()
    testcalculatorFunction.numberButtonPressed(1)
    testcalculatorFunction.numberButtonPressed(0)
    testcalculatorFunction.multiplyButtonPressed()
    testcalculatorFunction.numberButtonPressed(3)
    var x:Unit=testcalculatorFunction.enterButtonPressed()
    var output:Double=testcalculatorFunction.display.toDouble
    assert(Math.abs(output - 20.0) < 0.001)
  }

  test("Check clearPressed()"){
    var testcalculatorFunction=new calculatorFunction(10,12)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.addButtonPressed()
    testcalculatorFunction.clearButtonPressed()
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.addButtonPressed()
    testcalculatorFunction.numberButtonPressed(1)
    testcalculatorFunction.enterButtonPressed()
    var output:Double=testcalculatorFunction.display.toDouble
    assert(Math.abs(output - 56.0) < 0.001)
  }

  test("Continue from output"){
    var testcalculatorFunction=new calculatorFunction(10,12)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.addButtonPressed()
    testcalculatorFunction.clearButtonPressed()
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.numberButtonPressed(5)
    testcalculatorFunction.addButtonPressed()
    testcalculatorFunction.numberButtonPressed(1)
    testcalculatorFunction.enterButtonPressed()
    testcalculatorFunction.divideButtonPressed()
    testcalculatorFunction.numberButtonPressed(2)
    testcalculatorFunction.enterButtonPressed()
    var output=testcalculatorFunction.display.toDouble
    assert(Math.abs(output - 28.0) < 0.001)
  }

  test("Backspace Works from Continue from output") {
    var testcalculatorFunction = new calculatorFunction(10, 12)
    //Press 5 (5)
    testcalculatorFunction.numberButtonPressed(5)
    //Press 5 (55)
    testcalculatorFunction.numberButtonPressed(5)
    //Press + (55+)
    testcalculatorFunction.addButtonPressed()
    //Press 1 (55+1)
    testcalculatorFunction.numberButtonPressed(1)
    //Press = (56.0)
    testcalculatorFunction.enterButtonPressed()
    //Press / (56.0/)
    testcalculatorFunction.divideButtonPressed()
    //Press 2 (56.0/2)
    testcalculatorFunction.numberButtonPressed(2)
    //Press = (28.0)
    testcalculatorFunction.enterButtonPressed()
    //Press backspace (28.)
    testcalculatorFunction.backspaceButtonPressed()
    //Press 5 (28.5)
    testcalculatorFunction.numberButtonPressed(5)
    //Press backspace (28.)
    testcalculatorFunction.backspaceButtonPressed()
    //Press 9 (28.9)
    testcalculatorFunction.numberButtonPressed(9)
    //Press - (28.9-)
    testcalculatorFunction.subtractButtonPressed()
    //Press 1 (28.9-1)
    testcalculatorFunction.numberButtonPressed(1)
    //Press 0 (28.9-10)
    testcalculatorFunction.numberButtonPressed(0)
    //Press = (18.9)
    testcalculatorFunction.enterButtonPressed()
    var output = testcalculatorFunction.display.toDouble
    assert(Math.abs(output - 18.9) < 0.001)
  }

  test("Decimal Pressed"){
    var testcalculatorFunction=new calculatorFunction(10,12)
    //Press 5 (5)
    testcalculatorFunction.numberButtonPressed(5)
    assert(testcalculatorFunction.display=="5")
    //Press . (5.)
    testcalculatorFunction.decimalButtonPressed()
    assert(testcalculatorFunction.display=="5.")
    //Press 2 (5.2)
    testcalculatorFunction.numberButtonPressed(2)
    assert(testcalculatorFunction.display=="5.2")
    //Press / (5.2/)
    testcalculatorFunction.divideButtonPressed()
    assert(testcalculatorFunction.display=="5.2/")
    //Press 2 (5.2/2)
    testcalculatorFunction.numberButtonPressed(2)
    assert(testcalculatorFunction.display=="5.2/2")
    //Press . (5.2/2.)
    testcalculatorFunction.decimalButtonPressed()
    assert(testcalculatorFunction.display=="5.2/2.")
    //Press 6 (5/2/2.6)
    testcalculatorFunction.numberButtonPressed(6)
    assert(testcalculatorFunction.display=="5.2/2.6")
    //Press = (2.0)
    testcalculatorFunction.enterButtonPressed()
    var output = testcalculatorFunction.display.toDouble
    assert(Math.abs(output - 2.0) < 0.001)
  }

  test("Backspace with Decimal"){
    var testcalculatorFunction=new calculatorFunction(10,12)
    testcalculatorFunction.numberButtonPressed(5)
    assert(testcalculatorFunction.display=="5")
    testcalculatorFunction.decimalButtonPressed()
    assert(testcalculatorFunction.display=="5.")
    testcalculatorFunction.numberButtonPressed(5)
    assert(testcalculatorFunction.display=="5.5")
    testcalculatorFunction.backspaceButtonPressed()
    assert(testcalculatorFunction.display=="5.")
    testcalculatorFunction.numberButtonPressed(2)
    assert(testcalculatorFunction.display=="5.2")
  }
}
