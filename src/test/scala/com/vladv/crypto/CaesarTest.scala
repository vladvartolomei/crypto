package com.vladv.crypto

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CaesarTest extends FunSuite {
  test("Caesar cypher for ASDASDASDAS is QWEQWEQWEQW with key = 5") {
    assert("QWEQWEQWEQW" == CaesarCypher.encrypt("ASDASDASDAS", 5))
  }
}
