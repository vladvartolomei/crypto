package com.vladv.crypto

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CaesarTest extends FunSuite {
  test("Caesar cypher for ASDASDASDAS is FXIFXIFXIFX with key = 5") {
    assert("FXIFXIFXIFX" == CaesarCypher.encrypt("ASDASDASDAS", 5))
  }

  test("Caesar cypher for CRIPTOGRAFIE is QWEQWEQWEQW with key = 7") {
    assert("JYPWAVNYHMPL" == CaesarCypher.encrypt("CRIPTOGRAFIE", 7))
  }

  test("Caesar decypher for FXIFXIFXIFX is ASDASDASDAS with key = 5") {
    assert("ASDASDASDAS" == CaesarCypher.decrypt("FXIFXIFXIFX", 5))
  }

  test("Caesar decypher for JYPWAVNYHMPL is CRIPTOGRAFIE with key = 7") {
    assert("CRIPTOGRAFIE" == CaesarCypher.decrypt("JYPWAVNYHMPL", 7))
  }

}
