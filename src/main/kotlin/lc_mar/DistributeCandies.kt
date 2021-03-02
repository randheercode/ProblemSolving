package lc_mar

class DistributeCandies {
    fun distributeCandies(candyType: IntArray): Int {
        val distinct = candyType.toSet().size
        return minOf(distinct, candyType.size / 2)
    }
}