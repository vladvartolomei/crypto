package com.vladv.crypto

object CaesarCypher {

  def maxAlphabetLength :Int = 26

  private def positiveModulo(x :Int, n :Int) : Int = (x % n + n) % n

  def encrypt(plain :String, key : Int) :String = {
    plain
      .map(_.toUpper.toInt)
      .map( asciiCode => positiveModulo(asciiCode - 'A'.toInt + key, maxAlphabetLength) + 'A'.toInt toChar)
      .foldLeft("")( _ + _ )
  }

  def decrypt(encrypted :String, key :Int) :String = {
    encrypted
      .map(_.toUpper.toInt)
      .map( asciiCode => positiveModulo(asciiCode - 'A'.toInt - key, maxAlphabetLength) + 'A'.toInt toChar)
      .foldLeft("")( _ + _ )
  }

  def decrypt(encrypted :String) :String = {
    ( 0 until maxAlphabetLength).map(decrypt(encrypted, _))
    .foldLeft("")( _ + "\n" +_ )
  }

}
