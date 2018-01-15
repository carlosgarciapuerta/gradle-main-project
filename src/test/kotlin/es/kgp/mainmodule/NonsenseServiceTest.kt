package es.kgp.mainmodule

import es.kgp.submodule.library.UselessUtility
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NonsenseServiceTest {

    @Test
    fun `translate should replace something for nothing`() {
        assertEquals("Ey!!! I'm doing nothing...", NonsenseService(UselessUtility()).translate())
    }

}
