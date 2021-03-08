package lc_mar

import java.util.*

internal class Pair<U, V>(var first: U, var second: V)

internal class Bucket {
    private val bucket: MutableList<Pair<Int, Int>>

    operator fun get(key: Int): Int {
        for (pair in bucket) {
            if (pair.first == key) return pair.second
        }
        return -1
    }

    fun update(key: Int, value: Int) {
        var found = false
        for (pair in bucket) {
            if (pair.first == key) {
                pair.second = value
                found = true
            }
        }
        if (!found) bucket.add(Pair(key, value))
    }

    fun remove(key: Int) {
        for (pair in bucket) {
            if (pair.first == key) {
                bucket.remove(pair)
                break
            }
        }
    }

    init {
        bucket = LinkedList()
    }
}

class MyHashMap {
    private val keySpace = 2069
    private val hashTable: MutableList<Bucket> = mutableListOf()

    fun put(key: Int, value: Int) {
        val hashKey = key % keySpace
        hashTable[hashKey].update(key, value)
    }

    operator fun get(key: Int): Int {
        val hashKey = key % keySpace
        return hashTable[hashKey][key]
    }

    fun remove(key: Int) {
        val ha = key % keySpace
        hashTable[ha].remove(key)
    }

    init {
        for (i in 0 until keySpace) {
            hashTable.add(Bucket())
        }
    }
}