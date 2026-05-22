package oop_00000130569_MuhamadZhakyAlamsyah.Week_13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        // Melakukan parsing data
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    }catch (e: Exception) {
        // Menangkap NumberFormatException, IndexOutOfBoundsException, dll.
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File histori transaksi tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val pathFile = "crypto_trades.csv"

    val initialTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 150.0, 45.5),
        TradeRecord(2, "ETHUSDT", "Short", 100.0, -12.3),
        TradeRecord(3, "SOLUSDT", "Long", 75.0, 22.1)
    )
    saveTrades(initialTrades, pathFile)

    File(pathFile).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades(pathFile)
    val totalPnl = loadedData.sumOf { it.pnl }
}