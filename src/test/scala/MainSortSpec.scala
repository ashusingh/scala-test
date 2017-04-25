import org.scalatest.{Matchers, WordSpec}


class MainSortSpec extends WordSpec with Matchers {

  "MainSort" should {
    "sort a given list of names in order of first 2 characters" in {

      MainSort.sortLastNames(List(
        "Mozart",
        "Beethoven",
        "Bach"
      )) shouldBe List(
        "Bach",
        "Beethoven",
        "Mozart"
      )


      MainSort.sortLastNames(List(
        "Hilbert",
        "Godel",
        "Poincare",
        "Ramanujan",
        "Pochhammmer"
      )) shouldBe List(
        "Godel",
        "Hilbert",
        "Poincare",
        "Pochhammmer",
        "Ramanujan"
      )


      MainSort.sortLastNames(List(
        "poincare",
        "Poincare"
      )) shouldBe List(
        "Poincare",
        "poincare"
      )

    }
    "remove any empty inputs" in {
      MainSort.sortLastNames(List(
        "poincare",
        "",
        "Poincare"
      )) shouldBe List(
        "Poincare",
        "poincare"
      )
    }
  }

}
