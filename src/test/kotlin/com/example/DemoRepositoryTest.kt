package com.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject


@MicronautTest
class DemoRepositoryTest {
    @Inject
    lateinit var demoRepository: DemoRepository

    @Test
    fun `Show the problem`() {
        val result = demoRepository.demoQuery()
        Assertions.assertNotNull(result)
        Assertions.assertTrue(result.isNotEmpty())
    }
}