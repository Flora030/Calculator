package calculator.gui
import scalafx.animation.AnimationTimer
import javafx.scene.input.MouseEvent
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.TextField
import scalafx.scene.layout.GridPane
import calculator.function.calculatorFunction
import calculator.differentTypesOfButton.numberButton
import calculator.differentTypesOfButton._

object GUI extends JFXApp {

  var displayArea= new TextField{
    editable = false
    style = "-fx-font: 20 ariel;"
  }

  val calculator:calculatorFunction=new calculatorFunction(40,40)

  val button0 = new calculatorButtons("0",12,calculator,new numberButton(calculator,0))
  val button1 = new calculatorButtons("1",12,calculator,new numberButton(calculator,1))
  val button2 = new calculatorButtons("2",12,calculator,new numberButton(calculator,2))
  val button3 = new calculatorButtons("3",12,calculator,new numberButton(calculator,3))
  val button4 = new calculatorButtons("4",12,calculator,new numberButton(calculator,4))
  val button5 = new calculatorButtons("5",12,calculator,new numberButton(calculator,5))
  val button6 = new calculatorButtons("6",12,calculator,new numberButton(calculator,6))
  val button7 = new calculatorButtons("7",12,calculator,new numberButton(calculator,7))
  val button8 = new calculatorButtons("8",12,calculator,new numberButton(calculator,8))
  val button9 = new calculatorButtons("9",12,calculator,new numberButton(calculator,9))
  val addButton = new calculatorButtons("+",12,calculator,new addButton(calculator))
  val subtractButton = new calculatorButtons("-",12,calculator,new subtractButton(calculator))
  val mulitplyButton = new calculatorButtons("*",12,calculator,new multiplyButton(calculator))
  val divideButton = new calculatorButtons("/",12,calculator,new divideButton(calculator))
  val decimalButton =  new calculatorButtons(".",12,calculator,new decimalButton(calculator))
  val enterButton = new calculatorButtons("=",12,calculator,new enterButton(calculator))
  val clearButton = new calculatorButtons("clear",12,calculator,new clearButton(calculator))
  val backspaceButton = new calculatorButtons("backspace",12,calculator,new backspaceButton(calculator))


  this.stage=new PrimaryStage{
    this.title="Calculator"
    this.scene=new Scene(){
      this.content = List(
        new GridPane{
          hgap = 0.0
          vgap = 0.0

          add(displayArea,0,0,5,1)

          add(button0, 0, 1)
          add(button1, 1, 1)
          add(button2, 2, 1)
          add(button3, 0, 2)
          add(button4, 1, 2)
          add(button5, 2, 2)
          add(button6, 0, 3)
          add(button7, 1, 3)
          add(button8, 2, 3)

          add(clearButton, 0, 4)
          add(backspaceButton, 1, 4)
          add(enterButton, 2, 4)

          add(addButton, 3, 1)
          add(subtractButton, 3, 2)
          add(mulitplyButton, 3, 3)
          add(divideButton, 3, 4)
          add(decimalButton,3,5)
        }
      )
    }
    updateDisplay()
    addEventFilter(MouseEvent.MOUSE_CLICKED, (_: MouseEvent) => {
      updateDisplay()
    })
  }

  def updateDisplay(): Unit = {
    displayArea.text.value = calculator.displayToUser()
  }

}
