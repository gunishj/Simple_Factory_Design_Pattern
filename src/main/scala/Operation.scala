trait Operation {
  def getResult(a: Double, b: Double): Double
}

//simple factory method
//also known as companion object apply method
object Operation{
  def apply(op:String):Operation = op  match {
    case "+" => new AddOperation()
    case "-" => new SubOperation()
    case "*" => new MulOperation()
    case "/" => new DivOperation()
  }
}

