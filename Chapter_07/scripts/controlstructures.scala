def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

val filesHere = (new java.io.File("scripts")).listFiles

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

val forLineLengths =
  for {
    file <- filesHere
    if (file.getName.endsWith(".scala"))
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

def grep(pattern: String) {
  for {
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    val trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file +": "+ trimmed)
}

grep(".*gcd.*")

