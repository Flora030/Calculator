package calculator.differentTypesOfButton

import calculator.function.calculatorFunction
import javafx.event.{ActionEvent, EventHandler}

class subtractButton(calculator:calculatorFunction) extends EventHandler[ActionEvent]{
  override def handle(event: ActionEvent): Unit = {
    calculator.subtractButtonPressed()
  }
}
