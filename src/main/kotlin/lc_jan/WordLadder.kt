package lc_jan

import java.util.*
import java.util.function.Consumer


// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3598/
class WordLadder() {
    private var L = 0
    private var allComboDict: MutableMap<String, MutableList<String>>? = null

    init {
        L = 0
        allComboDict = HashMap()
    }

    private fun visitWordNode(
        Q: Queue<Pair<String, Int>>,
        visited: MutableMap<String, Int>,
        othersVisited: Map<String, Int>
    ): Int {
        val node = Q.remove()
        val word: String = node.first
        val level: Int = node.second
        for (i in 0 until L) {

            // Intermediate words for current word
            val newWord = word.substring(0, i) + '*' + word.substring(i + 1, L)

            // Next states are all the words which share the same intermediate state.
            for (adjacentWord in allComboDict!!.getOrDefault(newWord, ArrayList())) {
                // If at any point if we find what we are looking for
                // i.e. the end word - we can return with the answer.
                if (othersVisited.containsKey(adjacentWord)) {
                    return level + othersVisited[adjacentWord]!!
                }
                if (!visited.containsKey(adjacentWord)) {

                    // Save the level as the value of the dictionary, to save number of hops.
                    visited[adjacentWord] = level + 1
                    Q.add(Pair(adjacentWord, level + 1))
                }
            }
        }
        return -1
    }

    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        if (!wordList.contains(endWord)) {
            return 0
        }

        // Since all words are of same length.
        L = beginWord.length
        wordList.forEach(
            Consumer { word: String ->
                for (i in 0 until L) {
                    // Key is the generic word
                    // Value is a list of words which have the same intermediate generic word.
                    val newWord = word.substring(0, i) + '*' + word.substring(i + 1, L)
                    val transformations = allComboDict!!.getOrDefault(newWord, ArrayList())
                    transformations.add(word)
                    allComboDict!![newWord] = transformations
                }
            })

        // Queues for birdirectional BFS
        // BFS starting from beginWord
        val Q_begin: Queue<Pair<String, Int>> = LinkedList()
        // BFS starting from endWord
        val Q_end: Queue<Pair<String, Int>> = LinkedList()
        Q_begin.add(Pair(beginWord, 1))
        Q_end.add(Pair(endWord, 1))

        // Visited to make sure we don't repeat processing same word.
        val visitedBegin: MutableMap<String, Int> = HashMap()
        val visitedEnd: MutableMap<String, Int> = HashMap()
        visitedBegin[beginWord] = 1
        visitedEnd[endWord] = 1
        while (!Q_begin.isEmpty() && !Q_end.isEmpty()) {

            // One hop from begin word
            var ans = visitWordNode(Q_begin, visitedBegin, visitedEnd)
            if (ans > -1) {
                return ans
            }

            // One hop from end word
            ans = visitWordNode(Q_end, visitedEnd, visitedBegin)
            if (ans > -1) {
                return ans
            }
        }
        return 0
    }
}