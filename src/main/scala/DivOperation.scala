class DivOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    if(b==0) throw new Exception(" b can't be zero ")
    a/b
  }

}
