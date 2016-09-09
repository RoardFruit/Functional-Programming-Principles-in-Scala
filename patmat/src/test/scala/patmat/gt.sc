import patmat.Huffman
import patmat.Huffman._

Huffman.decodedSecret.foreach(print)
val t3=createCodeTree("aabc".toList)
encode(t3)("aabc".toList)
quickEncode(t3)("aabc".toList)
convert(t3)