package oop_00000130569_MuhamadZhakyAlamsyah.Week_08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak ID dan Name pake requireNotNull
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Warranty pake as? Int dengan fallback Elvis 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Size pake as? String dengan fallback Elvis "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null // Jika tipe selain itu atau null, return null
        }
    }