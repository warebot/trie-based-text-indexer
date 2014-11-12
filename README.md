# Trie based text indexer (Scala)
#####Currently Supports:
- Indexing (adding)
- Deletion (comming soon)

#####Example 
 

            c      b
           /      / \
          a      o   a
         / \    / \   \
        r   t  y   g    t

        Node(?,Some(List(
          Node(b,Some(List(
            Node(a,Some(List(
              Node(t,None)))),
            Node(o,Some(List(
              Node(g,None),
              Node(y,None))))))),
          Node(c,Some(List(
            Node(a,Some(List(
              Node(r,None),
              Node(t,None))))))))))
   
