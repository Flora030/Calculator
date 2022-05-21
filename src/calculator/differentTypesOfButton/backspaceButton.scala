package calculator.differentTypesOfButton

import calculator.function.calculatorFunction
import javafx.event.{ActionEvent, EventHandler}

class backspaceButton(calculator:calculatorFunction) extends EventHandler[ActionEvent]{
  override def handle(event: ActionEvent): Unit = {
    calculator.backspaceButtonPressed()
  }
}
