package calculator.differentTypesOfButton
import calculator.function.calculatorFunction
import javafx.event.{ActionEvent, EventHandler}

class numberButton(calculator:calculatorFunction,theButtonPressed:Int) extends EventHandler[ActionEvent]{
    override def handle(event: ActionEvent): Unit = {
      calculator.numberButtonPressed(theButtonPressed)
    }
}
