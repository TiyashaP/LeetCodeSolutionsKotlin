class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramMap=mutableMapOf<String, MutableList<String>>()
        strs.forEach()
        { word ->
             val indexArray=IntArray(26)
              word.forEach()
                {
                    ch->indexArray[ch-'a']++
                }
              val key=indexArray.joinToString()
              anagramMap.getOrPut(key){mutableListOf()}.add(word)
            }
            return anagramMap.values.toList()
    }
}
