import forcomp.Anagrams._
val sentence = List("lin","uxa")
val sencur=sentenceOccurrences(sentence)
sencur.toMap
val y=List(('a',1), ('l',1))
subtract(sencur,y)
val comb=combinations(sencur)
comb.flatMap(x=>dictionaryByOccurrences(x))
comb.flatMap(x=>dictionaryByOccurrences(x).map(y=>(y,subtract(sencur,x))))
def iter(senCur:Occurrences):List[Sentence]=
  if(senCur.isEmpty) List(List())
  else
  { /*val comb=combinations(senCur)
      comb.flatMap(x=>dictionaryByOccurrences(x).flatMap(y=>iter(subtract(senCur,x)).map(z=>y::z)))}*/
    for{
      comb<-combinations(senCur)
      word<-dictionaryByOccurrences(comb)
      rest<-iter(subtract(senCur,comb))
    } yield word::rest
  }
iter(sencur)
sentenceAnagrams(sentence)
