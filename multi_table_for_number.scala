def multiTable(n: Int): String = {
  var table: String = ""
  for i <- 1 to 10
  do
    table = table + s"$i * $n = " + (i * n) + "\n"
  return table.dropRight(1)
}
