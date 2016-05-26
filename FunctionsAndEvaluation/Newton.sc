//scala code for applying Newton's method to approximate square root of digit
def sqrt(x:Double)= {

  def sqrtIter(guess:Double, x:Double):Double =
    if(isGoodEnough(guess,x))guess
    else sqrtIter(improve(guess,x),x)

  def isGoodEnough(guess:Double, x:Double)=
    math.abs(guess*guess-x)/x<0.001

  def improve(guess:Double, x:Double)=
    (guess+x/guess)/2

  //return value
  sqrtIter(1.0,x)

}


sqrt(2)
sqrt(3)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)