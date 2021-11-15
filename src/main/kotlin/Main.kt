import java.util.*
import kotlin.random.Random

private const val DEFAULT = 1
private const val PENALTY = 3
private val CONCURRENCY_STUDY = listOf("Nunu", "Jini", "Dan", "Dave", "Elvin", "Jess", "Joshua")

private val EXCLUDED_MEMBER = listOf("")

private val PENALTY_MEMBER = listOf("")

fun main(args: Array<String>) {
    CONCURRENCY_STUDY
        .filter { !EXCLUDED_MEMBER.contains(it) }
        .associateWith { (if (PENALTY_MEMBER.contains(it)) PENALTY else DEFAULT) }
        .map { entry -> List(entry.value) { entry.key } }
        .flatten()
        .shuffled(Random(Date().time))
        .take(1)
        .forEach {
            println("오늘의 발표자는")
            Thread.sleep(500)
            println("두구두구두구")
            Thread.sleep(1000L)
            println("${it}입니다!!!!! 우와아아아아아아아아!!!")
        }
}
