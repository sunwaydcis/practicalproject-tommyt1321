import scalafx.beans.property.StringProperty

val aString = new StringProperty("sunway") //publisher
val bString = new StringProperty("monash") //subscriber

bString <== aString
aString.onChange((a, b, c) => {
  println("aString changed from " + b + " to " + c)
})
aString.onChange((_, _, c) => {
  println(c + " is updated in aString")
})
aString.value = "segi"
bString.value = "monash"
println(aString.value)
println(bString.value)

val add: (Int, Int) => Int = (_, _) =>
  12
println(add(1,2))
