package calculator.differentTypesOfButton

import calculator.function.calculatorFunction
import javafx.event.{ActionEvent, EventHandler}

class enterButton(calculator:calculatorFunction) extends EventHandler[ActionEvent]{
  override def handle(event: ActionEvent): Unit = {
    calculator.enterButtonPressed()
  }
}
