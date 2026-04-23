class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val orderArr=IntArray(26)
        for(i in order.indices)
        {
            orderArr[order[i]-'a']=i
        }
        for(i in 0 until words.size-1)
           {
            if(!inCorrectOrder(words[i],words[i+1],orderArr)) return false
           }
        return true
    }
 
    fun inCorrectOrder(a:String,b:String,orderArr:IntArray):Boolean{
        val minLen= if(a.length>b.length) b.length else a.length
        for(i in 0..minLen-1)
        {
            val ca=a[i]
            val cb=b[i]
            if(ca!=cb)
              return orderArr[ca-'a']<orderArr[cb-'a']
        }
        return a.length<=b.length


    }
}
