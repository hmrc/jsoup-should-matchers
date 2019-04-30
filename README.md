
# jsoup-should-matchers

This library was derived from [The Guardian's original jsoup matchers library](https://github.com/guardian/jsoup-should-matchers).

It provides should-matchers compatible with [ScalaTest](http://www.scalatest.org/), for making assertions about HTML fragments.

Example
-------

    class HelloWorldTest extends FunSuite with JsoupShouldMatchers {

      test("withName") {

        "<div><p>Hello, world!</p></div>".asBodyFragment should include element withName("p")

        "<div><p>Hello, world!</p></div>".asBodyFragment should not include element (withName("img"))
      }

    }

More examples in `JsoupShouldMatchersTest`.

### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
