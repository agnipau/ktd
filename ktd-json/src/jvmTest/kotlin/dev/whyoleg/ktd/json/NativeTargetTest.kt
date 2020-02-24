package dev.whyoleg.ktd.json

import kotlin.test.*

internal class NativeTargetTest {
    @Test
    fun win32() {
        assertEquals(NativeTarget.Win86, NativeTarget.target("windows server 2018", "x86", ""))
    }

    @Test
    fun win64() {
        assertEquals(NativeTarget.Win64, NativeTarget.target("windows server 2018", "64", ""))
    }

    @Test
    fun linux() {
        assertEquals(NativeTarget.Linux, NativeTarget.target("Linux", "amd64", ""))
    }

    @Test
    fun macos() {
        assertEquals(NativeTarget.MacOS, NativeTarget.target("macos", "64", ""))
    }

    @Test
    fun android() {
        assertEquals(NativeTarget.Android, NativeTarget.target("linux", "i686", "The Android Project"))
    }
}
