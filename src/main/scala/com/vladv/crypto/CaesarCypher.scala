package com.vladv.crypto

object CaesarCypher {

  def encrypt(plain :String, key : Int) :String = {
    plain
      .map(_.toUpper.toInt)
      .map( asciiCode => ((asciiCode - 'A'.toInt) + key) % 26 + 'A'.toInt)
      .foldLeft("")( _ :+ _.toChar)
  }

  def decrypt(encrypted :String, key :Int) :String = {
    encrypted
      .map(_.toUpper.toInt)
      .map( asciiCode =>((((asciiCode - 'A'.toInt) - key) % 26) + 26) % 26)
      .map( asciiInt => asciiInt + 'A'.toInt)
      .foldLeft("")( _ :+ _.toChar)
  }

}
