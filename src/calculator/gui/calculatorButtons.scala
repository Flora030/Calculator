package calculator.gui
import scalafx.scene.control.Button
import calculator.function.calculatorFunction
import javafx.event.{ActionEvent, EventHandler}

class calculatorButtons(val buttonText:String, val textSize:Int, val calculatorClass:calculatorFunction, action: EventHandler[ActionEvent]) extends Button{
  minWidth = 90
  minHeight = 60
  this.text=buttonText
  this.style="-fx-font: 12 ariel"
  this.onAction=action
}
