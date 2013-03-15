package portedtograils

/**
 * Created by IntelliJ IDEA.
 * User: emilsandin
 * Date: 2013-03-13
 * Time: 15.16
 * To change this template use File | Settings | File Templates.
 */
class HomeTests extends functionaltestplugin.FunctionalTestCase {
    void testSearch() {
        get('http://www.twitter.com')

        click "Search"

        assertStatus 200
        assertContentContains "search"

        form('searchForm') { q = "#grails" click "Search" }

        assertStatus 200
        assertContentContains "#grails"
    }
}