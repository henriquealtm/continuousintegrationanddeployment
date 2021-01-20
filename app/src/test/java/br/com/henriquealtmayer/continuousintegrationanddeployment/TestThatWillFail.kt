package br.com.henriquealtmayer.continuousintegrationanddeployment

import org.junit.Assert
import org.junit.Test


class TestThatWillFail {

    @Test
    fun fail_test() {
        Assert.assertEquals(5, 2 + 2)
    }

}