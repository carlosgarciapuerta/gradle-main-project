package es.kgp.mainmodule

import es.kgp.submodule.library.UselessUtility

class NonsenseService(val uselessUtility: UselessUtility) {

    fun translate(): String {
        return uselessUtility.doSomething().replace("something", "nothing")
    }

}
