package lc_mar

class ShortEncodingWords {
    fun minimumLengthEncoding(words: Array<String>): Int {
        val words = words.sortedByDescending { it.length }
        val encoded = StringBuilder()
        for (w in words) {
            val wordWithSuffix = "${w}#"
            val indexInEncoded = encoded.indexOf(wordWithSuffix)
            if (indexInEncoded < 0) {
                encoded.append(wordWithSuffix)
            }
        }
        return encoded.length
    }
}