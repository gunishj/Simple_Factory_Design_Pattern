object App extends App{
  println("Welcome to simple Operations Factory")
  val op = Operation("*")
  val result = op.getResult(1,2)
  println(result)

}
