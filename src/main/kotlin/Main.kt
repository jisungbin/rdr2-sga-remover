package land.sungbin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import okio.FileSystem
import okio.Path.Companion.toPath
import kotlin.time.Duration.Companion.minutes

private val PATH = "C:\\Users\\ji\\Documents\\Rockstar Games\\Red Dead Redemption 2\\Settings".toPath()
private const val SGA_EXTENSION = "sga_"
private val DELETION_DELAY = 5.minutes

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    runBlocking(Dispatchers.IO) {
        while (true) {
            val sgas = FileSystem.SYSTEM.list(PATH).filter { it.name.startsWith(SGA_EXTENSION) }
            for (i in sgas.indices) {
                println("DELETION: ${sgas[i].name}")
                FileSystem.SYSTEM.delete(sgas[i])
            }
            delay(DELETION_DELAY)
        }
    }
}
