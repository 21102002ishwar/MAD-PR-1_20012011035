
fun main(args:Array<String>){
    println("--------------------------------")
    var ary:IntArray = intArrayOf(15, 7, 12, 27, 11, 4)
    var max_num = ary[0]
    for (i in ary){
        if (i > max_num){
            max_num = i
        }
    }
    println("Array:")
    for(i in ary){
        print(""+ i +" ")
    }
    println("\n--------------------------------")
    println("Maximum Number: "+max_num) }