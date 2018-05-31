/*
package typingAssist

import com.jetbrains.rider.test.TypingAssistTestBase
import com.jetbrains.rider.test.scriptingApi.typeOrCallAction
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class FSharpTypingAssistTest: TypingAssistTestBase() {

    override fun getSolutionDirectoryName(): String = "CoreConsoleApp"

    @DataProvider(name = "testTypingAssists")
    fun testTypingAssists() = arrayOf(
            arrayOf("closingBrace1", "{"),
            arrayOf("parentheses1", "("),
            arrayOf("quotes1", "\""),
            arrayOf("closingAngleBracket1", "<")
    )

    @Test(dataProvider = "testTypingAssists")
    fun testTyping(caseName: String, input: String) {
        dumpOpenedEditor("Program.fs", "Program.fs") {
            typeOrCallAction(input)
        }
    }

}*/
