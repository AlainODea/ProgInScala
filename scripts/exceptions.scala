val n = 4

val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundException => ex.printStackTrace() // handle missing file
  case ex: IOException => ex.printStackTrace() // Handle other I/O error
}

import java.io.FileReader

val file = new FileReader("input.txt")
try {
  // Use the file
} finally {
  file.close() // Be sure to close the file
}

// WARNING: this returns 1 (unlike similar Java code)
// Code like this is terrible style anyway, so I'm unconcerned
def f(): Int = try { return 1} finally { return 2 }

import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }

// WARNING: returns 1 like f()
def g(): Int = try { 1 } finally { 2 }
